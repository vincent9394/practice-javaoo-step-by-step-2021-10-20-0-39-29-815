package practice06;

public class Student extends Person {
    Klass klass = new Klass(null);
    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }
    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        return super.introduce()+String.format(" I am a Student. I am at Class %d.", klass.getNumber());
    }
}

