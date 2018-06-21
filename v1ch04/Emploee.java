package v1ch04;

import java.time.LocalDate;
import java.util.Date;

public class Emploee {
	private String name;
	private double salary;
	private LocalDate hireDate;
	
	@SuppressWarnings("deprecation")
	public Emploee(String name, double salary, int year, int month, int day){
		this.name = name;
		this.salary = salary;
		this.hireDate = LocalDate.of(year, month, day);
	}
	
	public String getName(){
		return this.name;
	}
	
	public double getSalary(){
		return this.salary;
		
	}
	
	public LocalDate getDate(){
		return this.hireDate;
	}
	
	public void raiseSalary(double percentage){
		this.salary = (1 + percentage) * this.salary;
	}
	
	@Override
	public String toString() {
		return "[name:"+this.name +",salary:"+this.salary+",hiredFrom:"+this.hireDate.toString()+"]";
	}
}
