package Sorting;

import java.util.Scanner;

public class BubbleSort1 {
	public static void bubblesort(int[] a,int n) {
		int temp=0;
		for(int step=0;step<n-1;step++) {
			for(int i=0;i<(n-1-step);i++) { 
				if(a[i]<a[i+1]) { //For descending order
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
	}

	public static void printarray(int[] a,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n=scn.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		bubblesort(arr,n);
		
		System.out.println("Array after bubble sort : ");
		printarray(arr,n);
				
		scn.close();
		
	}

}
