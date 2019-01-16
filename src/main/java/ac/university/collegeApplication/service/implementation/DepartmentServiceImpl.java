package ac.university.collegeApplication.service.implementation;

import ac.university.collegeApplication.entity.Department;
import ac.university.collegeApplication.repository.DepartmentRepository;
import ac.university.collegeApplication.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(readOnly = true,propagation = Propagation.REQUIRES_NEW)

public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    @Transactional(readOnly = false)
    public String add(Department department) {
        departmentRepository.save(department);
        return null;
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(String departmentId) {
        departmentRepository.delete(departmentId);
    }

    @Override
    @Transactional(readOnly = false)
    public String update(Department department) {
        return null;
    }

    @Override
    public Department select(String departmentId) {
        return departmentRepository.findOne(departmentId);
    }
}
