package ac.university.collegeApplication.repository;

import ac.university.collegeApplication.entity.Professor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends CrudRepository<Professor,String> {




}
