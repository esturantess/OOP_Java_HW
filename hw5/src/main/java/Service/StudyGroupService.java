package Service;

import Data.Student;
import Data.StudyGroup;
import Data.Teacher;

import java.util.List;


public class StudyGroupService {
    private final StudyGroup studyGroup = new StudyGroup();
    private Integer maxGroupId = 0;

    public void createStudyGroup(Teacher teacher, List<Student> studentList) {
        studyGroup.setGroupId(++maxGroupId);
        studyGroup.setTeacher(teacher);
        studyGroup.setStudentList(studentList);
    }

    public StudyGroup getStudyGroup() {
        return studyGroup;
    }
}
