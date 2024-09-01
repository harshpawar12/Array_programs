package Array;
/*
 *      *       *
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*       *

 */
import java.util.*;

public class StarPattern {
	
	    public static void main(String[] ar) {
	        Scanner sc = new Scanner(System.in);
		System.out.print("Enter n number: ");
			int n=sc.nextInt();
			for(int i=0;i<n;i++){
				for(int k=0;k<n;k++){
					if(i==k || i+k==n-1){
					System.out.print("*");
					}else{
					System.out.print(" ");
				}
				}
			System.out.println();
			}
		
	
	
	}

}
