package ac.university.collegeApplication.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class StudentSubjectID implements Serializable {
    private String studentId;
    private String subjectId;

}
