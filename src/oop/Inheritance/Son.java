package oop.Inheritance;

public class Son extends Father {
    // Multi level Inheritance


    public String favouriteGame = "Cricket";
    public String sonSSN = "832343434";

    private String sonAccountNumber = "1434343";

    public Son() {
    }

    public Son(String sonSSN) {
        this.sonSSN = sonSSN;
    }

    public Son(String favouriteGame, String sonSSN) {
        this.favouriteGame = favouriteGame;
        this.sonSSN = sonSSN;
    }

    public String getSonAccountNumber() {
        return sonAccountNumber;
    }

    public void setSonAccountNumber(String sonAccountNumber) {
        this.sonAccountNumber = sonAccountNumber;
    }

    public void bodyBuilder() {
        System.out.println("Good Fitted Body");
    }

    public void playGame() {
        System.out.println("Love to play Cricket");
    }

    @Override
    public void jump() {
        System.out.println("Son can Jump");
    }

}
