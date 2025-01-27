package practice3;

public class Plane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Plane flies with engine");
    }

    public String toString() {
        return "Plane";
    }

}
