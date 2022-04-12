package coding.test.examples;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
	
	public static void  printRow(int start,int end,int[][] matrix ,List<String> visited) {
		if(start>end) {
			for(int r=start;r>end;r--) {
				for(int c=matrix[r].length;c>=0;c--) {
					var indesx=r+""+c;
					if(!visited.contains(indesx)) {
						visited.add(indesx);
						System.out.println(r+" "+c+ " value="+matrix[r][c]);
					}
				}
			}
		}else {
			for(int r=start;r<end;r++) {
				for(int c=0;c<matrix[r].length;c++) {
					var indesx=r+""+c;
					if(!visited.contains(indesx)) {
						visited.add(indesx);
						System.out.println(r+" "+c+ " value="+matrix[r][c]);
					}
				}
			}
		}
	}
	
	public static void  printColumn(int start,int end,int[][] matrix ,List<String> visited) {
		if(start>end) {
			for(int r=start;r>end;r--) {
				for(int c=matrix[r].length;c>=0;c--) {
					var indesx=r+""+c;
					if(!visited.contains(indesx)) {
						visited.add(indesx);
						System.out.println(r+" "+c+ " value="+matrix[r][c]);
					}
				}
			}
		}else {
			for(int r=start;r<end;r++) {
				for(int c=0;c<matrix[r].length;c++) {
					var indesx=r+""+c;
					if(!visited.contains(indesx)) {
						visited.add(indesx);
						System.out.println(r+" "+c+ " value="+matrix[r][c]);
					}
				}
			}
		}
	}
	
	
	public static void printSpiral(int[][] matrix) {
		
		List<String> visited=new ArrayList<>();
		int rowStart=0;
		int rowEnd=matrix.length;
		int colStart=0;
		int colEnd=matrix[0].length;
		
		while(visited.size()<rowEnd*colEnd) {
			
			printRow(rowStart,rowEnd,matrix,visited);
			rowStart++;
			printColumn(colEnd,colStart,matrix,visited);
			colEnd--;
			
			
		}
		
		
		for(int r=0;r<matrix.length;r++) {
			for(int c=0;c<matrix[r].length;c++) {
				System.out.println(r+" "+c+ " value="+matrix[r][c]);
			}
		}
		
	}

	public static void main(String[] args) {
		int[][] matrix =  { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		printSpiral(matrix);

	}

}

//Given an m x n matrix, return all elements of the matrix in spiral order.

//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [1,2,3,6,9,8,7,4,5]
//
//Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//Output: [1,2,3,4,8,12,11,10,9,5,6,7]