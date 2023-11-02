package Arrays;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter number of elements : ");
		int n=scn.nextInt();
		
		int[] arr=new int[n]; 
		
		System.out.println("Enter array elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		System.out.println("Enter the element to be searched : ");
		int el=scn.nextInt();
		
		System.out.println("Original array : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
	
		int flag=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]==el) {
				System.out.print("Search element "+arr[i]+" is found in position "+(i+1));
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("Search element not found");
		}
		
		scn.close();
	}

}
