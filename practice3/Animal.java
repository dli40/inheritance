package practice3;

public abstract class Animal {

    int numLimbs;

    public Animal(int numLimbs) {
        this.numLimbs = numLimbs;
    }

    public abstract void makeSound();

    public String toString() {
        return "Abstract animal... to string";
    }

    public int getLimbs() {
        return numLimbs;
    }

}
