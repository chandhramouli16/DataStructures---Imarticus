//Pivot - Last Element
package Sorting;

import java.util.*;

public class QuickSort {

	static void printArray(int[] a,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	static void quickSort(int[] a,int low,int high) {
		
		if(low<high) {
			//Find pivot element
			//Elements smaller than pivot are on the left
			//Elements larger than pivot are on the right
			int pivot=partition(a,low,high);
			
			//Recursive call on the left of pivot
			quickSort(a,low,pivot-1);
			//Recursive call on the right of pivot
			quickSort(a,pivot+1,high);
		}
		
	}
	
	static int partition(int[] a,int low,int high) {

		int pivot=a[high];
		int i=low;
		int temp;
		
		for(int j=low;j<high;j++) {
			if(a[j]<=pivot) {
				//Swapping
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
			}
		}
		//Swapping
		temp=a[i];
		a[i]=a[high];
		a[high]=temp;
		//return the position where partition is done
		return (i);
		
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
		
		quickSort(arr,0,n-1);
		
		System.out.println("Array after quick sort : ");
		printArray(arr,n);
		//System.out.println(Arrays.toString(arr)); //To print
		
		scn.close();
		
	}

}
