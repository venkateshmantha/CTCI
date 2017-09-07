
public class RotateMatrix {
	
	public static void main(String[] args) {
		
		int[][] arr= { {1, 2, 3, 4},
		        {5, 6, 7, 8},
		        {9, 10, 11, 12},
		        {13, 14, 15, 16}
		    	};
		rotate90(arr);
		printMatrix(arr);
		
	}

	private static void rotate90(int[][] arr) {
		int r = arr.length;
		int c = arr[0].length;
		for(int i=0;i<r;i++) {
			for(int j=i;j<c;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		for (int i=0; i<c; i++)
	        for (int j=0,  k=c-1; j<k; j++,k--) {
	        		int temp = arr[j][i];
				arr[j][i] = arr[k][i];
				arr[k][i] = temp;
	        }
	}
	
	private static void printMatrix(int[][] arr) {
		int r = arr.length;
		int c = arr[0].length;
		for (int i=0; i<r; i++)
	    {
	        for (int j=0; j<c; j++)
	            System.out.print(arr[i][j]+" ");
	        System.out.println();
	    }
		
	}

}
