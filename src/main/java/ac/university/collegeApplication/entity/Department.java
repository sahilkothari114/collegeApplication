package ac.university.collegeApplication.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class Department {
    @Id
    private String departmentId;
    private String departmentName;
}
