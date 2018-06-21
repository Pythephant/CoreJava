package v1ch03;

import java.util.Arrays;

public class testFactorial {
	public static void main(String[] args) {
		final int N = 50;
		long[][] fac = new long[N+1][];
		for (int i=0;i<=N;i++){
			fac[i] = new long[i+1];
			fac[i][0] = 1;
			//from the begining to the middle
			//fac[5] = 1,5,10 ,[10, 5, 1]
			for(int j=1;j<=(i/2);j++){
				fac[i][j] = fac[i][j-1]*(i-j+1)/j;
			}
			//copy the rest
			for(int j=0;j<=(i/2);j++){
				fac[i][i-j] = fac[i][j];
			}
		}
		
		for (long[] f:fac){
			System.out.println(Arrays.toString(f));
		}
	}
}
