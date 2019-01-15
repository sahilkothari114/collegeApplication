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
    public String add(Professor department) {
        return null;
    }

    @Override
    public void delete(String id) {
        professorRepository.delete(id);
    }

    @Override
    public String update(Professor department) {
        return null;
    }

    @Override
    public Professor select(String id) {
        return professorRepository.findOne(id);
    }
}
