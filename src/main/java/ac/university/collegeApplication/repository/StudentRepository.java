package ac.university.collegeApplication.repository;

import ac.university.collegeApplication.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student,String> {


    @Query(value="select avg(marks*credit)/(10*sum(credit)) from score inner join subject on score.subjectid=subject.subjectid where studentid= ?1 and semester= ?2",nativeQuery = true)
    double findAvgMarksCurrentSem(String studentid,String semester);

    @Query(value = "select avg(marks*credit)/(10*sum(credit)) from score inner join subject on score.subjectid=subject.subjectid where studentid= ?1",nativeQuery = true)
    double findAvgMarks(String studentid);

}
