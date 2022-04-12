package coding.test.examples;

public class RomanToNum {

	public static int getValue(String input) {

		switch (input.toUpperCase()) {
		case "I":
			return 1;
		case "V":
			return 5;
		case "X":
			return 10;
		case "L":
			return 50;
		case "C":
			return 100;
		case "D":
			return 500;
		case "M":
			return 1000;

		}
		return 0;
	}

	public static int getRomanToNum(String input) {

		if (!input.isBlank()) {

			int lastValue = 0;
			int finalValue = 0;

			for (int i = input.length() - 1; i >= 0; i--) {

				int intValue = getValue(Character.toString(input.charAt(i)));
				if (intValue == 0) {
					return 0;
				}
				if (lastValue > intValue) {
					finalValue = finalValue - intValue;
				} else {
					finalValue = finalValue + intValue;
				}
				lastValue = intValue;
				//System.out.println(i + "  = " + finalValue);
			}
			return finalValue;
		}

		return 0;
	}

	public static void main(String[] args) {

		System.out.println("MMMMMMMCMXCIV=" + getRomanToNum("MMMMMMMCMXCIV"));

	}

}
