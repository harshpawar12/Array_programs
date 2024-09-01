package Array;

import java.util.Scanner;

public class ArrayPositionSumCnt {
	
	public int[] arr(int a[])
	{
		int sum=0,c=0;
		System.out.println("the number are even positional:");
		for(int i=0;i<a.length;i++)
		{
			if((i+1)%2==0)
			{
				 sum+=a[i];
				c++;
				System.out.println(a[i]+" ");
			}
		}
		System.out.println("sum of even position number are:"+sum);
		System.out.println("cnt of even position number"+c);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the number in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayPositionSumCnt d=new ArrayPositionSumCnt();
		int k[]=d.arr(a);

	}

}
