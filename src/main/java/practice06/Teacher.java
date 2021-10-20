//package practice06;
//
//public class Teacher extends Person {
//    Klass klass = new Klass(0);
//    Student student = new Student(null, 0, klass);
//    public Teacher(String name, int age, Klass klass) {
//        super(name, age);
//        this.klass = klass;
//    }
//
//    public Teacher(String name, int age) {
//        this(name, age, klass);
//    }
//    public int getKlass() {
//
//        return klass.getNumber();
//    }
//
//    public String introduce(){
//        return String.format("My name is %s. I am %d years old. I am a Student. I am at Class %d.", getName(),getAge(),getKlass());
//
//        if (! (klass==0)) {
//            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d.", getName(), getAge(), getKlass());
//        }
//        return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.", getName(), getAge());
//    }
//
//    public String introduceWith(){
//
//    }
//}