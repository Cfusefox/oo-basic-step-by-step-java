package practice11;



import java.util.ArrayList;
import java.util.List;

public class Klass {
    private String teacherName;
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

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void assignLeader(Student student) {
        if(memberList.indexOf(student) < 0) {
            System.out.print("It is not one of us.\n");
        } else {
            this.leader = student;
            String str = "I am " + teacherName + ". I know " + student.getName() + " become Leader of Class " + getNumber() + ".\n";
            System.out.print(str);
        }
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void appendMember(Student student) {
        this.memberList.add(student);
        String str = "I am " + teacherName + ". I know " + student.getName() + " has joined Class " + getNumber() + ".\n";
        System.out.print(str);
    }

    public Boolean isIn(ArrayList<String> classList) {
        if(classList.indexOf(String.valueOf(getNumber())) >= 0) {
            return true;
        }
        return false;
    }
}
