package oop.Inheritance;

public class Father  extends GrandFather{
    // Single Level Inheritance

    public String favouriteDish="Chicken Curry";
    public String fatherSSN="532343434";

    private String fatherAccountNumber="6434343";

    public Father() {
    }

    public Father(String fatherSSN) {
        this.fatherSSN = fatherSSN;
    }

    public Father(String favouriteDish, String fatherSSN) {
        this.favouriteDish = favouriteDish;
        this.fatherSSN = fatherSSN;
    }

    public String getFatherAccountNumber() {
        return fatherAccountNumber;
    }

    public void setFatherAccountNumber(String fatherAccountNumber) {
        this.fatherAccountNumber = fatherAccountNumber;
    }

    public void swim(){
        System.out.println("Father can Swim");
    }

    public void educate(){
        System.out.println("Father can Educate others");
    }

    public void qualification(){
        System.out.println("Father is a Businessman");
    }
    public void bikeRider(){
        System.out.println("Father can drive Bike");
    }

    // Override Annotation
    @Override
    public void jump(){
        System.out.println("Father can jump");
    }


}
