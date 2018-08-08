package Factory;

import entity.Group;
import entity.Student;

public class StudentFactory {

    public Student getStudent(String nameStudent) {
        if (nameStudent == null) {
            return null;
        }
        if (nameStudent.equalsIgnoreCase("Иван Кудряшов")) {
            return new Student("Иван", "Кудряшов", 3, "неряшливый, невнимательный, спортивный", new Group("A"),
                    false);
        } else if (nameStudent.equalsIgnoreCase("Лена Покровская")) {
            return new Student("Лена", "Покровская", 3, "неспортивный, внимательный, аккуратный", new Group("B"),
                    true);
        } else if (nameStudent.equalsIgnoreCase("Антон Новиков")) {
            return new Student("Антон", "Новиков", 4, "внимательный, аккуратный, неспортивный", new Group("A"),
                    true);
        } else if (nameStudent.equalsIgnoreCase("Оксана Гранкина")) {
            return new Student("Оксана", "Гранкина", 4, "внимательный, спортивный, аккуратный", new Group("A"),
                    true);
        } else if (nameStudent.equalsIgnoreCase("Лев Толстой")) {
            return new Student("Лев", "Толстой", 5, "спортивный, внимательный, аккуратный", new Group("B"),
                    true);
        } else if (nameStudent.equalsIgnoreCase("Инна Каренина")) {
            return new Student("Инна", "Каренина", 5, "внимательный, неспортивный, аккуратный", new Group("B"),
                    true);
        }
        return null;
    }

}
