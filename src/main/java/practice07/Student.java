package practice07;

public class Student extends Person {
    Klass klass;
    //Klass klass1 = new Klass(0);
    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass.getLeader() != null && klass.getLeader().getName().equals(this.getName())) {
            return super.introduce() + String.format(" I am a Student. I am Leader of Class %d.", klass.getNumber());
        }
        return super.introduce() + String.format(" I am a Student. I am at Class %d.", klass.getNumber());
    }
}

