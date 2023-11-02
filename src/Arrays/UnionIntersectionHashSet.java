package Arrays;

import java.util.*;

public class UnionIntersectionHashSet {

	static void displayUnionAndIntersection(int[] arrayOne,int[] arrayTwo) {
		Set<Integer> obj=new HashSet<>();
		int i,j;
		for(i=0;i<arrayOne.length;i++) {
			obj.add(arrayOne[i]);
		}
		for(j=0;j<arrayTwo.length;j++) {
			obj.add(arrayTwo[j]);
		}
		
		System.out.println("The Union of both arrays : ");
		for(Integer I:obj) {
			System.out.print(I+" ");
		}
		System.out.println();
		obj.clear();
		
		System.out.println("The Intersection of both arrays : ");
		for(i=0;i<arrayOne.length;i++) {
			obj.add(arrayOne[i]);
		}
		for(j=0;j<arrayTwo.length;j++) {
			if(obj.contains(arrayTwo[j])){
				System.out.print(arrayTwo[j]+" ");
			}
		}
	}
	
	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		int m,n;
		System.out.println("Enter the size of two arrays : ");
		n=scn.nextInt();
		m=scn.nextInt();
		
		int[] arrayOne=new int[n];
		int[] arrayTwo=new int[m];
		
		System.out.println("Enter the elements of first array : ");
		for(int i=0;i<n;i++)
			arrayOne[i]=scn.nextInt();
		
		System.out.println("Enter the elements of second array : ");
		for(int i=0;i<m;i++)
			arrayTwo[i]=scn.nextInt();
		
		displayUnionAndIntersection(arrayOne,arrayTwo);
		
		scn.close();
	}

}
