package Array;

import java.util.Scanner;

public class ArrayEquilibrium {
	
	void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enetr the element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			int lsum=0,rsum=0;
			for(int j=0;j<i;j++)
			{
				lsum+=a[j];
			}
			for(int k=i+1;k<a.length;k++)
			{
				rsum+=a[k];
			}
			if(lsum==rsum)
			{
				System.out.println("Equilibrim:"+(i+1)+" number: "+a[i]);
			}
		}
	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayEquilibrium A=new ArrayEquilibrium();
		A.arr();

	}

}
