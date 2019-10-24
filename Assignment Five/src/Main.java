import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import java.lang.Math;

public class Main {

	public static void main(String[] args)
	{
		Main calculate = new Main();
		Scanner scan = new Scanner(System.in);//
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
			

			
			System.out.print("Your array is {");
			for(int y = 0; y<array.length-1; y++)
			{
				System.out.print(array[y]);
				System.out.print(", ");
			}
			System.out.print(array[array.length-1]);
			System.out.println("}");
			System.out.println("The average is " +  (sum/array.length));
			System.out.println("The range is " + (max-min));
			System.out.println("The array is " + calculate.Relationship(array));
			
		}
		
		
	}

  public String Relationship(double[] array)
  {
    boolean decreasingFlag = true;
    boolean increasingFlag = true;
    for(int i = 1; i<array.length; i++)
    {
      if(array[i] < array[i-1])
      {
        increasingFlag = false;
      }
      if(array[i] > array[i-1])
      {
        decreasingFlag = false;
      }

    }
    if(increasingFlag == true)
    {
      return "sorted in increasing order";
    }
    if(decreasingFlag == true)
    {
      return "sorted in decreasing order";
    }
    else{
      return "unsorted";
    }


  }
	
}
