package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyOneIntoanother {
	void array()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr the size of array:");
	int size=sc.nextInt();
	int a[]=new int[size];
	int b[]=new int[size];
	System.out.println("Enetr the element in array:");
	int x=0;
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
		b[x]=a[i];
		x++;
	}
	System.out.println("Coping the ele one to amother array:");
	for(int i=0;i<b.length;i++)
	{
		for(int j=i+1;j<b.length;j++)
		{
			if(b[i]>b[j])
			{
				int temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
		}
		
	}
	System.out.println(Arrays.toString(b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayCopyOneIntoanother A=new ArrayCopyOneIntoanother();
		A.array();

	}

}
