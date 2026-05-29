public class Hello {
	public static void main(String [] o) {
		int [] a={-5,-3,2,-8};
		int k=1;
		int sum=0;
		int ssum=0;
		int temp=0;
		for(int i=0;i<a.length;i++){
			sum=0;
				temp=a[i];
			
			int j=0;
			while(j<a.length){
				if(j!=i)
				sum+=a[j];
				else sum+=-temp;
				j++;
			}
			if(-sum>ssum)
			ssum=sum;
		}
		System.out.println(ssum);
	}
}