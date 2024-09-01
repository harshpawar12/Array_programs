package Array;

import java.util.Scanner;

public class ArrayhalfAsshlfDec {

	public void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size 1st of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enetr the element 1st in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array asscending and decending");
		for(int i=0;i<a.length/2;i++)
		{
			for(int j=i+1;j<a.length/2;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=a.length/2;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("the array are ready to operation");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayhalfAsshlfDec A=new ArrayhalfAsshlfDec();
		A.arr();
	}

}
