package oop.Inheritance;

public class Daughter extends Father {
    public String favouriteClothing="Saree";
    public String daughterSSN="932343434";

    private String daughterAccountNumber="2434343";

    public Daughter() {
    }

    public Daughter(String daughterSSN) {
        this.daughterSSN = daughterSSN;
    }

    public Daughter(String favouriteClothing, String daughterSSN) {
        this.favouriteClothing = favouriteClothing;
        this.daughterSSN = daughterSSN;
    }

    public String getDaughterAccountNumber() {
        return daughterAccountNumber;
    }

    public void setDaughterAccountNumber(String daughterAccountNumber) {
        this.daughterAccountNumber = daughterAccountNumber;
    }

    public void superGirl(){
        System.out.println("Loves cooking for family");
    }

    public void mindReader(){
        System.out.println("can read mind easily");
    }

    @Override
    public void jump(){
        System.out.println("Daughter can jump");
    }

}
