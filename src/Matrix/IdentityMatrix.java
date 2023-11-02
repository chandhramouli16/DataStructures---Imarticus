package Matrix;

import java.util.Scanner;

public class IdentityMatrix {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no. of rows : ");
		int rows=scn.nextInt();
		System.out.println("Enter no. of columns : ");
		int columns=scn.nextInt();
		
		int[][] a=new int[rows][columns];
		System.out.println("Enter elements of the Matrix : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				a[i][j]=scn.nextInt();
			}
		}
		
		System.out.println("Elements of the Matrix : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int flag=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(i==j) {
					if(a[i][j]!=1)	
						flag=1;
				}
				else {
					if(a[i][j]!=0)
						flag=1;
				}
			}

		}
		if(flag==1)
			System.out.println("Not an Identity Matrix");
		else
			System.out.println("It is an Identity Matrix");
		
		scn.close();
	}

}
