package oop.abstruction;

public class Toyota  extends NewCar implements Car {

    String toyotaCarModel="M20";
    double toyotaCarPrice=50000.500;


    public void startCar() {
        System.out.println("Toyota car has start functionality");
    }


    public void stopCar() {
        System.out.println("Toyota car has stop functionality");
    }


    public void carEngine() {
        System.out.println("Toyota car has Engine");
    }


    public void carWheel() {
        System.out.println("Toyota car has Wheel");
    }


    public void carChassis() {
        System.out.println("Toyota car has Chassis");
    }

    // concrete class: Toyota


    public void heater(){
        System.out.println("Toyota car has Heater");
    }

    public void preCollisionWarning(){
        System.out.println("Toyota car has pre Collision Warning");
    }



    public void gprs() {
        System.out.println("Toyota car has GPRS");
    }


    public void carDisplay() {
        System.out.println("Toyota car has Display");
    }
}
