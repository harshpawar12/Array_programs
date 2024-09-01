package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHeightTour {
	void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Find the height of that tour");
		int H=sc.nextInt();
		int max=0,sum=0,secmax=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(i>0)
			{
				sum=a[i]-H;
				a[i]=sum;
	

			}
			else
			{
				sum=a[i]+H;
				a[i]=sum;
				
			}
			if(sum>max)
			{
				secmax=max;
				max=sum;
			}
			else if(sum<secmax)
			{
				secmax=sum;
			}
			
		}
		System.out.println(Arrays.toString(a));

		//System.out.println("max"+max);
		//System.out.println("secmax"+secmax);
		System.out.println("max Diffrence is: "+(max-secmax));

		//System.out.println("array are");
		/*for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayHeightTour A=new ArrayHeightTour();
		A.arr();
	}

}
