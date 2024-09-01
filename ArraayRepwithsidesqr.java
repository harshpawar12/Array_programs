package Array;

import java.util.Scanner;
//   arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9] 
//Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49].//i=3a  [i-1]

public class ArraayRepwithsidesqr {
	int [] arr(int a[])
	{
		System.out.println("the Replacing arrayu are :");
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				a[i]=a[i-1]*a[i-1];
			}
		}
		return a;
	}public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elemnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArraayRepwithsidesqr A=new ArraayRepwithsidesqr();
		int c[]=A.arr(a);
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" ");
		}
		
	}

}
