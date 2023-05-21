package assignmentDay1;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		System.out.println("final result is" + pascal(6));
	}
	
public static List<List<Integer>> pascal(int rows){
		
		if(rows==0) return new ArrayList();
		
		List<List<Integer>> result = new ArrayList();
		for(int i=1;i<=rows;i++) {
			List<Integer> row = new ArrayList();
			for(int j=0;j<i;j++) {
				if(j==0 || j==i-1) {
					row.add(1);
				}else {
					row.add(result.get(i-2).get(j) + result.get(i-2).get(j-1));
				}
			}
			result.add(row);
		}
		return result;
	}

}
	
	
//	time coplexity - o(n2)
	
	

/*
 * Triangular array. 
 * Number of rows will be equals to number of colums .
 * [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1],[1,5,11,10,5,1]]
 * 
 *
      1 
     1 1 
    1 2 1 
   1 3 3 1 
  1 4 6 4 1 
1 5 11 10 5 1
 * 
 * 
 
 */
