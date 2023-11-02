package Sorting;

import java.util.Scanner;

public class HeapSort {

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
		int maxIndex;
		
		for(int step=0;step<n-1;step++) {
			maxIndex=step;
			for(int i=n-1;i>=step;i--) {
				if(arr[maxIndex]>arr[i]) {
					maxIndex=i;
				}
			}
			temp=arr[maxIndex];
			arr[maxIndex]=arr[step];
			arr[step]=temp;
		}
		
		System.out.println("Array after heap sort : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		scn.close();
	}

}
