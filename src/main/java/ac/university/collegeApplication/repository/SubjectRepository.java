package ac.university.collegeApplication.repository;

import ac.university.collegeApplication.entity.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject,String> {
}
