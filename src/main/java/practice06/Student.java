package practice06;

public class Student extends Person{
    private int _class;
    public Student(String name, int age, int _class) {
        super(name, age);
        this._class = _class;
    }

    public int getKlass() {
        return _class;
    }

    public void setKlass(int _class) {
        this._class = _class;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Student. I am at Class " + getKlass() + ".";

    }
}
