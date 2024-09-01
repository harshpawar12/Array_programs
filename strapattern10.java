package Array;

public class strapattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k=n-1;k>=i;k--)
			{
				System.out.print("  ");
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();

			
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print("*");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("  ");
			}
			for(int l=n-1;l>=i;l--)
			{
				System.out.print("*");
			}
			System.out.println();

			
		}

	}

}
