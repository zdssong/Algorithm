package easy;

/**
 * Related to question Excel Sheet Column Title
 * 
 * Given a column title as appear in an Excel sheet, return its corresponding
 * column number.
 * 
 * For example: A -> 1 B -> 2 C -> 3 ... Z -> 26 AA -> 27 AB -> 28
 * 
 * url:https://oj.leetcode.com/problems/excel-sheet-column-number/
 * */

public class ExcelSheetColumnNumber {
	/**
	 * pass the compile and the runtime is 200 Ms
	 * */
	public static int titleToNumber(String s) {
		int Number = 0;
		for (int i = 0; i < s.length(); i++) {
			Number += (s.charAt(i) - 'A' + 1)
					* Math.pow(26, s.length() - 1 - i);
		}
		return Number;
	}

	
	/**
	 * past the text by using 173 Ms
	 * */
	public static String convertToTitle(int n) {
		String result = "";
		String str = "";
		int remainder = 0;
		int pow = 1;
		while (n != 0) {
			remainder = n % (int) Math.pow(26, pow);
			if (remainder == 0) {
				n -= (int) Math.pow(26, pow);
			} else {
				n -= remainder;
			}
			remainder = remainder / (int) Math.pow(26, pow - 1);
			if (remainder == 0)
				remainder = 26;
			str += "" + (char) ('A' + remainder - 1);
			pow++;
		}
		for (int i = str.length() - 1; i >= 0; i--) {
			result += "" + str.charAt(i);
		}
		return result;
	}
}
