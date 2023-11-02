package Sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n=scn.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		int temp;
		int minIndex;
		
		for(int step=0;step<n-1;step++) {
			minIndex=step;
			for(int i=step+1;i<n;i++) {
				if(arr[minIndex]>arr[i]) {
					minIndex=i;
				}
			}
			temp=arr[step];
			arr[step]=arr[minIndex];
			arr[minIndex]=temp;
		}
		
		System.out.println("Array after selection sort : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		scn.close();
	}

}
