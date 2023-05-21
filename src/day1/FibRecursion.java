package day1;

public class FibRecursion {
public static void main(String[] args) {
	
	int pos =7 ;
	int res = fib(pos);
	
	System.out.println("fib is : "+res);
}

public static int fib(int pos) {
	
	
	if(pos ==0) 
		return 0;
	
	
	if(pos ==1 || pos ==2 )
		return 1 ;
	
	return fib(8) + fib(7);
}
}
