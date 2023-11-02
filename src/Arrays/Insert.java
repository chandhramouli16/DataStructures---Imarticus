package Arrays;

import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter number of elements : ");
		int n=scn.nextInt();
		
		int[] arr=new int[n+1]; //Dynamic Array
		
		System.out.println("Enter array elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		System.out.println("Insert element : ");
		int insEle=scn.nextInt();
		
		System.out.println("Index of the element : ");
		int index=scn.nextInt();
		
		int length=n;
		
		System.out.println("Original array : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		while(length>=index) {         //length=5 > 3, length=4 >3, length=3 >= 3  
			arr[length]=arr[length-1]; //arr[5]=arr[4]  arr[4]=arr[3] arr[3]=arr[2]
			length=length-1;           //length=4   length=3  length=2
		}
		
		arr[index]=insEle;
		
		System.out.println("Array after insertion : ");
		for(int i=0;i<n+1;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		scn.close();
	}

}
