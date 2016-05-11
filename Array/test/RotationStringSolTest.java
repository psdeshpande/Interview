package test;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import main.RotationStringSol;


public class RotationStringSolTest {

	@Rule
	public ExpectedException thrown= ExpectedException.none();
	
	@Test
	public void testString0() {
		RotationStringSol stl = new RotationStringSol();
		assertEquals(true, stl.isRotation("prasad", "sadpra"));
	}
	
	@Test
	public void testString1() {
		RotationStringSol stl = new RotationStringSol();
		assertEquals(true, stl.isRotation("aabbbaaa", "bbaaaaab"));
	}
	
	@Test
	public void testString2() {
		RotationStringSol stl = new RotationStringSol();
		assertEquals(false, stl.isRotation("test", "est"));
	}
	
	@Test
	public void testString3() {
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("string 2 is null");
		RotationStringSol stl = new RotationStringSol();
		assertEquals(false, stl.isRotation("test", null));
	}
	
}
