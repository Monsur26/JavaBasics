package doenum;

public class UseEnum {

	public static void main(String[] args) {

		// Color.RED="RED";
		System.out.println(Color.RED);

		for (Color col : Color.values()) {
			System.out.println(col);

		}

		System.out.println(Level.HIGH);

	}

	public static enum Level {
		LOW, HIGH, MEDIUM
	}

}
