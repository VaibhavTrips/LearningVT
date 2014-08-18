import java.awt.print.Printable;
import java.util.Scanner;


public class matrix {

	/**
	 * @param args
	 */
	static int[][] matrix;
	static  int num=0,val=0,takeM=0,takeN=0,x=0,y=0,z=0;
	public static Scanner getMN;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getMN=new Scanner(System.in);
		System.out.println("Enter numbers of rows first");
		takeM=Integer.parseInt(getMN.next());
		System.out.println("Enter numbers of column first");
		takeN=Integer.parseInt(getMN.next());
		matrix = new int[takeM][takeN];
		for(int i=0;i<takeM;i++)
		{
			for(int j=0;j<takeN;j++)
			{
				matrix[i][j]=val;
				val++;
			}
			val=0;
		}
		
		createMatrix();
		
		System.out.println("Enter X");
		x=Integer.parseInt(getMN.next());
		System.out.println("Enter Y");
		y=Integer.parseInt(getMN.next());
		System.out.println("Enter number you want to see");
		z=Integer.parseInt(getMN.next());
		matrix[x][y]=z;
		
		modifiedMatrix();
		
		
		
		
		
	}
	
	
	private static void modifiedMatrix() {
		// TODO Auto-generated method stub
		for(int i=0;i<takeM;i++)
		{
			for(int j=0;j<takeN;j++)
			{
				System.out.print(matrix[i][j]+" ");
				
			}
			System.out.println(" ");
			
		}
		
	}

	
	
	private static void createMatrix() {
		// TODO Auto-generated method stub
		for(int i=0;i<takeM;i++)
		{
			for(int j=0;j<takeN;j++)
			{
				System.out.print(matrix[i][j]+" ");
				
			}
			System.out.println(" ");
			
		}
	}

}
