package Array;

public class starpattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int n=5;
			for(int i=1;i<=n;i++)
			{
				for(int j=n;j>=i;j--)
				{
					if(j==n ||i==1||i==j)
					{
					System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
					
					
				}
				System.out.println();
			}
	}

}
