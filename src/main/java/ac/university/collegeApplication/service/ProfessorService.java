package ac.university.collegeApplication.service;


import ac.university.collegeApplication.entity.Professor;

public interface ProfessorService {
    public String add(Professor department);
    public void delete(String id);
    public String update(Professor department);
    public Professor select(String id);
}

