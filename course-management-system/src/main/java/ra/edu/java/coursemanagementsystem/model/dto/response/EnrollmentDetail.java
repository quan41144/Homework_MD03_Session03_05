package ra.edu.java.coursemanagementsystem.model.dto.response;

import lombok.*;
import ra.edu.java.coursemanagementsystem.model.entity.Course;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class EnrollmentDetail {
    private Long enrollmentId;
    private String studentName;
    private Long courseId;
    private String courseTitle;
    private String instructorName;
}
