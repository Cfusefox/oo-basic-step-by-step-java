package practice09;

public class Student extends Person {

    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (this.equals(klass.getLeader())) {
            return basicIntroduce() + " I am Leader of " + klass.getDisplayName() + ".";
        }
        return basicIntroduce() + " I am at " + klass.getDisplayName() + ".";
    }

    private String basicIntroduce() {
        return super.introduce() + " I am a Student.";
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
