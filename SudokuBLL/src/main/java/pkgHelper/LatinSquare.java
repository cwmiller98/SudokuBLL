package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	private int[][] LatinSquare;

	public LatinSquare() {
				
	}
	
	public LatinSquare(int[][] latinSquare) {
		super();
		LatinSquare = latinSquare;
	}
	
	public int[][] getLatinSquare() {
		return LatinSquare;
	}
	
	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
		
	}
	
	public boolean hasDuplicates(int [] arr) {
		boolean hasDuplicates = false;
		
		if (arr == null)
			return false;
		
		Arrays.sort(arr);
		
		for (int i = 0; i< arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				hasDuplicates = true;
				break;
			}		
		}
		return hasDuplicates;
	}
	
	public boolean doesElementExist(int[] arr, int iValue) {
		boolean doesElementExist = false;
		
		if (arr == null)
			return false;
		
		for (int i: arr) {
			if (i==iValue) {
				doesElementExist=true;
				break;
			}
		}
		
		
		return doesElementExist;
	}
	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		if (arr2 == arr1)
			return true;
		else 
			return false; 
	}
	
	public int[] getColumn(int iCol) {
		int[] arr = new int[this.LatinSquare[iCol].length];
		
		for (int row = 0; row < this.LatinSquare.length; row++) {
			arr[row] = this.LatinSquare[iCol][row];
		}
		return arr;
	}

	public int[] getRow(int iRow) {
		int[] arr = new int[this.LatinSquare.length];
		
		arr = this.LatinSquare[iRow];
		
		return arr;
	}
	
	public boolean isLatinSquare() {
		boolean isLatinSquare = true;
		
		if (hasDuplicates(null))
			return false;
		
		for (int i = 1; i < LatinSquare.length; i++) {

			if (!hasAllValues(getRow(0), getRow(i))) {
				return false;
			}
		}

		for (int j = 1; j < LatinSquare.length; j++) {

			if (!hasAllValues(getColumn(0), getColumn(j))) {
				return false;
			}
		}

		return isLatinSquare;
	}
	
	public boolean ContainsZero() {
		for (int i = 0; i < LatinSquare.length; i++) {
			for (int j = 0; j < LatinSquare.length; j++) {
				if (LatinSquare[i][j] == 0) {
					return true;
				}
			}
		}
		return false;	
	}
}
