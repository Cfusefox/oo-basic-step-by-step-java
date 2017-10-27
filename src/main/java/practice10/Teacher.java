package practice10;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class Teacher extends Person {
    private Collection<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.classes = Collections.emptySet();
    }

    public Teacher(int id, String name, int age, Collection<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    @Override
    public String introduce() {
        if (this.classes.isEmpty()) {
            return teach("No Class");
        }

        String classIds = this.classes.stream().map(k -> String.valueOf(k.getNumber())).collect(joining(", "));
        return teach("Class " + classIds);
    }

    private String teach(String name) {
        return basicIntroduce() + " I teach " + name + ".";
    }

    private String doNotTeach(String name) {
        return basicIntroduce() + " I don't teach " + name + ".";
    }

    public String introduceWith(Student student) {
        if (isTeaching(student)) {
            return teach(student.getName());
        }
        return doNotTeach(student.getName());
    }

    private String basicIntroduce() {
        return super.introduce() + " I am a Teacher.";
    }

    public Collection<Klass> getClasses() {
        return classes;
    }

    public boolean isTeaching(Student student) {
        return this.classes.stream().anyMatch(c -> c.isIn(student));
    }
}
