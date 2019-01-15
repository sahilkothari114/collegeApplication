package ac.university.collegeApplication.service.implementation;

import ac.university.collegeApplication.entity.Professor;
import ac.university.collegeApplication.repository.ProfessorRepository;
import ac.university.collegeApplication.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProfessorServiceImpl implements ProfessorService {

    @Autowired
    ProfessorRepository professorRepository;

    @Override
    public String add(Professor professor) {
        return null;
    }

    @Override
    public void delete(String professorId) {
        professorRepository.delete(professorId);
    }

    @Override
    public String update(Professor professor) {
        return null;
    }

    @Override
    public Professor select(String professorId) {
        return professorRepository.findOne(professorId);
    }
}
