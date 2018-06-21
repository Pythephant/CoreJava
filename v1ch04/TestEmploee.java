package v1ch04;

public class TestEmploee {
	public static void main(String[] args) {
		Emploee[] es = new Emploee[3];
		es[0] = new Emploee("jason", 10000, 1990, 06, 27);
		es[1] = new Emploee("canddi", 20000, 1990, 01, 07);
		es[2] = new Emploee("lalala", 2000000, 2022, 01, 01);
		printEms(es);
		
		es[0].raiseSalary(2);
		System.out.println(es[0]);
	}
	
	public static void printEms(Emploee[] es){
		for (Emploee e: es){
			System.out.println(e);
		}
	}
}
