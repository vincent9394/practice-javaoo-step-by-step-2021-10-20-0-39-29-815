package practice06;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        this(name, age);
        this.klass = klass;
    }


    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return super.introduce() + String.format(" I am a Teacher. I teach Class %d.", klass.getNumber());
    }

    public String introduceWith(Student student) {
        String introduce = super.introduce() + String.format(" I am a Teacher. I");
        introduce += klass.getNumber() == student.getKlass().getNumber() ?
                String.format(" teach %s.", student.getName()) : String.format(" don't teach %s.", student.getName());
        return introduce;
    }
}