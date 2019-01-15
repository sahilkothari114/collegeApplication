package ac.university.collegeApplication.repository;

import ac.university.collegeApplication.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department,String> {
}
