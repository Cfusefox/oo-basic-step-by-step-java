package practice11;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Teacher extends Person{
    private HashSet classesSet;
    private ArrayList<String> classList = new ArrayList<>();
    public Teacher(int id, String name, int age, HashSet classesSet) {
        super(id, name, age);
        this.classesSet = classesSet;
        Iterator it = classesSet.iterator();
        while (it.hasNext()) {
            Klass obj = (Klass) it.next();
            classList.add(String.valueOf(obj.getNumber()));
            obj.setTeacherName(name);
        }
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public HashSet getClasses() {
        return classesSet;
    }

    public void setClasses(HashSet classesSet) {
        this.classesSet = classesSet;
    }

    @Override
    public String introduce() {
        if(classList.size() != 0) {
            return super.introduce() + " I am a Teacher. I teach Class " + String.join(", ", classList) + ".";
        }
        return super.introduce() + " I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        if(classList.contains(String.valueOf(student.getKlass().getNumber()))) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public Boolean isTeaching(Student student) {
        if(student.getKlass().isIn(classList)) {
            return true;
        }
        return false;
    }

    public void studentJoin(Student student) {
        System.out.println("I am " + getName() + ". I know " + student.getName() + " has joined Class " + student.getKlass().getNumber() + ".");
    }
}
