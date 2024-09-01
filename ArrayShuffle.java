package Array;

import java.util.Random;
import java.util.Scanner;

public class ArrayShuffle {
	/*
	 * nums = { 1, 2, 3, 4, 5, 6 }
Output:
Shuffle Array: [4, 2, 6, 5, 1, 3]
	 */
		void arr()
		{
			Random rd=new Random();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enetr the size of array:");
			int size=sc.nextInt();
			int a[]=new int[size];
			System.out.println("Enetr the element in array");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("------Arrey are shuffling------------");
			for(int i=0;i<a.length;i++)
			{
				int ind=rd.nextInt(size);
				int temp=a[i];
				a[i]=a[ind];
				a[ind]=temp;
				
				
			}
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayShuffle A=new ArrayShuffle();
		A.arr();

	}

}
