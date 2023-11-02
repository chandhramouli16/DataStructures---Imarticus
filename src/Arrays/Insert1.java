package Arrays;

import java.util.Scanner;

public class Insert1 {
	
	public static void printArray(int[] a,int n) {
		for(int i=0;i<n;i++) {
			System.out.println(a[i]+" ");
		}
	}
	
	public static void insertElement(int[] a,int n,int ele,int pos) {
		int length=n;
		int index=pos-1;
		while(length>=index) {
			a[length]=a[length-1];
			length--;
		}
		a[index]=ele;
	}
	
	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n=scn.nextInt();
		
		int[] arr=new int[n+1];
		
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		System.out.println("Original Array : ");
		printArray(arr,n);
		
		System.out.println("Enter the element to insert : ");
		int insEle=scn.nextInt();
		
		System.out.println("Enter position : ");
		int pos=scn.nextInt();
		
		insertElement(arr,n,insEle,pos);
		
		System.out.println("Array after insertion : ");
		printArray(arr,n+1);
		
		scn.close();
	}

}
