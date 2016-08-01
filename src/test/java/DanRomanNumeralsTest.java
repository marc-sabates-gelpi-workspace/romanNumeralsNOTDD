import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class DanRomanNumeralsTest {

	@Test
	public void number1() {
		assertEquals("I", RomanNumeral.roman(1));
	}
	
	@Test
	public void number2() throws Exception {
		assertEquals("II", RomanNumeral.roman(2));
	}
	
	@Test
	public void number3() throws Exception {
		assertEquals("III", RomanNumeral.roman(3));
	}
	
	@Test
	public void number4() throws Exception {
		assertEquals("IV", RomanNumeral.roman(4));
	}
	
	@Test
	public void number5() throws Exception {
		assertEquals("V", RomanNumeral.roman(5));
	}
	
	@Test
	public void number6() throws Exception {
		assertEquals("VI", RomanNumeral.roman(6));
	}
	
	@Test
	public void number7() throws Exception {
		assertEquals("VII", RomanNumeral.roman(7));
	}
	
	@Test
	public void number8() throws Exception {
		assertEquals("VIII", RomanNumeral.roman(8));
	}
	
	@Test
	public void number9() throws Exception {
		assertEquals("IX", RomanNumeral.roman(9));
	}
	
	@Test
	public void number10() throws Exception {
		assertEquals("X", RomanNumeral.roman(10));
	}
	
	@Test
	public void number11() throws Exception {
		assertEquals("XI", RomanNumeral.roman(11));
	}
	
	@Test
	public void number12() throws Exception {
		assertEquals("XII", RomanNumeral.roman(12));
	}
	
	@Test
	public void number13() throws Exception {
		assertEquals("XIII", RomanNumeral.roman(13));
	}
	
	@Test
	public void number14() throws Exception {
		assertEquals("XIV", RomanNumeral.roman(14));
	}
	
	@Test
	public void number15() throws Exception {
		assertEquals("XV", RomanNumeral.roman(15));
	}
	
	@Test
	public void number16() throws Exception {
		assertEquals("XVI", RomanNumeral.roman(16));
	}
	
	@Test
	public void number20() throws Exception {
		assertEquals("XX", RomanNumeral.roman(20));
	}
	
	@Test
	public void number22() throws Exception {
		assertEquals("XXII", RomanNumeral.roman(22));
	}
	
	@Test
	public void number24() throws Exception {
		assertEquals("XXIV", RomanNumeral.roman(24));
	}
	
	@Test
	public void number25() throws Exception {
		assertEquals("XXV", RomanNumeral.roman(25));
	}
	
	@Test
	public void number27() throws Exception {
		assertEquals("XXVII", RomanNumeral.roman(27));
	}
	
	@Test
	public void number39() throws Exception {
		assertEquals("XXXIX", RomanNumeral.roman(39));
	}
	
	@Test
	public void number40() throws Exception {
		assertEquals("XL", RomanNumeral.roman(40));
	}
	
	@Test
	public void number42() throws Exception {
		assertEquals("XLII", RomanNumeral.roman(42));
	}
	
	@Test
	public void number48() throws Exception {
		assertEquals("XLVIII", RomanNumeral.roman(48));
	}
	
	@Test
	public void number49() throws Exception {
		assertEquals("XLIX", RomanNumeral.roman(49));
	}
	
	@Test
	public void number50() throws Exception {
		assertEquals("L", RomanNumeral.roman(50));
	}
	
	@Test
	public void number89() throws Exception {
		assertEquals("LXXXIX", RomanNumeral.roman(89));
	}
	
	@Test
	public void number90() throws Exception {
		assertEquals("XC", RomanNumeral.roman(90));
	}
	
	@Test
	public void number99() throws Exception {
		assertEquals("XCIX", RomanNumeral.roman(99));
	}
	
	@Test
	public void number100() throws Exception {
		assertEquals("C", RomanNumeral.roman(100));
	}
	
	@Test
	public void number139() throws Exception {
		assertEquals("CXXXIX", RomanNumeral.roman(139));
	}
	
	@Test
	public void number140() throws Exception {
		assertEquals("CXL", RomanNumeral.roman(140));
	}
	
	@Test
	public void number399() throws Exception {
		assertEquals("CCCXCIX", RomanNumeral.roman(399));
	}
	
	@Test
	public void number400() throws Exception {
		assertEquals("CD", RomanNumeral.roman(400));
	}
	
	@Test
	public void number499() throws Exception {
		assertEquals("CDXCIX", RomanNumeral.roman(499));
	}
	
	@Test
	public void number500() throws Exception {
		assertEquals("D", RomanNumeral.roman(500));
	}
	
	@Test
	public void number899() throws Exception {
		assertEquals("DCCCXCIX", RomanNumeral.roman(899));
	}
	
	@Test
	public void number900() throws Exception {
		assertEquals("CM", RomanNumeral.roman(900));
	}
	
	@Test
	public void number999() throws Exception {
		assertEquals("CMXCIX", RomanNumeral.roman(999));
	}
	
	@Test
	public void number1000() throws Exception {
		assertEquals("M", RomanNumeral.roman(1000));
	}
	
	@Test
	public void number2000() throws Exception {
		assertEquals("MM", RomanNumeral.roman(2000));
	}
	
	@Test
	public void number3123() throws Exception {
		assertEquals("MMMCXXIII", RomanNumeral.roman(3123));
	}
	
	@Test
	public void number4999() throws Exception {
		assertEquals("MMMMCMXCIX", RomanNumeral.roman(4999));
	}

}
