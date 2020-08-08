package datastructurealgorithom.sorting;

public class InsertionSort {
    // Technical Interview:

    // Given a Array {34,56,20,200,30,600,120}
    // Output : 20,30,34,56,120,200,600
    // 10-15min to solve this problem

    // for loop
    // Array
    // while Loop

    static int[] numbers = {34, 56, 20, 200, 30, 600, 120};
    public static void main(String[] args) {
        InsertionSort.sortNumbers(numbers);



    }

    public static void sortNumbers(int number[]){
        for (int i = 0; i < number.length; i++) {

            int j = i - 1; // 0
            int point = number[i];

            while (j >= 0 && number[j] > point) {
                number[j + 1] = number[j];
                j = j - 1;
            }
            number[j + 1] = point;
        }

        for (int n = 0; n < number.length; n++) {
            System.out.print(number[n] + " ");
        }
    }

}
