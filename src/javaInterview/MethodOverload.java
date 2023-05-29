package javaInterview;

public class MethodOverload {
	

	public void m1() {
		System.out.println("empty arguments");
	}
	
	public void m1(int i) {
		System.out.println();
	}
	
	public void m1(String s) {
		System.out.println("testing method overloading");
	}
	
	public static void main(String args[]) {
	MethodOverload m = new MethodOverload();
	
	m.m1(1);
	m.m1("sanam jung");
	m.m1(10);
	
	}
}
