package javaInterview;

public class MethodOverride {

	public static void main(String args[]) {
		B b = new B();
		b.marry();
		
		A a = new A();
		a.marry();
		
	B b1 = new A();//Overriding 
	b1.marry();
	}
	
}
//Parent Class

class B {
	public void property() {
		System.out.println("line no 20"+ " " + "gold/silver");
	}
	public void marry() //Overriden method in child class
	{
		
		System.out.println("line no 24" + ""+ "parent method : anjali/subhalaxmi");
	}
}
//Child Class
class A extends B {
	public void marry() {
		System.out.println("31" +" " + "child methos :kashaf jamal");
	}
}
