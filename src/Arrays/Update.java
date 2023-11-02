package Arrays;

import java.util.Scanner;

public class Update {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter number of elements : ");
		int n=scn.nextInt();
		
		int[] arr=new int[n]; 
		
		System.out.println("Enter array elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		System.out.println("Position of the element to be updated : ");
		int pos=scn.nextInt();
		
		System.out.println("Enter the element to be updated : ");
		int el=scn.nextInt();
		
		System.out.println("Original array : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		arr[pos-1]=el;
		
		System.out.println("Updated array : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		scn.close();
	}

}
