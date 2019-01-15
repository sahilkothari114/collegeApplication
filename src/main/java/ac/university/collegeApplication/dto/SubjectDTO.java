package ac.university.collegeApplication.dto;

import javax.persistence.Id;

public class SubjectDTO {
    public SubjectDTO() {
    }

    public SubjectDTO(String subjectId, String subjectName, int semester, int credits) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.semester = semester;
        this.credits = credits;
    }

    private String subjectId;
    private String subjectName;
    private int semester;
    private int credits;
    private DepartmentDTO departmentDTO;

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public DepartmentDTO getDepartmentDTO() {
        return departmentDTO;
    }

    public void setDepartmentDTO(DepartmentDTO departmentDTO) {
        this.departmentDTO = departmentDTO;
    }

    @Override
    public String toString() {
        return "SubjectDTO{" +
                "subjectId='" + subjectId + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", semester=" + semester +
                ", credits=" + credits +
                ", departmentDTO=" + departmentDTO +
                '}';
    }
}
