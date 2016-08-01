import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralsTest {
	
	@Test
	public void shouldReturnI() {
		assertEquals("I", RomanNumeral.roman(1));
	}
	
	@Test
	public void shouldReturnII() throws Exception {
		assertEquals("II", RomanNumeral.roman(2));
	}
	
	@Test
	public void shouldReturnIII() throws Exception {
		assertEquals("III", RomanNumeral.roman(3));
	}
	
	@Test
	public void shouldReturnIV() throws Exception {
		assertEquals("IV", RomanNumeral.roman(4));
	}
	
	@Test
	public void shouldReturnV() throws Exception {
		assertEquals("V", RomanNumeral.roman(5));
	}
	
	@Test
	public void shouldReturnVI() throws Exception {
		assertEquals("VI", RomanNumeral.roman(6));
	}
	
	@Test
	public void shouldReturnVII() throws Exception {
		assertEquals("VII", RomanNumeral.roman(7));
	}
	
	@Test
	public void shouldReturnVIII() throws Exception {
		assertEquals("VIII", RomanNumeral.roman(8));
	}
	
	@Test
	public void shouldReturnIX() throws Exception {
		assertEquals("IX", RomanNumeral.roman(9));
	}
	
	@Test
	public void shouldReturnX() throws Exception {
		assertEquals("X", RomanNumeral.roman(10));
	}
	
	@Test
	public void shouldReturnXI() {
		assertEquals("XI", RomanNumeral.roman(11));
	}
	
	@Test
	public void shouldReturnXII() throws Exception {
		assertEquals("XII", RomanNumeral.roman(12));
	}
	
	@Test
	public void shouldReturnXIII() throws Exception {
		assertEquals("XIII", RomanNumeral.roman(13));
	}
	
	@Test
	public void shouldReturnXLIX() throws Exception {
		assertEquals("XLIX", RomanNumeral.roman(49));
	}
	
	@Test
	public void shouldReturnL() throws Exception {
		assertEquals("L", RomanNumeral.roman(50));
	}
	
	@Test
	public void shouldReturnLI() {
		assertEquals("LI", RomanNumeral.roman(51));
	}
	
	@Test
	public void shouldReturnLII() throws Exception {
		assertEquals("LII", RomanNumeral.roman(52));
	}
	
	@Test
	public void shouldReturnLIII() throws Exception {
		assertEquals("LIII", RomanNumeral.roman(53));
	}
	
	@Test
	public void shouldReturnXCIX() throws Exception {
		assertEquals("XCIX", RomanNumeral.roman(99));
	}
	
	@Test
	public void shouldReturnC() throws Exception {
		assertEquals("C", RomanNumeral.roman(100));
	}
	
	@Test
	public void shouldReturnCI() {
		assertEquals("CI", RomanNumeral.roman(101));
	}
	
	@Test
	public void shouldReturnCII() throws Exception {
		assertEquals("CII", RomanNumeral.roman(102));
	}
	
	@Test
	public void shouldReturnCIII() throws Exception {
		assertEquals("CIII", RomanNumeral.roman(103));
	}
	
	@Test
	public void shouldReturnCDXCIX() throws Exception {
		assertEquals("CDXCIX", RomanNumeral.roman(499));
	}
	
	@Test
	public void shouldReturnD() throws Exception {
		assertEquals("D", RomanNumeral.roman(500));
	}
	
	@Test
	public void shouldReturnDI() {
		assertEquals("DI", RomanNumeral.roman(501));
	}
	
	@Test
	public void shouldReturnDII() throws Exception {
		assertEquals("DII", RomanNumeral.roman(502));
	}
	
	@Test
	public void shouldReturnDIII() throws Exception {
		assertEquals("DIII", RomanNumeral.roman(503));
	}
	
	@Test
	public void shouldReturnCMXCIX() throws Exception {
		assertEquals("CMXCIX", RomanNumeral.roman(999));
	}
	
	@Test
	public void shouldReturnM() throws Exception {
		assertEquals("M", RomanNumeral.roman(1000));
	}
	
	//Trickiest numbers
	@Test
	public void shouldReturnXXXIX() throws Exception {
		assertEquals("XXXIX", RomanNumeral.roman(39));
	}
	
	@Test
	public void shouldReturnXLIV() throws Exception {
		assertEquals("XLIV", RomanNumeral.roman(44));
	}
	
	@Test
	public void shouldReturnMCMXCIX() throws Exception {
		assertEquals("MCMXCIX", RomanNumeral.roman(1999));
	}
	
	@Test
	public void shouldReturnCMXCVIII() throws Exception {
		assertEquals("CMXCVIII", RomanNumeral.roman(998));
	}

	@Test
	public void shouldReturnMMMMMMMMMCDXCV() throws Exception {
		assertEquals("MMMMMMMMMCDXCV", RomanNumeral.roman(9495));
	}
	
	@Test
	public void shouldReturnMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMCCCXLIX() throws Exception {
		assertEquals("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMCCCXLIX", RomanNumeral.roman(45349));
	}
	
}
