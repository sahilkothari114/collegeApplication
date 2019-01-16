//package ac.university.collegeApplication.controller;
//
//import ac.university.collegeApplication.entity.StudentSubject;
//import ac.university.collegeApplication.service.StudentSubjectService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/student-subject")
//public class StudentSubjectController {
//    @Autowired
//    StudentSubjectService studentSubjectService;
//    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
//    public ResponseEntity<List<StudentSubject>> findAll(){
//        return new ResponseEntity<List<StudentSubject>>(studentSubjectService.findAll(),HttpStatus.OK);
//    }
//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public ResponseEntity<String> addStudent(@RequestBody StudentSubject studentSubject){
//
//        StudentSubject studentCreated  = studentSubjectService.addSubject(studentSubject);
//        return new ResponseEntity<String>(studentCreated.getSubjectId(),HttpStatus.CREATED);
//    }
//}
