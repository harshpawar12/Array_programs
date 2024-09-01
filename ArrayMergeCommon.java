package Array;

public class ArrayMergeCommon {
	/*
	 * Input: 
ar1[] = {1, 5, 10, 20, 40, 80} 
ar2[] = {6, 7, 20, 80, 100} 
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} 
Output: 20, 80
	 */
	void arr() {
		
	
		int a[]= {1,5,10,20,40,80};
		int b[]= {6, 7, 20, 80, 100}; 
		 int c[] = {3, 4, 15, 20, 30, 70, 80, 120};
		 int d[]=new int[a.length+b.length];
		 int x=0;
		 for(int i=0;i<a.length;i++)
		 {
			 d[i]=a[i];
			 x++;
		 }
		 for(int i=0;i<b.length;i++)
		 {
			 d[x]=b[i];
			 x++;
		 }
		 
		 for(int i=0;i<c.length;i++)
		 {
			 
			 for(int j=0;j<d.length;j++)
			 {
				 int temp=0;
				 if(c[i]==d[j])
				 {
					 if(temp!=c[i])
					 System.out.print(c[i]+" ");
					 c[i]=temp;
				 }
			 }
		 }
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayMergeCommon A=new ArrayMergeCommon();
		A.arr();

	}

}
