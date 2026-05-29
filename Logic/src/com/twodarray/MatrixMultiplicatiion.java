import java.util.Arrays;
class MatrixMultiplicatiion {
	public static void main(String [] o ){
		int [][] a={{1,2,3},
					{4,5,6},
					{7,8,9}};
		int [][] b={{9,8,7,},
					{6,5,4},
					{3,2,1}};
		int [][] c=new int[3][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++){
				for(int k=0;k<a[i].length;k++){
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
			
		}
		for(int[] x:c){
			for(int y:x){
				System.out.print(y+"\t");
			}
			System.out.println();
		}
	}
	
}