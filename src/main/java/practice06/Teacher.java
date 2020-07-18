package practice06;

public class Teacher extends Person{
    private int _class;
    public Teacher(String name, int age, int _class) {
        super(name, age);
        this._class = _class;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return _class;
    }

    public void setKlass(int _class) {
        this._class = _class;
    }

    @Override
    public String introduce() {
        if("".equals(String.valueOf(_class))) {
            return super.introduce() + " I am a Teacher. I teach Class " + getKlass() + ".";
        }
        return super.introduce() + " I am a Teacher. I teach No Class.";
    }
}
