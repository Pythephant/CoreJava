package genericProgramming;

import java.time.LocalDate;

import sun.util.resources.LocaleData;

public class PairTest2 {
	public static void main(String[] args) {
		String[] birthdays = {
				"jason",
				"canddi",
				"zzz"
		};
		Pair<String> p = minmax(birthdays);
		System.out.println(p.getFirst());
		System.out.println(p.getSecond());
		
	}
	
	public static <T extends Comparable<T>> Pair<T> minmax(T[] a){
		if(a==null || a.length == 0)
			return null;
		T min = a[0];
		T max = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i].compareTo(min)<0)
				min = a[i];
			if(a[i].compareTo(max)>0)
				max = a[i];
		}
		return new Pair<T>(min,max);
	}
}
