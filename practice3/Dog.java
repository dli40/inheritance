package practice3;

public class Dog extends Animal {

    public Dog(int numLimbs) {
        super(numLimbs);

    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    public String toString() {
        return "Dog";
    }

}
