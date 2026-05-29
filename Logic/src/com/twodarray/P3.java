public class P3 {
	public static void main(String [] args) {
		int[][] a={{1,2,3},{4,5,6},{7,8,9}};
		
		for(int[] e:a){
			for(int f :e) {
				System.out.print(f+"\t");
			}
			System.out.println();
		}
		
	}
	
}