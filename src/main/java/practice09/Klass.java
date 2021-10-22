package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private Integer number;
    private Student leader;
    List<Student> students = new ArrayList<>();
    public Klass(Integer number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class "+number;
    }

    public void assignLeader(Student leader){
        if (students.contains(leader)){
            this.leader = leader;
        }
        else{
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader(){
        return leader;
    }

    public void appendMember(Student member) {
        students.add(member);
    }

}
