package ac.university.collegeApplication.controller;


import ac.university.collegeApplication.dto.DepartmentDTO;
import ac.university.collegeApplication.entity.Department;
import ac.university.collegeApplication.service.DepartmentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @RequestMapping(value = "/addDepartment",method = RequestMethod.POST)
    public String add(@RequestBody DepartmentDTO[] departmentDTO){
        for (DepartmentDTO d:departmentDTO
             ) {
            Department department=new Department();
            BeanUtils.copyProperties(d,department);
            departmentService.add(department);
        }

        return "added";
    }

    @GetMapping("/selectDepartment")
    public Department select(@RequestParam String departmentId)
    {
        return departmentService.select(departmentId);
    }



}
