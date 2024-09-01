package Array;

import java.util.Scanner;

public class ArrayShuffling {
	/*
	 * N = 3 
A[] = {3, 1, 1}
B[] = {6, 5, 4}
Output:
23
	 */
	int  arr(int a[],int b[])
	{
		
		int sum=0;

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				for(int k=i+1;k<b.length;k++)
				{
					if(b[j]>b[k])
					{
						int temp=b[j];
						b[j]=b[k];
						b[k]=temp;
					}
				}
			}
			sum+=a[i]*b[i];

			
			
		}
		System.out.println("the output is:");

		//System.out.println(sum);


		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		System.out.println("Enter the element 1st in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element 2nd array");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		ArrayShuffling A=new ArrayShuffling();
		int c=A.arr(a, b); // sum is here 
		System.out.println(c);
		

	}

}
