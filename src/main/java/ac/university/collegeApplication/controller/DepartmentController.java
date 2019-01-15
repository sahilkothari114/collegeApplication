package ac.university.collegeApplication.controller;


import ac.university.collegeApplication.dto.DepartmentDTO;
import ac.university.collegeApplication.entity.Department;
import ac.university.collegeApplication.service.DepartmentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;
    @RequestMapping("/addDepartment")
    public String add(@RequestBody DepartmentDTO[] departmentDTO){
        for (DepartmentDTO d:departmentDTO
             ) {
            Department department=new Department();
            BeanUtils.copyProperties(d,department);
            departmentService.add(department);
        }

        return "added";
    }


}
