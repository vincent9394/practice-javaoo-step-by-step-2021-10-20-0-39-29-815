package practice06;

public class Student extends Person {
    Klass klass = new Klass(0);
    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }
    public int getKlass() {
        return klass.getNumber();
    }

    public String introduce(){
        return String.format("My name is %s. I am %d years old. I am a Student. I am at Class %d.", getName(),getAge(),getKlass());
    }
}

