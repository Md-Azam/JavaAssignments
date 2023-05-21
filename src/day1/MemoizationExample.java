package day1;

import java.util.HashMap;
import java.util.Map;

public class MemoizationExample {

	private Map<Integer, Integer> cache = new HashMap<>();

	public static void main(String[] args) {
		MemoizationExample m = new MemoizationExample();
		System.out.println("fibonaci value is " + m.fibonaci(8));
	}

	// function to find fibonacci using caching .
	public int fibonaci(int num) {
		if (cache.containsKey(num)) {
			return cache.get(num);
		}

		int result;
		if (num <= 1) {
			result = num;
		} else {
			result = fibonaci(num - 1) + fibonaci(num - 2);
		}
		cache.put(num, result);
		return result;
	}
}

/*
 * 1.Caching : when there is some frequently accessed data,then we store it into
 * memory .
 * 
 * 2. Caching mechanism: java caching System ,Ecache,caffine
 * 
 * 3.Memoization is mechanism To optimize execution time of function by caching
 * its result for specific input .
 * 
 * Memoization is common strategy in dynamic programming ,where solution for big
 * problems are composed of solution of same problem with smaller inputs.
 */
