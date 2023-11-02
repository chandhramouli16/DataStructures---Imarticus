package Sorting;

import java.util.Scanner;

public class MergeSort {

	static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static void merge(int arr[],int p,int q,int r) {
		
		//Create L <- A[p..q] and M <- A[q+1..r]
		int n1=q-p+1;
		int n2=r-q;
		
		int L[]=new int[n1];
		int M[]=new int[n2];
		
		for(int i=0;i<n1;i++) 
			L[i]=arr[p+i];
		for(int j=0;j<n2;j++) 
			M[j]=arr[q+1+j];
		
		//Maintain current index of sub-arrays and main array
		int i=0;
		int j=0;
		int k=p;
		
		//Until we reach either end of L or M, pick larger among
		//elements L and M and place them in the correct position at A[p..r]
		while(i<n1 && j<n2) {
			if(L[i]<=M[j]) {
				arr[k]=L[i];
				i++;
			}
			else {
				arr[k]=M[j];
				j++;
			}
			k++;
		}
		
		//When we run out of elements in either L or M,
		//pickup the remaining elements and put inA[p..r]
		while(i<n1) {
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=M[j];
			j++;
			k++;
		}
		
	}
	
	static void mergeSort(int[] arr,int l,int r) {
		
		if(l<r) {
			//m is the point where the array is divided into two sub-arrays
			int m=(l+r)/2;
			
			mergeSort(arr,l,m);
			mergeSort(arr,m+1,r);
			
			//Merge the sorted sub-arrays
			merge(arr,l,m,r);
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
		
		mergeSort(arr,0,n-1);
		
		System.out.println("Array after merge sort : ");
		printArray(arr);
		
		scn.close();
		
	}
	
}
