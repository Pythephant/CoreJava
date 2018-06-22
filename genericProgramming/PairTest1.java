package genericProgramming;

public class PairTest1 {
	public static void main(String[] args) {
		// String[] a = {"Mary","has","a","little","lamb"};
		// Pair<String> p = ArrayAlg.minmax(a);
		// System.out.println("Min:"+p.getFirst());
		// System.out.println("Max:"+p.getSecond());

		// double a = ArrayAlg.getMiddle(1.0, 200, 0.0); //cann't covert
		// Number&Comparable to Double
	}
}

class ArrayAlg {
	public static Pair<String> minmax(String[] a) {
		if (a == null || a.length == 0)
			return null;
		String min = a[0];
		String max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i].compareTo(min) < 0)
				min = a[i];
			if (a[i].compareTo(max) > 0)
				max = a[i];
		}
		return new Pair<>(min, max);
	}

	public static <T> T getMiddle(T... a) {
		if (a == null)
			return null;
		return a[a.length / 2];
	}

	public static <T extends Comparable<T>> T getSmallest(T[] a) {
		if (a == null)
			return null;
		T smallest = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i].compareTo(smallest) < 0)
				smallest = a[i];
		}
		return smallest;
	}
}
