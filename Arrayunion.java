package Array;

import java.util.Arrays;
/*
 * arr1[] = {7, 1, 5, 2, 3, 6} 
arr2[] = {3, 8, 6, 20, 7} 
 */
import java.util.Scanner;

public class Arrayunion {
	/*
	 * arr1[] = {7, 1, 5, 2, 3, 6} 
		arr2[] = {3, 8, 6, 20, 7}
	 */
	
	void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the size of 1st array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Entre the size of 2nd array:");
		int size1=sc.nextInt();
		int b[]=new int[size1];
		int c[]=new int[a.length+b.length];
		int x=0;
		System.out.println("Entre the elemt in 1st array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			c[i]=a[i];
			x++;
		}
		System.out.println("Entre the elemt in 1st array:");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
			c[x]=b[i];
			x++;
		}
		System.out.println("intersection of this arry");
		System.out.println("Intersection of array:");
		for(int i=0;i<c.length;i++)
		{	
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
                    {
                        if(c[j]!=-1)
                        System.out.println("intersection:"+c[i]);
                    }
                    if(c[i]==c[j])
                    {
                        c[j]=-1;
                    }
			}
			
		}
		System.out.println("union of the array are");
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=-1)
			{
				System.out.println(c[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrayunion A=new Arrayunion();
		A.arr();

	}

}
