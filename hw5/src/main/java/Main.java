import Controller.Controller;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("1", "1","1","1");
        controller.createStudent("2", "2","2","2");
        controller.createStudent("3", "3","3","3");
        controller.createStudent("4", "4","4","4");
        controller.createTeacher("teacher", "teacher","howtoteacher", "01/12/89");
        List<Integer> idlist = new ArrayList<>();
        idlist.add(1);
        idlist.add(2);
        idlist.add(3);
        idlist.add(4);
        controller.createStudyGroup(1, idlist);
        controller.printStudyGroup();

    }
}