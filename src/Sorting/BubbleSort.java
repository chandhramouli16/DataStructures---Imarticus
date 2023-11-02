package Sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n=scn.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int temp=0;
		for(int step=0;step<n-1;step++) {
			for(int i=0;i<(n-1-step);i++) {
				if(arr[i]>arr[i+1]) { //For ascending order
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		System.out.println("Array after bubble sort : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		scn.close();
		
	}

}
