package algorithm;

import solution.LRUCache;
import solution.Solution;

public class Main {

	public static void main(String[] arg) {
		LRUCache lru = new LRUCache(1);
		lru.set(2, 1);
		lru.get(1);
	}

	public static void change(int[] one) {
		one[0] = 3;
	}
}
