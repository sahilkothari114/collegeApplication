package ac.university.collegeApplication.repository;

import ac.university.collegeApplication.entity.Professor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Repository
public interface ProfessorRepository extends CrudRepository<Professor,String> {

@Query(value = "select professorid,avg(marks*credits) from score inner join subject group by professorid order by professorid desc",nativeQuery = true)
    public Map<String, Double> findProfessorRank();


}
