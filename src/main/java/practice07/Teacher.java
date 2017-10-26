package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (this.klass == null) {
            return teach("No Class");
        }

        return teach(this.klass.getDisplayName());
    }

    private String teach(String name) {
        return basicIntroduce() + " I teach " + name + ".";
    }

    private String doNotTeach(String name) {
        return basicIntroduce() + " I don't teach " + name + ".";
    }

    public String introduceWith(Student student) {
        if (student.getKlass().equals(this.klass)) {
            return teach(student.getName());
        }
        return doNotTeach(student.getName());
    }

    private String basicIntroduce() {
        return super.introduce() + " I am a Teacher.";
    }
}
