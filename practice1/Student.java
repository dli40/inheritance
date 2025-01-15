package practice1;

public class Student {

    private int id;
    private String name;

    public Student() {
        id = 0;
        name = "default name";
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}