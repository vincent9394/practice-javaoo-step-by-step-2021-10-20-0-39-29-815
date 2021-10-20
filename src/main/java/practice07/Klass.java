package practice07;

public class Klass {
    private Integer number;
    private Student leader;

    public Klass(Integer number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class "+number;
    }

    public Student assignLeader(Student leader){
       return this.leader=leader;
    }

    public Student getLeader(){
        return leader;
    }
}
