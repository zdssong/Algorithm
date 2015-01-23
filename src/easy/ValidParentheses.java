package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid
 * but "(]" and "([)]" are not.
 * 
 * url:https://oj.leetcode.com/problems/valid-parentheses/
 * */
public class ValidParentheses {

	/**
	 * pass the compile and the runtime is 180 ms
	 * */
	public boolean isValid(String s) {
		// if the number of character is not even,then the string isn't valid
		if ((s.length() % 2) != 0) {
			return false;
		}
		List<Character> list = new ArrayList<Character>();
		// when the first character is ),]or},the string is not valid
		if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}')
			return false;
		list.add(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			char temp = s.charAt(i);
			if (temp == '(' || temp == '{' || temp == '[') {
				list.add(temp);
				continue;
			}
			// when list size is zero and the next character is ),]or},the
			// string is not valid
			if (list.size() == 0)
				return false;
			if ((temp == ']' && list.get(list.size() - 1) == '[')
					|| (temp == ')' && list.get(list.size() - 1) == '(')
					|| (temp == '}' && list.get(list.size() - 1) == '{')) {
				list.remove(list.size() - 1);
			} else {
				return false;
			}
		}
		if (list.size() == 0)
			return true;
		else
			return false;
	}
}
