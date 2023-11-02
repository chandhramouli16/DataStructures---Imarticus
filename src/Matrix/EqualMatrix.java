package Matrix;

public class EqualMatrix {

	public static void main(String[] args) {

		int rows=3;
		int columns=3;
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
				
		System.out.println("Elements of Matrix A : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Elements of Matrix B : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		int flag=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(a[i][j]!=b[i][j])
					flag=1;
			}
		}
		if(flag==1)
			System.out.println("Not equal matrices");
		else
			System.out.println("Equal matrices");
		
		
	}

}
