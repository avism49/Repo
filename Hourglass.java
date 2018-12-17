package assignmts;

public class Hourglass {

	public static void main(String[] args) {
		int [][] a={ {1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0} };

		int max=Integer.MIN_VALUE;

		int glass;

		for(int i=0;i<4;i++)

		{

		for(int j=0;j<4;j++)

		{

		glass=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];

		
		max=Math.max(glass,max);
		}
		
		}
		
		System.out.println(max);
}
}
