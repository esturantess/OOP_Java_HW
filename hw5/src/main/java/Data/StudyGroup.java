package Data;

import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> StudentList;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return StudentList;
    }

    public void setStudentList(List<Student> studentList) {
        StudentList = studentList;
    }

    public StudyGroup(Teacher teacher, List<Student> studentList) {
    }
}