package practice05;

import practice06.Klass;

public class Teacher extends Person {
    private int klass ;
    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        this(name, age,0);
    }
    public int getKlass() {

        return klass;
    }

    public String introduce(){
        if (! (klass==0)) {
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d.", getName(), getAge(), getKlass());
           }
        return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.", getName(), getAge());
        }
}
