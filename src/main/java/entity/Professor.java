package entity;

public class Professor {

    private String firstName;
    private String lastName;
    private Group group;

    public Professor(String firstName, String lastName, Group groups) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = groups;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String ferstName) {
        this.firstName = ferstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Group getGroups() {
        return group;
    }

    public void setGroups(Group groups) {
        this.group = group;
    }

    public Student rollCall() {
        for (Student student : getGroups().getStudents()) {
            System.out.println(student.getLastName());
            if (student.isPresence()) {
                System.out.println(student.getFirstName() + " " + student.getLastName() + "  Yes");
            } else if (!student.isPresence()) {
                System.out.println("-----");
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + ", lastName='" + lastName;
    }
}
