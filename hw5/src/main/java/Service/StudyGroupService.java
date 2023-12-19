package Service;

import Data.Student;
import Data.StudyGroup;
import Data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    private List<Student> studentList;

    public StudyGroupService() {
        this.studentList = new ArrayList<>();
    }

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> studentList){
        return new StudyGroup(teacher, studentList);
    }
}
