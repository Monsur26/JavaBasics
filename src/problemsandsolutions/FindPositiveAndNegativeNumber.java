package problemsandsolutions;


import java.util.Scanner;

public class FindPositiveAndNegativeNumber {
    // Technical Interview is 1 hour:
    // 30-40 min verbal interview session: Good
    // 2 problem solving Questions: Excellent



    public static void checkPositiveNegative() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input Number");
            String x = scan.nextLine();
            int y = Integer.parseInt(x);
            if (y < 0) {
                System.out.println("ITS NEGATIVE");
            } else if (y > 0) {
                System.out.println("ITS POSITIVE");
            }
            scan.close();

        } catch (Exception e) {
            System.out.println("NOT A NUMBER");
        }

    }


    public static void main(String[] args) {
        FindPositiveAndNegativeNumber.checkPositiveNegative();


    }




}
