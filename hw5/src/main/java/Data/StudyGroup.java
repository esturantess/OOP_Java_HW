package Data;

import java.util.List;

public class StudyGroup {

    private Integer groupId;
    private Teacher teacher;
    private List<Student> StudentList;

    public Teacher getTeacher() {
        return teacher;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
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

    @Override
    public String toString() {
        return "StudyGroup{" +
                "groupId=" + groupId +
                ", teacher=" + teacher +
                ", StudentList=" + StudentList +
                '}';
    }
}