
public class RomanNumeral {

	public static final String I = "I";
	public static final String IV = "IV";
	public static final String V = "V";
	public static final String IX = "IX";
	public static final String X = "X";
	public static final String XL = "XL";
	public static final String IL = "IL";
	public static final String L = "L";
	public static final String XC = "XC";
	public static final String IC = "IC";
	public static final String C = "C";
	public static final String CD = "CD";
	public static final String ID = "ID";
	public static final String D = "D";
	public static final String CM = "CM";
	public static final String IM = "IM";
	public static final String M = "M";
	
	public static final int values [] = {1, 4, 5, 9, 10, 40, 49, 50, 90, 99, 100, 400, 499, 500, 900, 999, 1000};
	public static final String symbols [] = {I, IV, V, IX, X, XL, IL, L, XC, IC, C, CD, ID, D, CM, IM, M};
	
	public String romanOfNum(int number) {
		String romanNumber = "";
		int reminder = number, candidatePosition, times;
		
		while (reminder != 0){
			candidatePosition = findBiggestSmallerOrEqualsCandidatePosition(reminder);
			times = reminder / values[candidatePosition];
			reminder = reminder % values[candidatePosition];
			romanNumber += findSymbol(candidatePosition, times);
		}
		
		return romanNumber;
	}

	private String findSymbol(int position, int times) {
		String result = "";
		for(int i = 0; i < times; i++) {
			result += symbols[position];
		}
		return result;
	}

	private int findBiggestSmallerOrEqualsCandidatePosition(int number) {
		for ( int i = 16; i >= 0; i--){
			if(number >= values[i]) return i;
		}
		return 0;
	}

}
