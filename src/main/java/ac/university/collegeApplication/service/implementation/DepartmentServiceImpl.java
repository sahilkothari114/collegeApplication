package ac.university.collegeApplication.service.implementation;

import ac.university.collegeApplication.entity.Department;
import ac.university.collegeApplication.repository.DepartmentRepository;
import ac.university.collegeApplication.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public String add(Department department) {


        departmentRepository.save(department);
        return null;
    }

    @Override
    public void delete(String id) {
        departmentRepository.delete(id);
    }

    @Override
    public String update(Department department) {
        return null;
    }

    @Override
    public Department select(String id) {
        return departmentRepository.findOne(id);
    }
}
