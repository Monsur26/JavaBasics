package oop.abstruction;

public class Test {


    public static void main(String[] args) {

        Toyota myToyota=new Toyota();
        myToyota.startCar();
        myToyota.carEngine();
        myToyota.carWheel();
        myToyota.stopCar();
        myToyota.gprs();
        myToyota.carDisplay();
        myToyota.heater();


        Bmw myBmw=new Bmw();
        myBmw.startCar();
        myBmw.carDisplay();
        myBmw.carWheel();
        myBmw.stopCar();
        myBmw.flyingFeature();

        System.out.println("***********************************************");


        Car myCar  =  new Toyota();
        //((Toyota) myCar).heater();

       // ((Toyota) myCar).preCollisionWarning();

        myCar.startCar();

        ModernCar myModernCar=new Bmw();
        //((Bmw) myModernCar).carDisplay();
        myModernCar.camera360View();

        FlyingCar myFlyingCar=new Bmw();
        myFlyingCar.flyingFeature();

        // ((Bmw) myFlyingCar).blueTooth();

        NewCar myNewCar=new Toyota();


        NewCar myNewCar1=new Bmw();
        myNewCar1.boostEngine();
        myNewCar1.gprs();

        ((Bmw) myNewCar1).flyingFeature();






    }


}
