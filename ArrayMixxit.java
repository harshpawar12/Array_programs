
package Array;

import java.util.Scanner;

public class ArrayMixxit {
	public void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size 1st of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the size 2nd of array:");
		int size1=sc.nextInt();
		int b[]=new int[size1];
		int c[]=new int[a.length+b.length];

		
		System.out.println("Enetr the element 1st in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enetr the element 2nd in array:");

		for(int i=b.length-1;i>=0;i--)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("The mixit array are:");
		int x=0,y=0;
		for(int i=0;i<c.length;i++)
		{
			
			
				if(i%2==0)
				{
					c[i]=a[x];
					x++;
				}
				else
				{
					c[i]=b[y];
					y++;
				}
				
			
		}
		
		System.out.println("the mixxit array are:");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayMixxit A=new ArrayMixxit();
		A.arr();
	}

}
