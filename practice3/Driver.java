package practice3;

public class Driver {

    public static void main(String[] args) {

        // Animal a = new Animal(4);

        Animal aBat = new Bat(4);
        Bat bBat = new Bat(4);
        Animal aDog = new Dog(4);
        Dog dDog = new Dog(4);
        Plane plane = new Plane();

        // which of these will run and compile, and what is output?
        // aBat.fly();
        // bBat.fly();
        // plane.fly();

        // any difference in this behavior?
        // System.out.println(aBat);
        // System.out.println(bBat);

        // why can we not instantiate an Animal even when there is a constructor?

    }
}
