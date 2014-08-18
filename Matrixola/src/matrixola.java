import java.util.Scanner;


public class matrixola {

	/**
	 * @param args
	 */
	static int takeM=0,takeN=0,num=0,x=0,y=0,z=0;
	public static Scanner getMN;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		getMN=new Scanner(System.in);
		System.out.println("Enter numbers of rows first");
		takeM=Integer.parseInt(getMN.next());
		System.out.println("Enter numbers of column first");
		takeN=Integer.parseInt(getMN.next());
		
		formMatrix();
		System.out.println("Enter X");
		x=Integer.parseInt(getMN.next());
		System.out.println("Enter Y");
		y=Integer.parseInt(getMN.next());
		System.out.println("Enter number you want to see");
		z=Integer.parseInt(getMN.next());
		
		ModifiedformMatrix();
		
		
		
	}
	
	private static void ModifiedformMatrix() {
		// TODO Auto-generated method stub
		int savenum=0,count=0;
		for(int i=0;i<takeM;i++)
		{
			count++;
			
			for (int j=0;j<takeN;j++)
				
			{  
				if(j==x){num=z;}
				System.out.print(num);
				System.out.print("   ");
				num++;
				
			}
			System.out.print("\n");
			num=0;
			x++;
		}
		
	}

	private static void formMatrix() 
	{
		// TODO Auto-generated method stub
		for(int i=0;i<takeM;i++)
		{
			for (int j=0;j<takeN;j++)
			{
				System.out.print(num);
				System.out.print("   ");
				num++;
			}
			System.out.print("\n");
			num=0;
		}

	}

}
