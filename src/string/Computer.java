package string;

public class Computer {



    public static void main(String[] args) {
        // String is a sequence of character
        String computerName="MacBook Pro";
        String computerBrand="Apple";

        System.out.println("Computer Name : "+computerName);
        // Length of string: length()
        System.out.println("String Length : "+computerName.length());

        // charAt()
        System.out.println("Char at : "+computerName.charAt(3));

        // SubString

        String name=new String(computerName);
        System.out.println(name.substring(5));
        System.out.println(name.substring(3,7));
        System.out.println(computerName.substring(4));


        System.out.println(computerName.equals("Windows"));
        System.out.println(computerName.equals("MacBook Pro"));

        System.out.println(computerName.equalsIgnoreCase("MacBook pro"));

        // Upper case
        // lower case
        // trim
        // remove
        // String reverse
        // replace

        System.out.println("***********************************");


        try{
            System.out.println("Char at : "+computerName.charAt(15)); // StringIndexOutOfBoundsException
        } catch (Exception e){
            System.out.println("String Index Out Of Bounds Exception");
        }



    }







}
