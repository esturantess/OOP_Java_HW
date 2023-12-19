package Service;

import Data.Student;
import Data.StudyGroup;
import Data.Teacher;

import java.util.List;

public class StudyGroupService {

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> studentList){
        return new StudyGroup(teacher, studentList);
    }
}
