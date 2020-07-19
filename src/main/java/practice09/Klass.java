package practice09;


import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> memberList = new ArrayList<>();
    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public void assignLeader(Student student) {
        if(memberList.indexOf(student) < 0) {
            System.out.print("It is not one of us.\n");
        } else {
            this.leader = student;
        }
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void appendMember(Student student) {
        this.memberList.add(student);
    }

}
