package practice09;

import java.text.MessageFormat;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person {

    private LinkedList<Klass> klasses;

    public Teacher(int id, String name, int age, LinkedList<Klass> klasses) {
        super(id, name, age);
        this.klasses = klasses;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce(){
        return klasses !=null?
                MessageFormat.format("{0} I am a Teacher. I teach Class {1}.",
                        super.introduce(),
                        klasses
                                .stream()
                                .map(klassValue-> String.valueOf(klassValue.getNumber()))
                                .collect(Collectors.joining(", "))):
                (super.introduce()+ " I am a Teacher. I teach No Class.");
    }

    public String introduceWith(Student student) {
        return MessageFormat.format("{0} I am a Teacher. I {1}{2}.", super.introduce(),
                (isTeaching(student)?"teach ":"don't teach "),
                student.getName());
    }

    public LinkedList<Klass> getClasses() {
        return klasses;
    }

    public boolean isTeaching(Student student) {
        return klasses.stream().anyMatch(klass->klass.isIn(student));
    }

}
