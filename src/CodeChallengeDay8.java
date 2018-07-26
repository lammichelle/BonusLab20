/*
 * Create a method named sumDiag() to sum the diagonal of 2D Array
 * Hint: the method should return an int
 */
public class CodeChallengeDay8 {

	public static void main(String[] args) {
		int[][] arr2 = {{ 3, 4, 5, 6 }, 
						{ 6, 7, 8, 9 }, 
						{ 2, 3, 4, 5 }, 
						{ 7, 6, 5, 4 } };
	
		//sum of diagonal is 0,0 & 1,1 & 2,2 & 3,3
		//sum of reverse diag is 3,0 &  2,1 & 1,2 & 0,3
		
		System.out.println(sumDiag(arr2));
		System.out.println(revDiag(arr2));
		
		
		//soltuion part 1 
		int result = sumDiag1(arr2);
		System.out.println(result);
		
		System.out.println(revDiag2(arr2));
		
		
	}
	
	public static int sumDiag(int[][]arr2 ) {
		int sum = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				if (i == j ) {
					sum += arr2[i][j];
				}
			}
			
		}
		
		return sum;
	}
	
	public static int revDiag(int[][] arr2) {
		int sum2 = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				if (i + j == 3) {
					 sum2 += arr2[i][j];
				}
			}
		}
		
		
		return sum2;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	//SOLUTION:
	
	//part1
	public static int sumDiag1(int[][]arr) {
		int sum = 0; 
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][i];
			
		}
			
		return sum;
	}
	//part2 
	public static int revDiag2(int[][]arr) {
		int sum = 0;
		int revPosition = arr.length -1;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][revPosition];
			revPosition--;
			
		}
		return sum;
	}

}