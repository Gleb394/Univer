package factory;

import entity.Group;
import entity.Student;

import java.util.ArrayList;

public class GroupFactory {

    public Group getGroup(String nameGroup, ArrayList<Student> listStudent) {
        if (nameGroup == null) {
            return null;
        }
        if (nameGroup.equalsIgnoreCase("A")) {
            return new Group("A", listStudent);
        } else if (nameGroup.equalsIgnoreCase("B")) {
            return new Group("B", listStudent);
        }
        return null;
    }
}
