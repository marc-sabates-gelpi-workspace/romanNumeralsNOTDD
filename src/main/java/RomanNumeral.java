
public class RomanNumeral {

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
	public static final int values [] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
	public static final String symbols [] = {I, IV, V, IX, X, XL, L, XC, C, CD, D, CM, M};

	private static final int BIGGEST_POSITION = values.length - 1;
	
	public String roman(int remainder) {
		String romanNumber = "";
		int candidatePosition, times;
		
		while (remainder != 0){
			candidatePosition = findBiggestDivisorPosition(remainder);
			times = remainder / values[candidatePosition];
			remainder = remainder % values[candidatePosition];
			romanNumber += findSymbol(candidatePosition, times);
		}
		
		return romanNumber;
	}

	private int findBiggestDivisorPosition(int number) {
		for ( int i = BIGGEST_POSITION; i >= 0; i--){
			if(number >= values[i]) return i;
		}
		return 0;
	}

	private String findSymbol(int position, int times) {
		String result = "";
		for(int i = 0; i < times; i++) {
			result += symbols[position];
		}
		return result;
	}

}
