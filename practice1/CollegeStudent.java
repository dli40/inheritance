package practice1;

public class CollegeStudent extends Student {

    private String major;
    private double gpa;

    public CollegeStudent() {
        super();
        major = "undeclared";
        gpa = 4;
    }

    public CollegeStudent(int id, String name, String major, double gpa) {
        super(id, name);
        this.major = major;
        this.gpa = gpa;
    }

    @Override
    public void study() {
        super.study();
        System.out.println(" and has finals coming up!");
    }

    public double getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }
}
