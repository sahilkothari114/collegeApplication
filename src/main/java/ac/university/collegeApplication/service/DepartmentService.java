package ac.university.collegeApplication.service;

import ac.university.collegeApplication.entity.Department;

public interface DepartmentService {
    public String add(Department department);
    public void delete(String id);
    public String update(Department department);
    public Department select(String id);

}
