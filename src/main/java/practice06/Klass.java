package practice06;

public class Klass {
    private Integer number;

    public Klass(Integer number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class "+number;
    }
}
