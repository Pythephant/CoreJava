package v1ch04;

public class testPrivate {
	public static void main(String[] args) {
		Student me = new Student("me");
		Student you = new Student("me");
		System.out.println(me+"---"+you);
		System.out.println(me.equals(you));
	}
	
}

class Student{
	private String name;
	public Student(String name) {
		this.name = name;
	}
	
	public boolean equals(Student other){
		if(this.name.equals(other.name)){
			return true;
		}
		return false;
	}
}

