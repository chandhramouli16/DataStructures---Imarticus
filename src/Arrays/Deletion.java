package Arrays;

import java.util.Scanner;

public class Deletion {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter number of elements : ");
		int n=scn.nextInt();
		
		int[] arr=new int[n]; 
		
		System.out.println("Enter array elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		System.out.println("Position of the element to be deleted : ");
		int pos=scn.nextInt();
		
		int length=pos;
		
		System.out.println("Original array : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		while(length<n) {           
			arr[length-1]=arr[length]; 
			length++;           
		}
		
		System.out.println("Array after deletion : ");
		for(int i=0;i<n-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		scn.close();
	}

}
