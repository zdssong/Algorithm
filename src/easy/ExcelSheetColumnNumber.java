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
	 * pass the compile and the runtime is 200 ms
	 * */
	public int titleToNumber(String s) {
		int Number = 0;
		for (int i = 0; i < s.length(); i++) {
			Number += (s.charAt(i) - 'A' + 1)
					* Math.pow(26, s.length() - 1 - i);
		}
		return Number;
	}
}
