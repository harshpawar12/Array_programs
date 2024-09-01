package Array;

public class NumberPattern {
	void pattenr ()
	{
		int n=7;
		for(int i=1;i<=n;i++)
		{
			
			for(int k=i;k<=n;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+"");
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print(l+"");
			}
			
			System.out.println();
			

			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *   1
           2 1 2
         3 2 1 2 3
       4 3 2 1 2 3 4
     5 4 3 2 1 2 3 4 5
   6 5 4 3 2 1 2 3 4 5 6
 7 6 5 4 3 2 1 2 3 4 5 6 7

		 */
		NumberPattern n=new NumberPattern();
		n.pattenr();

	}

}
