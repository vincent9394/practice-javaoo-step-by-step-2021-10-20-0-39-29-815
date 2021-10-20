package practice05;

import practice06.Klass;

public class Teacher extends Person {
    private Integer klass;

    public Teacher(String name, int age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        this(name, age, null);
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass == null) {
            return super.introduce() + String.format(" I am a Teacher. I teach No Class.");
        }
        return super.introduce() + String.format(" I am a Teacher. I teach Class %d.", getKlass());
    }
}
