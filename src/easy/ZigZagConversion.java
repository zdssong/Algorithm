package easy;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
 * of rows like this: (you may want to display this pattern in a fixed font for
 * better legibility)
 * 
 * P A H N A P L S I I G Y I R And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a
 * number of rows:
 * 
 * string convert(string text, int nRows); convert("PAYPALISHIRING", 3) should
 * return "PAHNAPLSIIGYIR"
 * 
 * url:https://oj.leetcode.com/problems/zigzag-conversion/
 * */
public class ZigZagConversion {
	/**
	 * pass the test by used 699 ms 478 ms
	 * */
	public static String convert(String s, int nRows) {
		// delete the s.length()==1 the time to be 478 ms
		if (nRows == 1 || s.length() == 1)
			return s;
		String result = "";
		int leftSeparation = 2 * nRows - 2;
		int rightSeparation = 0;
		for (int i = 0; i < nRows; i++) {
			int position = i;
			if (position <= s.length() - 1)
				result += s.charAt(position);
			while (position <= s.length() - 1) {
				if (leftSeparation > 0) {
					position += leftSeparation;
					if (position <= s.length() - 1)
						result += s.charAt(position);
				}
				if (rightSeparation > 0) {
					position += rightSeparation;
					if (position <= s.length() - 1)
						result += s.charAt(position);
				}
			}
			leftSeparation -= 2;
			rightSeparation += 2;
		}
		return result;
	}
}
