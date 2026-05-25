package ra.edu.java.coursemanagementsystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.edu.java.coursemanagementsystem.model.entity.Instructor;
import ra.edu.java.coursemanagementsystem.repository.InstructorRepo;
import ra.edu.java.coursemanagementsystem.service.InstructorService;

import java.util.List;

@Service
public class InstructorServiceImpl implements InstructorService {
    private final InstructorRepo instructorRepo;
    @Autowired
    public InstructorServiceImpl(InstructorRepo instructorRepo) {
        this.instructorRepo = instructorRepo;
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return instructorRepo.findAll();
    }

    @Override
    public Instructor getInstructorById(Long id) {
        return instructorRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Instructor with id " + id + " not found"));
    }

    @Override
    public Instructor createInstructor(Instructor instructor) {
        return instructorRepo.create(instructor);
    }

    @Override
    public Instructor updateInstructor(Long id, Instructor instructor) {
        return instructorRepo.update(id, instructor);
    }

    @Override
    public void deleteInstructorById(Long id) {
        instructorRepo.deleteById(id);
    }
}
