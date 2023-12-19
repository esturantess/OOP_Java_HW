package Controller;

import Data.*;
import Service.DataService;
import Service.StudyGroupService;
import View.StudentView;
import View.StudyGroupView;

import javax.swing.text.View;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudyGroupService studyGroupService = new StudyGroupService();
    private final StudentView studentView = new StudentView();
    private final StudyGroupView studyGroupView = new StudyGroupView();
    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName, String lastName, String dateB){
        service.create(firstName, secondName, lastName, dateB, Type.TEACHER);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            studentView.printOnConsole((Student) user);
        }
    }

    public void createStudyGroup (Integer teacherId, List<Integer> studentIdList){
        Teacher teacher = (Teacher) service.getUserById(Type.TEACHER, teacherId);
        List<Student> studentList = new ArrayList<>();
        for (Integer id: studentIdList){
            studentList.add((Student) service.getUserById(Type.STUDENT, id));
        }
        studyGroupService.createStudyGroup(teacher, studentList);
    }

    public void printStudyGroup(StudyGroup studyGroup){
        studyGroupView.printStudyGroup(studyGroup);
    }
}
