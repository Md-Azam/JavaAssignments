package javaInterview;

public class FinallyAndFinalize {

	protected void finalize()     
    {     
        System.out.println("Called the finalize() method");     
    }     
	/*
	 * 
	 *1. finally is the block in Java Exception Handling to
	 *  execute the important code whether the exception occurs or not
	
	2.finalize is the method in Java which is used to perform clean up processing just before object is garbage collected
	 */
	public static void main(String[] args) {
		try {
			System.out.println("try block");
			
			FinallyAndFinalize obj = new FinallyAndFinalize();
			 System.out.println("Hashcode is: " + obj.hashCode());           
		        obj = null;    
		        // calling the garbage collector using gc()   
		        System.gc();     
		        System.out.println("End of the garbage collection");    
			
		}catch(Exception e) {
			
		   System.out.println("Exception handled");  
       
      }   
      // executes regardless of exception occurred or not   
      finally {  
        System.out.println("finally block is always executed");  
      }    
      System.out.println("rest of the code...");  
	}
	
}
