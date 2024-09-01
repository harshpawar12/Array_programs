package Array;

import java.util.Scanner;

public class intersection {
	void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size 1st array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the size 2nd array");
		int size1=sc.nextInt();
		int b[]=new int[size1];
		int c[]=new int[a.length+b.length];
		System.out.println("Enter the eleemnt in 1st array:");
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			c[i]=a[i];
			x++;
		}
		System.out.println("Enter the element in second array:");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
			c[x]=b[i];
			x++;
		}
		System.out.println("intersection in array:");
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					
					System.out.print(c[i]+" ");
					
					if(c[i]==c[j])
					{
						c[i]=-1;
					}
				}
			}
		}
		System.out.println();
		System.out.println("union in the given array:");
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=-1)
			System.out.print(c[i]+" ");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intersection i=new intersection();
		i.arr();

	}

}
