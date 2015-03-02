package easy;

/**
 * Compare two version numbers version1 and version2. If version1 > version2
 * return 1, if version1 < version2 return -1, otherwise return 0.
 * 
 * You may assume that the version strings are non-empty and contain only digits
 * and the . character. The . character does not represent a decimal point and
 * is used to separate number sequences. For instance, 2.5 is not
 * "two and a half" or "half way to version three", it is the fifth second-level
 * revision of the second first-level revision.
 * 
 * Here is an example of version numbers ordering:
 * 
 * 0.1 < 1.1 < 1.2 < 13.37
 * 
 * url:https://oj.leetcode.com/problems/compare-version-numbers/
 */
public class CompareVersionNumbers {
	/**
	 * this method past the test by using 273 Ms
	 * */
	public static int compareVersion(String version1, String version2) {
		String[] pointNum1, pointNum2;
		pointNum1 = version1.split("\\.");
		pointNum2 = version2.split("\\.");
		int length1 = pointNum1.length;
		int length2 = pointNum2.length;
		if (length1 >= length2) {
			for (int i = 0; i < length2; i++) {
				if (atoi(pointNum1[i]) > atoi(pointNum2[i]))
					return 1;
				if (atoi(pointNum1[i]) < atoi(pointNum2[i]))
					return -1;
			}
			for (int i = length2; i < length1; i++) {
				if (atoi(pointNum1[i]) > 0)
					return 1;
			}
		} else {
			for (int i = 0; i < length1; i++) {
				if (atoi(pointNum1[i]) > atoi(pointNum2[i]))
					return 1;
				if (atoi(pointNum1[i]) < atoi(pointNum2[i]))
					return -1;
			}
			for (int i = length1; i < length2; i++) {
				if (atoi(pointNum2[i]) > 0)
					return -1;
			}
		}
		return 0;
	}

	public static int atoi(String a) {
		int resutl = 0;
		for (int i = 0, length = a.length() - 1; i < a.length(); i++, length--) {
			resutl += (a.charAt(i) - '0') * Math.pow(10, length);
		}
		return resutl;
	}
}
