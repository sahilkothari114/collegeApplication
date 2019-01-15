package ac.university.collegeApplication.entity;

import lombok.Data;

import javax.persistence.*;
@Entity
public class Professor {
    @Id
    private String professorId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String conatactNumber;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "primary_department_id", nullable = false)
    private Department primaryDepartment;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "secondary_department_id", nullable = false)
    private Department secondaryDepartment;
}
