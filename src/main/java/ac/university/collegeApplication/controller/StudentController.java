package ac.university.collegeApplication.controller;

import ac.university.collegeApplication.dto.DepartmentDTO;
import ac.university.collegeApplication.dto.ScoreDTO;
import ac.university.collegeApplication.dto.StudentDTO;
import ac.university.collegeApplication.entity.Department;
import ac.university.collegeApplication.entity.Score;
import ac.university.collegeApplication.entity.Student;
import ac.university.collegeApplication.entity.StudentSubject;
import ac.university.collegeApplication.service.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping(value = "/get/{studentId}", method = RequestMethod.GET)
    public StudentDTO getOne(@PathVariable("studentId")String studentId){
        Student student  = studentService.findOne(studentId);
        StudentDTO studentDTO= new StudentDTO();
        DepartmentDTO departmentDTO = new DepartmentDTO();
        BeanUtils.copyProperties(student,studentDTO);
        BeanUtils.copyProperties(student.getDepartment(),departmentDTO);
        studentDTO.setDepartment(departmentDTO);

        return studentDTO;
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<String> addStudent(@RequestBody StudentDTO studentDTO){
        Student student = new Student();
        Department department = new Department();
        BeanUtils.copyProperties(studentDTO.getDepartment(),department);
        BeanUtils.copyProperties(studentDTO, student);
        student.setDepartment(department);
        Student studentCreated  = studentService.add(student);
        return new ResponseEntity<String>(studentCreated.getStudentId(),HttpStatus.CREATED);
    }
    @GetMapping(value = "/getcurrentsemester")
    public double findAvgMarksCurSem(String studentid,String semester){
        return studentService.findAvgMarksCurrentSem(studentid,semester);
    }
    @RequestMapping(value = "/add-subject",method = RequestMethod.POST)
    public ResponseEntity<String> addSubject(@RequestBody StudentDTO studentDTO){

        Student student = new Student();
        Department department = new Department();
        BeanUtils.copyProperties(studentDTO.getDepartment(),department);
        BeanUtils.copyProperties(studentDTO, student);
        student.setDepartment(department);

        Iterator<ScoreDTO> iterator = studentDTO.getScoreList().iterator();
        List<Score> scoreList = new ArrayList<>();
        while (iterator.hasNext()){
            Score score = new Score();
            ScoreDTO scoreDTO1 =  iterator.next();
            BeanUtils.copyProperties(scoreDTO1, score);
            score.setMarksId(student.getStudentId()+"-"+score.getSubject().getSubjectId());
            scoreList.add(score);
        }
        student.setScoreList(scoreList);


        Student studentCreated  = studentService.add(student);
        return new ResponseEntity<String>(studentCreated.getStudentId(),HttpStatus.CREATED);
    }

}
