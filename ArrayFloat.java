package Array;

import java.util.Scanner;

public class ArrayFloat {
	void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array;");
		float size1=sc.nextFloat();
		float f[]=new float[(int) size1];
		System.out.println("Enter the eelmnt in array:");
		for(int i=0;i<f.length;i++)
		{
			f[i]=sc.nextFloat();
		}
		System.out.println("floated array are:");
		for(int i=0;i<f.length;i++)
		{
			System.out.print(f[i]+" ");
		}
		
		
	}

	public static void main(String[] args) {
		ArrayFloat A=new ArrayFloat();
		A.arr();
		
		
	
	}

}
