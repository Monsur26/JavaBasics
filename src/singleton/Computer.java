package singleton;

public class Computer {

        // Singleton class: we are allowed to create one instance of a class at a time.
        // Using private constructor we can ensure that no more than one object can be created at a time.

    int ramSize=16;
    int price=2000;


    private Computer(){

    }


    private static Computer instance =new Computer();

    public static Computer getInstance() {
        return instance;
    }






}
