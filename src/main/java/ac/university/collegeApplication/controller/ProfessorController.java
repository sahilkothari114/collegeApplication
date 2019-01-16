package ac.university.collegeApplication.controller;
import ac.university.collegeApplication.dto.ProfessorDTO;
import ac.university.collegeApplication.entity.Department;
import ac.university.collegeApplication.entity.Professor;
import ac.university.collegeApplication.service.DepartmentService;
import ac.university.collegeApplication.service.ProfessorService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProfessorController {

    @Autowired
    ProfessorService professorService;
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/addProfessor")
    public String add(@RequestBody ProfessorDTO[] professorDTO){
        for (ProfessorDTO p:professorDTO
                ) {
            Professor professor=new Professor();
            BeanUtils.copyProperties(p,professor);
            professor.setPrimaryDepartment(departmentService.select(p.getPrimaryDepartmentId()));
            professor.setSecondaryDepartment(departmentService.select(p.getSecondaryDepartmentId()));
            professorService.add(professor);
        }

        return "added";
    }

    @GetMapping("/selectProfessor")
    public Professor selectDepartment(@RequestParam String departmentId)
    {
        return professorService.select(departmentId);
    }

    @DeleteMapping("/deleteProfessor")
    public void deleteDepartment(@RequestParam String departmentId)
    {
        professorService.delete(departmentId);
    }


}
