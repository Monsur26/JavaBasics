package operators;

public class UnaryOperator {

	// Increment operator: ++ always add 1
	// PreIncrement: ++number
	// PostIncrement: number++

	// Decrement Operator: -- Decrease -1
	// PreDecrement : --number
	// PostDecrement : number--

	public static void main(String[] args) {

		int number = 5;
		// number++;
		System.out.println(number++);// 5 holding 1 for future
		System.out.println(number);// 5+1

		System.out.println(++number);// 1+number means 1+6= 7

		number--;// -1 is for future
		System.out.println(number);// 6

		System.out.println(--number);// 5

		number++;// 5
		number++;// 6
		number++;// 7
		number--;// 7
		number--;// 6
		--number;// 5
		++number;// 6
		System.out.println(number); // 6

	}

}
