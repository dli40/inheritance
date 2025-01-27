package practice3;

public class Bat extends Animal implements Flyable {

    public Bat(int numLegs) {
        super(numLegs);
    }

    @Override
    public void fly() {
        System.out.println("Bats fly at night with wings");
    }

    @Override
    public void makeSound() {
        System.out.println("Eeek eeek");
    }

    public void echolocate() {
        System.out.println("Echolocating!");
    }

    @Override
    public String toString() {
        return "Bat";
    }

}
