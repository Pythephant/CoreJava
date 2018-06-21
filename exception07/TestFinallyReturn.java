package exception07;

public class TestFinallyReturn {
	public static int returnDouble(int n) {
		try {
			return 2*n;
		}finally {
			if(n%2==0)
				return 0;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(returnDouble(3));
	}
}
