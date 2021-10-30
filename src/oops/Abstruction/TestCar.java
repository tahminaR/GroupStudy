package oops.Abstruction;

public class TestCar extends MainCar{
    public static void main(String[] args) {
        MainCar tCar=new MainCar();

        tCar.carDisplay();
        tCar.carSteering();
        tCar.carBreak();
        tCar.carStart();
        tCar.carWheels();
        tCar.carStop();

        System.out.println(tCar.carName);
        System.out.println(tCar.carModel);
        System.out.println(tCar.carColor);
        System.out.println(tCar.carYear);
        System.out.println(tCar.carPrices);

        //from NewCar Class
        //System.out.println(tCar.carModel2);


    }

}
