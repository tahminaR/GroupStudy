package oops.Abstruction;

public class MainCar implements Car{

    String carName= "Toyota";
    String carModel="RAV4";
    int carValue=32000;


    public void carSteering() {System.out.println("this car has steering");}

    public void carDisplay() {
        System.out.println("this car has Display");
    }

    public void carStart() {
        System.out.println("this car has start button");
    }

    public void carStop() {
        System.out.println("this car has stop button");
    }

    public void carBreak() {
        System.out.println("this car has break option");
    }

    public void carWheels() {
        System.out.println("this car has 4 wheels");
    }
}
