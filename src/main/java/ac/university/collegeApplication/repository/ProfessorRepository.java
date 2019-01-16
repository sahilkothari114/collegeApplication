package ac.university.collegeApplication.repository;

import ac.university.collegeApplication.entity.Professor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ProfessorRepository extends CrudRepository<Professor,String> {




}
