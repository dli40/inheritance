package practice1;

public class Student {

    private int id;
    private String name;

    public Student() {
        id = 0;
        name = "default name";
    }

    public void study() {
        System.out.println(name + " is studying!");
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