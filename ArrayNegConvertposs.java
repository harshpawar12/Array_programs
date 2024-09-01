package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNegConvertposs {
	void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the eleemnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("the smallest posstive number");
		int num=-1;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]!=i)
			{
				num=i;
			break;
			}
		}
		System.out.println(num);
		//System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayNegConvertposs A=new ArrayNegConvertposs();
		A.arr();

	}

}
