package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEleGreterLeAndRi {
	/*
	 * nums= { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 }
Output:
Array with every second element is greater than its left and right elements:
[1, 4, 2, 9, 3, 8, 5, 10, 7, 14, 12]

	 */
	void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size of arrry:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enetre the element in arry:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("-------------");
		for(int i=1;i<a.length;i+=2)
		{
			if(a[i]<a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
				
			
		}
		System.out.println(Arrays.toString(a));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayEleGreterLeAndRi A=new ArrayEleGreterLeAndRi();
		A.arr();

	}

}
