import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RomanNumeralsTest {
	
	RomanNumeral rn;

	@Before
	public void setUp() throws Exception {
		rn = new RomanNumeral();
	}
	
	@Test
	public void shouldReturnI() {
		assertEquals("I", rn.roman(1));
	}
	
	@Test
	public void shouldReturnII() throws Exception {
		assertEquals("II", rn.roman(2));
	}
	
	@Test
	public void shouldReturnIII() throws Exception {
		assertEquals("III", rn.roman(3));
	}
	
	@Test
	public void shouldReturnIV() throws Exception {
		assertEquals("IV", rn.roman(4));
	}
	
	@Test
	public void shouldReturnV() throws Exception {
		assertEquals("V", rn.roman(5));
	}
	
	@Test
	public void shouldReturnVI() throws Exception {
		assertEquals("VI", rn.roman(6));
	}
	
	@Test
	public void shouldReturnVII() throws Exception {
		assertEquals("VII", rn.roman(7));
	}
	
	@Test
	public void shouldReturnVIII() throws Exception {
		assertEquals("VIII", rn.roman(8));
	}
	
	@Test
	public void shouldReturnIX() throws Exception {
		assertEquals("IX", rn.roman(9));
	}
	
	@Test
	public void shouldReturnX() throws Exception {
		assertEquals("X", rn.roman(10));
	}
	
	@Test
	public void shouldReturnXI() {
		assertEquals("XI", rn.roman(11));
	}
	
	@Test
	public void shouldReturnXII() throws Exception {
		assertEquals("XII", rn.roman(12));
	}
	
	@Test
	public void shouldReturnXIII() throws Exception {
		assertEquals("XIII", rn.roman(13));
	}
	
	@Test
	public void shouldReturnXLIX() throws Exception {
		assertEquals("XLIX", rn.roman(49));
	}
	
	@Test
	public void shouldReturnL() throws Exception {
		assertEquals("L", rn.roman(50));
	}
	
	@Test
	public void shouldReturnLI() {
		assertEquals("LI", rn.roman(51));
	}
	
	@Test
	public void shouldReturnLII() throws Exception {
		assertEquals("LII", rn.roman(52));
	}
	
	@Test
	public void shouldReturnLIII() throws Exception {
		assertEquals("LIII", rn.roman(53));
	}
	
	@Test
	public void shouldReturnXCIX() throws Exception {
		assertEquals("XCIX", rn.roman(99));
	}
	
	@Test
	public void shouldReturnC() throws Exception {
		assertEquals("C", rn.roman(100));
	}
	
	@Test
	public void shouldReturnCI() {
		assertEquals("CI", rn.roman(101));
	}
	
	@Test
	public void shouldReturnCII() throws Exception {
		assertEquals("CII", rn.roman(102));
	}
	
	@Test
	public void shouldReturnCIII() throws Exception {
		assertEquals("CIII", rn.roman(103));
	}
	
	@Test
	public void shouldReturnCDXCIX() throws Exception {
		assertEquals("CDXCIX", rn.roman(499));
	}
	
	@Test
	public void shouldReturnD() throws Exception {
		assertEquals("D", rn.roman(500));
	}
	
	@Test
	public void shouldReturnDI() {
		assertEquals("DI", rn.roman(501));
	}
	
	@Test
	public void shouldReturnDII() throws Exception {
		assertEquals("DII", rn.roman(502));
	}
	
	@Test
	public void shouldReturnDIII() throws Exception {
		assertEquals("DIII", rn.roman(503));
	}
	
	@Test
	public void shouldReturnCMXCIX() throws Exception {
		assertEquals("CMXCIX", rn.roman(999));
	}
	
	@Test
	public void shouldReturnM() throws Exception {
		assertEquals("M", rn.roman(1000));
	}
	
	//Trickiest numbers
	@Test
	public void shouldReturnXXXIX() throws Exception {
		assertEquals("XXXIX", rn.roman(39));
	}
	
	@Test
	public void shouldReturnXLIV() throws Exception {
		assertEquals("XLIV", rn.roman(44));
	}
	
	@Test
	public void shouldReturnMCMXCIX() throws Exception {
		assertEquals("MCMXCIX", rn.roman(1999));
	}
	
	@Test
	public void shouldReturnCMXCVIII() throws Exception {
		assertEquals("CMXCVIII", rn.roman(998));
	}

	@Test
	public void shouldReturnMMMMMMMMMCDXCV() throws Exception {
		assertEquals("MMMMMMMMMCDXCV", rn.roman(9495));
	}
	
	@Test
	public void shouldReturnMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMCCCXLIX() throws Exception {
		assertEquals("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMCCCXLIX", rn.roman(45349));
	}
	
}
