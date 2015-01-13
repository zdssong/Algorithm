package algorithm;

import solution.Solution;

public class Main {

	public static void main(String[] arg) {
		Solution solution = new Solution();
		int[] one = new int[2];
		one[0] = 1;
		one[1] = 2;
		change(one);
		solution.singleNumber(one);
		// one[0]+=one[1]++;
		System.out.println(one[0]++);
	}

	public static void change(int[] one) {
		one[0] = 3;
	}
}
