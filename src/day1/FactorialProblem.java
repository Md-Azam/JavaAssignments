package day1;

public class FactorialProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=5 ;
int result =0;
result= fact(num);
System.out.println("result of fact is: "+ result);

int  r= 	factRecursion(num);
System.out.println(r);
	}
	
	//Using iteration .
	public static int fact(int num) {
		int val =1 ;
		for(int i=1;i<=num;i++) {
			val = val*i ;
			
		}
		return val ;
		
	
		
	}
	
	//Using recursion :
	public static int factRecursion(int num ){
		if(num ==1 ) {
			return 1;
		}
		return num * factRecursion(num -1);
	}

}
