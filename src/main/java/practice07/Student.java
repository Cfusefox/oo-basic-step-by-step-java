package practice07;

public class Student extends  Person{
    private Klass _class;
    public Student(String name, int age, Klass _class) {
        super(name, age);
        this._class = _class;
    }
    @Override
    public String introduce() {
        return super.introduce() + " I am a Student. I am at Class " + _class.getNumber() + ".";
    }

    public Klass getKlass() {
        return _class;
    }

    public void setKlass(Klass _class) {
        this._class = _class;
    }
}
