package oop.Inheritance;

public class Test {
    public static void main(String[] args) {
        Father abidFather=new Father();
        abidFather.jump();

        Son abid=new Son();
        abid.jump();
        abid.bodyBuilder();
        abid.setSonAccountNumber("879485703");
        System.out.println(abid.getSonAccountNumber());

        Daughter anika=new Daughter();
        anika.jump();


        GrandFather nizam=new Son();
        nizam.jump();
        nizam.height();
        String ssn=((Son) nizam).sonSSN="8965498";
        System.out.println(ssn);



    }
}
