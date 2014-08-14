import java.awt.DisplayMode;
import java.util.Scanner;


public class arrayola {

	/**
	 * @param args
	 */
	public static int [] numbers;
	public static int count=0,loopcount=0;
	public static Scanner scan;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbers= new int[10];
		scan= new Scanner(System.in);
		int num;
		num=Integer.parseInt(scan.next());
		System.out.println(num);

		for(int j=0;j<10;j++)
		{  
			loopcount++;
			if(count==num){break;}
			if(loopcount%2==0)
			{
				for (int i=9;i>=0;i--)
				{
					count++;
					numbers[i]=count;
					System.out.println("num="+count +" Arrayindex="+i);
					if(count==num){break;}
				}
			}
			else
			{
				for (int i=0;i<10;i++)
				{
					count++;
					numbers[i]=count;
					System.out.println("num="+count +" Arrayindex="+i);
					if(count==num){break;}
				}
			}
		}
		
		for(int k=0;k<10;k++)
		{
			System.out.println(numbers[k]);
		}

	}

}
