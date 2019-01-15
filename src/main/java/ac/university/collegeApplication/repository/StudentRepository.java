package ac.university.collegeApplication.repository;

import ac.university.collegeApplication.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,String> {
}
