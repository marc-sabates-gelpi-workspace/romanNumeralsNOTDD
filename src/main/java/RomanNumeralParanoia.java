
public class RomanNumeralParanoia {

	public static final String I = "I";
	public static final String IV = "IV";
	public static final String V = "V";
	public static final String IX = "IX";
	public static final String X = "X";
	public static final String XL = "XL";
	public static final String L = "L";
	public static final String XC = "XC";
	public static final String C = "C";
	public static final String CD = "CD";
	public static final String D = "D";
	public static final String CM = "CM";
	public static final String M = "M";
	public static final int values [] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	public static final String symbols [] = {M, CM, D, CD, C, XC, L, XL, X, IX, V, IV, I};

	public static String roman(int number) {
		String romanNumber = "";
		
		for (int i = 0; i < values.length; i++){
			if(number == values[i]) {
				romanNumber += symbols[i];
				break;
			} else if (number > values[i]) {
				romanNumber += repeatSymbol(symbols[i], number / values[i]);
				number %= values[i];
			}
		}
		return romanNumber;
	}

	private static String repeatSymbol(String symbol, int times) {
		String result = "";
		for(int i = 0; i < times; i++) result += symbol;
		return result;
	}

}
