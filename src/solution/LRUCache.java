package solution;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Design and implement a data structure for Least Recently Used (LRU) cache. It
 * should support the following operations: get and set.
 * 
 * get(key) - Get the value (will always be positive) of the key if the key
 * exists in the cache, otherwise return -1.
 * 
 * set(key, value) - Set or insert the value if the key is not already present.
 * When the cache reached its capacity, it should invalidate the least recently
 * used item before inserting a new item.
 * */
public class LRUCache {

	private int capacity;
	private LinkedHashMap<Integer, Integer> map;
	
	private List<Integer> list = new ArrayList<Integer>();

	public LRUCache(int capacity) {
		this.capacity = capacity;
		map = new LinkedHashMap<Integer, Integer>(capacity,0.75f, true);
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			return map.get(key);
		} else {
			return -1;
		}
	}

	public void set(int key, int value) {
		if (map.containsKey(key)) {
			map.put(key, value);
		} else if (map.size() < capacity) {
			map.put(key, value);
		} else {
			map.remove(list.get(capacity - 1));
		}
	}

	/**
	 * 编译不通过，因为当capacity很大的时候，超过了时间限制
	 * */
	private void changeOrderUseList(int key) {
		int position = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == key)
				position = i;
		}
		for (int i = position; i >= 1; i--) {
			list.set(i, list.get(i - 1));
		}
		list.set(0, key);
	}

	/**
	 * 经过了优化，但是在编译时还是超时了
	 * */
	private void changeOrderWithPositionUseList(int key, int position) {
		for (int i = position; i >= 1; i--) {
			list.set(i, list.get(i - 1));
		}
		list.set(0, key);
	}

}
