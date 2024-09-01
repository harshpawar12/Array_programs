package Array;

import java.util.Scanner;

public class ArrayTargetedvalueCnt {

	int [] arr(int a[],int T)
	{
		int c=0;
		System.out.println("Targeted values pair count is:");
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=i+1;j<a.length;j++)
			{
				sum=a[i]+a[j];
				if(sum==T)
				{
					c++;
				}
			}
		}
		System.out.println(c);
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the eleemnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Targeted element are:");
		int T=sc.nextInt();
		ArrayTargetedvalueCnt A=new ArrayTargetedvalueCnt();
		int k[]=A.arr(a, T);
	
		
	}

}
