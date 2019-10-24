import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How long do you want the array?");
		int length = scan.nextInt();
		double sum = 0;
		double number = 0;
		double flag2 = Double.MAX_VALUE;
		double flag3 = Double.MIN_VALUE;
		double min = 0;
		double max = 0;
		
		if(Math.abs(length) != length)
		{
			System.out.println("Not a valid length!");
		}
		else
		{
			double[] array = new double[length];
			for(int i = 0; i < length; i++)
			{
			System.out.println("Enter a number");
			number = scan.nextDouble();
			sum += number;
			array[i] = number;
			
			if(number <= flag2)
			{
				flag2 = number;
				min = number;
			}
			if(number >= flag3)
			{
				flag3 = number;
				max = number;
					
			}
			
			}
			
			double[] finalarray = new double[array.length];
			int index = 0;

			for(int z = array.length-1; z>=0; z--)
			{
				double flag = -1;

				for(int x = 0; x<(array.length); x++)
				{
					if(array[x] > flag)
					{
						index = x;
						flag = array[x];	
						
					}
				}
				finalarray[z] = flag;
				array[index] = 0;
				
			}
			System.out.print("Your array is {");
			for(int y = 0; y<finalarray.length-1; y++)
			{
				System.out.print(finalarray[y]);
				System.out.print(", ");
			}
			System.out.print(finalarray[finalarray.length-1]);
			System.out.println("}");
			System.out.println("The average is " + (sum/finalarray.length));
			System.out.println("The range is " + (max-min));
			System.out.println("The array is sorted in increasing order");
			
		}
		
		
	}
	
}


