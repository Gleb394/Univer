package entity;

import java.util.ArrayList;

public class Group {

    private String groupName;
    private ArrayList<Student> students;
    private Professor professors;
    private ArrayList<Integer> voteBasket;

    public Group(String groupName, ArrayList<Student> students) {
        this.groupName = groupName;
        this.students = students;
        voteBasket = new ArrayList<Integer>();
    }

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Professor getProfessors() {
        return professors;
    }

    public void setProfessors(Professor professors) {
        this.professors = professors;
    }

    public Student processElections(ArrayList<Student> candidates) {
        for (Student student : getStudents()) {
            voteBasket.add(student.vote(candidates));
        }
        Student elder = candidates.get(processElectionsResult(voteBasket));
        System.out.println("candidate elected " + elder.toString());
        return elder;
    }

    public int processElectionsResult(ArrayList<Integer> voteBasket) {
        int count = 1, tempCount;
        int popular = voteBasket.get(0);
        int temp = 0;
        for (int i = 0; i < (voteBasket.size() - 1); i++) {
            temp = voteBasket.get(i);
            tempCount = 0;
            for (int j = 1; j < voteBasket.size(); j++) {
                if (temp == voteBasket.get(j))
                    tempCount++;
            }
            if (tempCount > count) {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }

    @Override
    public String toString() {
        return "groupName='" + groupName;
    }
}
