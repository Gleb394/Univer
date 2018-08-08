import Factory.ProfessorFactory;
import entity.Group;
import util.FormationGroup;

public class main {

    public static void main(String[] args) {

        Group group = new FormationGroup().getGroup("B");
        group.processElections(group.getStudents());
        System.out.println("________________________");

        new ProfessorFactory().getProfessor("Дмитрий Лазерев", group).rollCall();

    }
}
