package util;

import factory.GroupFactory;
import factory.StudentFactory;
import entity.Group;
import entity.Student;

import java.util.ArrayList;

public class FormationGroup {

    GroupFactory groupFactory = new GroupFactory();

    public Group getGroup(String nameGroup) {

        ArrayList<Student> studentsListGroup = new ArrayList<Student>();

        for (Student student : studentsList()) {
            if (student.getGroup().getGroupName().equals(nameGroup)) {
                studentsListGroup.add(student);
            }
        }
        return groupFactory.getGroup(nameGroup, studentsListGroup);
    }

    private ArrayList<Student> studentsList() {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new StudentFactory().getStudent("Иван Кудряшов"));
        students.add(new StudentFactory().getStudent("Лена Покровская"));
        students.add(new StudentFactory().getStudent("Антон Новиков"));
        students.add(new StudentFactory().getStudent("Оксана Гранкина"));
        students.add(new StudentFactory().getStudent("Лев Толстой"));
        students.add(new StudentFactory().getStudent("Инна Каренина"));

        return students;
    }
}
