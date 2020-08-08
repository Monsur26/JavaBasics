package oop.Inheritance;

public class GrandFather {

public String favouriteDish="Kachi Biryani";
public String grandFatherSSN="232343434";

private String grandFatherAccountNumber="3434343";



    public GrandFather() {

    }

    public GrandFather(String grandFatherSSN) {
        this.grandFatherSSN = grandFatherSSN;
    }

    public GrandFather(String favouriteDish, String grandFatherSSN) {
        this.favouriteDish = favouriteDish;
        this.grandFatherSSN = grandFatherSSN;
    }

    public String getGrandFatherAccountNumber() {
        return grandFatherAccountNumber;
    }

    public void setGrandFatherAccountNumber(String grandFatherAccountNumber) {
        this.grandFatherAccountNumber = grandFatherAccountNumber;
    }


    public void height(){
        System.out.println("GrandFather Height was 6.2");
    }

    public void hairColor(){
        System.out.println("GrandFather Hair color was white");
    }

    public void jump(){
        System.out.println("GrandFather can jump");
    }





}
