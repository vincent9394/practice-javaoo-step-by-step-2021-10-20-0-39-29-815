package practice08;



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
        return String.format("%s I am a Student. I am %s%s.", super.introduce(),
                ((klass.getLeader() != null) ? "Leader of " : "at "), klass.getDisplayName());
    }
}