package advance;

public class Recursion {

    // Recursion: process in which a method calls itself continuously.
    // must call itself
    // must have a base case
    // must change its state and move toward the base case

// To format your code: Windows: ctrl+alt+L    Mac: command+opt+L

    static int count = 0;

    public static void pizzaInfo() {
        count++;

        if (count <= 12) {
            System.out.println("Pizza is Amazing");
            pizzaInfo();
        }


    }


    public static void main(String[] args) {

        Recursion.pizzaInfo();

    }


}



