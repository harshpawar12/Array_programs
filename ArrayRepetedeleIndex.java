package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRepetedeleIndex {
	/*
	 * N = 9
v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
X = 5
Output:
2 5
	 */

		void arr()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enetr the size of arrry");
			int size=sc.nextInt();
			int a[]=new int[size];
			System.out.println("Enter the element in array:");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("the first & last occurence Index");
			int ind=-1,k=5;int lastind=0;
			for(int i=0;i<a.length;i++)
			{
				
				if(a[i]==k)
				{
					if(ind==-1)
					{
						ind=i;
					}
					lastind=i;
				}
					
				
			}
			System.out.println(ind);
			System.out.println(lastind);
	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayRepetedeleIndex A=new ArrayRepetedeleIndex();
		A.arr();
		

	}

}
