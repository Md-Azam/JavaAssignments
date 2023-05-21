package assignmentDay1;

import java.util.ArrayList;
import java.util.List;

public class PascalTranleMemo {
	public static List<List<Integer>> p;
	public static void main(String[] args) {
		
		int r =6 ;
		List<List<Integer>> pascalTri = generatePascal(r);
		System.out.println(pascalTri);
		
		
		
		for(List<Integer> row : pascalTri) {
			for(int num: row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
	
	public static List<List<Integer>> generatePascal(int rows) {
		p = new ArrayList<>();
		for(int i=0;i<rows;i++) {
			List<Integer> row = new ArrayList();
			for(int j=0;j<=i;j++) {
				row.add(getCache(i,j));
			}
			p.add(row);
		}
		return p;
		
	}
	
	//method for memoization/caching:
	public static int getCache(int row,int col) {
		if(col==0 || col==row) {
			return 1;
		}
		else {
			return getCache(row-1,col-1) + getCache(row-1,col);
		}
	}
	
}
