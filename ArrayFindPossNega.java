package Array;

import java.util.Scanner;

public class ArrayFindPossNega {
	/*
	 * 13.Wap to input an array and find 
  no of 0s.
  no of positive no.
  no of negative no.
	 */
	public int[] arr(int a[])
	{
		int c=0,k=0,j=0;;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				j++;
			}
			if(a[i]<0)
			{
				k++;
			}
			else if(a[i]==0)
			{
				c++;
			}
		}
		System.out.println("possitive number:"+j);
		System.out.println("Negative number:"+k);
		System.out.println("zero number:"+c);
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayFindPossNega A=new ArrayFindPossNega();
		int b[]=A.arr(a);
		
		
	}

}
