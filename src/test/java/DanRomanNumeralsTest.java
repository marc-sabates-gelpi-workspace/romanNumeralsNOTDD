import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class DanRomanNumeralsTest {
	
	RomanNumeral romanNumerals;

	@Before
	public void setUp() throws Exception {
		romanNumerals = new RomanNumeral();
	}

	@Test
	public void number1() {
		assertEquals("I", romanNumerals.roman(1));
	}
	
	@Test
	public void number2() throws Exception {
		assertEquals("II", romanNumerals.roman(2));
	}
	
	@Test
	public void number3() throws Exception {
		assertEquals("III", romanNumerals.roman(3));
	}
	
	@Test
	public void number4() throws Exception {
		assertEquals("IV", romanNumerals.roman(4));
	}
	
	@Test
	public void number5() throws Exception {
		assertEquals("V", romanNumerals.roman(5));
	}
	
	@Test
	public void number6() throws Exception {
		assertEquals("VI", romanNumerals.roman(6));
	}
	
	@Test
	public void number7() throws Exception {
		assertEquals("VII", romanNumerals.roman(7));
	}
	
	@Test
	public void number8() throws Exception {
		assertEquals("VIII", romanNumerals.roman(8));
	}
	
	@Test
	public void number9() throws Exception {
		assertEquals("IX", romanNumerals.roman(9));
	}
	
	@Test
	public void number10() throws Exception {
		assertEquals("X", romanNumerals.roman(10));
	}
	
	@Test
	public void number11() throws Exception {
		assertEquals("XI", romanNumerals.roman(11));
	}
	
	@Test
	public void number12() throws Exception {
		assertEquals("XII", romanNumerals.roman(12));
	}
	
	@Test
	public void number13() throws Exception {
		assertEquals("XIII", romanNumerals.roman(13));
	}
	
	@Test
	public void number14() throws Exception {
		assertEquals("XIV", romanNumerals.roman(14));
	}
	
	@Test
	public void number15() throws Exception {
		assertEquals("XV", romanNumerals.roman(15));
	}
	
	@Test
	public void number16() throws Exception {
		assertEquals("XVI", romanNumerals.roman(16));
	}
	
	@Test
	public void number20() throws Exception {
		assertEquals("XX", romanNumerals.roman(20));
	}
	
	@Test
	public void number22() throws Exception {
		assertEquals("XXII", romanNumerals.roman(22));
	}
	
	@Test
	public void number24() throws Exception {
		assertEquals("XXIV", romanNumerals.roman(24));
	}
	
	@Test
	public void number25() throws Exception {
		assertEquals("XXV", romanNumerals.roman(25));
	}
	
	@Test
	public void number27() throws Exception {
		assertEquals("XXVII", romanNumerals.roman(27));
	}
	
	@Test
	public void number39() throws Exception {
		assertEquals("XXXIX", romanNumerals.roman(39));
	}
	
	@Test
	public void number40() throws Exception {
		assertEquals("XL", romanNumerals.roman(40));
	}
	
	@Test
	public void number42() throws Exception {
		assertEquals("XLII", romanNumerals.roman(42));
	}
	
	@Test
	public void number48() throws Exception {
		assertEquals("XLVIII", romanNumerals.roman(48));
	}
	
	@Test
	public void number49() throws Exception {
		assertEquals("XLIX", romanNumerals.roman(49));
	}
	
	@Test
	public void number50() throws Exception {
		assertEquals("L", romanNumerals.roman(50));
	}
	
	@Test
	public void number89() throws Exception {
		assertEquals("LXXXIX", romanNumerals.roman(89));
	}
	
	@Test
	public void number90() throws Exception {
		assertEquals("XC", romanNumerals.roman(90));
	}
	
	@Test
	public void number99() throws Exception {
		assertEquals("XCIX", romanNumerals.roman(99));
	}
	
	@Test
	public void number100() throws Exception {
		assertEquals("C", romanNumerals.roman(100));
	}
	
	@Test
	public void number139() throws Exception {
		assertEquals("CXXXIX", romanNumerals.roman(139));
	}
	
	@Test
	public void number140() throws Exception {
		assertEquals("CXL", romanNumerals.roman(140));
	}
	
	@Test
	public void number399() throws Exception {
		assertEquals("CCCXCIX", romanNumerals.roman(399));
	}
	
	@Test
	public void number400() throws Exception {
		assertEquals("CD", romanNumerals.roman(400));
	}
	
	@Test
	public void number499() throws Exception {
		assertEquals("CDXCIX", romanNumerals.roman(499));
	}
	
	@Test
	public void number500() throws Exception {
		assertEquals("D", romanNumerals.roman(500));
	}
	
	@Test
	public void number899() throws Exception {
		assertEquals("DCCCXCIX", romanNumerals.roman(899));
	}
	
	@Test
	public void number900() throws Exception {
		assertEquals("CM", romanNumerals.roman(900));
	}
	
	@Test
	public void number999() throws Exception {
		assertEquals("CMXCIX", romanNumerals.roman(999));
	}
	
	@Test
	public void number1000() throws Exception {
		assertEquals("M", romanNumerals.roman(1000));
	}
	
	@Test
	public void number2000() throws Exception {
		assertEquals("MM", romanNumerals.roman(2000));
	}
	
	@Test
	public void number3123() throws Exception {
		assertEquals("MMMCXXIII", romanNumerals.roman(3123));
	}
	
	@Test
	public void number4999() throws Exception {
		assertEquals("MMMMCMXCIX", romanNumerals.roman(4999));
	}

}
