package practice06;

public class Teacher extends Person {
    private int klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (this.klass == 0) {
            return teach("No Class");
        }

        return teach("Class " + this.klass);
    }

    private String teach(String klass) {
        return super.introduce() + " I am a Teacher. I teach " + klass + ".";
    }
}
