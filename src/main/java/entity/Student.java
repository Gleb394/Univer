package entity;

import java.util.ArrayList;

public class Student {

    private String firstName;
    private String LastName;
    private int averageMark;
    private String character;
    private Group group;
    private boolean presence;

    public Student(String firstName, String lastName, int averageMark, String character, Group group, boolean presence) {
        this.firstName = firstName;
        this.LastName = lastName;
        this.averageMark = averageMark;
        this.character = character;
        this.group = group;
        this.presence = presence;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    public String getCharacter() {
        return character;
    }

    public boolean isPresence() {
        return presence;
    }

    public void setPresence(boolean presence) {
        this.presence = presence;
    }

    public void setCharacter(String character) {
        this.character = character;

    }

    int vote(ArrayList<Student> candidates) {
        int votedNumber = (int) (Math.random() * candidates.size());
        return votedNumber;
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + ", LastName='" + LastName + ", averageMark=" + averageMark + ", character='" + character;
    }
}
