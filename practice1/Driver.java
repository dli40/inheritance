package practice1;

public class Driver {

    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent();
        System.out.println(cs.getMajor());

        // inherited public method
        System.out.println(cs.getName());

        // System.out.println(cs.name);
    }
}
