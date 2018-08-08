package factory;

import entity.Group;
import entity.Professor;

public class ProfessorFactory {

    public Professor getProfessor(String nameProfessor, Group group) {
        if (nameProfessor == null) {
            return null;
        }
        if (nameProfessor.equalsIgnoreCase("Дмитрий Лазерев")) {
            return new Professor("Дмитрий", "Лазерев", group);
        } else if (nameProfessor.equalsIgnoreCase("Евгений Хно")) {
            return new Professor("Евгений", "Хно", group);
        }
        return null;
    }
}
