
package Array;

import java.util.Scanner;

public class ArrayFirstRepeatingIndex {
	
	void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elemnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Finding first repeted number index:");
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				c++;	
				}
			}
			if(c==1)
			{
				System.out.println(i);
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayFirstRepeatingIndex A=new ArrayFirstRepeatingIndex();
		A.arr();
	}

}
