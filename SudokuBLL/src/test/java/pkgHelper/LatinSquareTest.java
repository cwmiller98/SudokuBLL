package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void hasDuplicates_test1() {
		
		int [] arr = {1,2,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
		
	}
	@Test
	public void hasDuplicates_test2() {
		
		int [] arr = {1,1,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
		
	}
	@Test
	public void hasDuplicates_test3() {
		
		int [] arr = {1,3,4,5,1};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
		
	}
	
	@Test
	public void hasDuplicates_test4() {
		
		int [] arr = null;
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
		
	}
	
	@Test
	public void doesElementExist_Test1() {
		int [] arr = {1,2,3,4,5};
		int iValue = 3;
		
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.doesElementExist(arr, iValue));
	}
	@Test
	public void doesElementExist_Test2() {
		int [] arr = {1,2,3,4,5};
		int iValue = 99;
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.doesElementExist(arr, iValue));
	}
	
	@Test
	public void doesElementExist_Test3() {
		
		int [] arr = null;
		int iValue = 1;
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.doesElementExist(arr, iValue));
		
	}
	@Test
	public void hasAllValues_Test1() {
		int [] arr1 = {1};
		int [] arr2 = {4};
		boolean bExpected = false;
		boolean bActual = LatinSquare.hasAllValues(arr1, arr2);
	}
	@Test
	public void hasAllValues_Test2() {
		int [] arr1 = {1};
		int [] arr2 = {1};
		boolean bExpected = true;
		boolean bActual = LatinSquare.hasAllValues(arr1, arr2);
	}
	@Test
	public void getColumn_Test() {
		LatinSquare ls = new LatinSquare();
		int[] iActual = ls.getColumn(0);
		int[] iExpected = new int[] {1,2,3};
		assertEquals(Arrays.compare(iExpected, iActual), 0);
	}
	@Test
	public void getRow_Test() {
		LatinSquare ls = new LatinSquare();
		int[] iActual = ls.getRow(0);
		int[] iExpected = new int[] {1,2,3};
		assertEquals(Arrays.compare(iExpected, iActual), 0);
		
	}
	@Test
	public void isLatinSquare_Test1() {
		LatinSquare ls = new LatinSquare();
		boolean bActual = ls.isLatinSquare();
		boolean bExpected = true;
		assertEquals(bExpected, bActual);
	}
	@Test
	public void isLatinSquare_Test2() {
		LatinSquare ls = new LatinSquare(new int[][] {{1,1,1},{2,2,2},{3,3,3}});
		boolean bActual = ls.isLatinSquare();
		boolean bExpected = false;
		assertEquals(bExpected, bActual);
	}
	@Test
	public void ContainsZero_test() {
		LatinSquare ls = new LatinSquare(new int[][] {{0,2,4},{1,9,3},{5,6,7}});
		boolean bActual = ls.isLatinSquare();
		boolean bExpected = true;
		assertEquals(bExpected, bActual);
	}
}
