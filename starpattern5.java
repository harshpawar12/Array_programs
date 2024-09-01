package Array;

public class starpattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=5;
			for(int i=1;i<=n;i++)
			{
				for(int k=4;k>=i;k--)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					if(j==1||j==i)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			for(int i=1;i<=n;i++)
			{
				for(int k=1;k<=i;k++)
				{
					System.out.print(" ");
				}
				for(int j=n-1;j>=i;j--)
				{
					if(j==n-1||j==i)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
	}

}
