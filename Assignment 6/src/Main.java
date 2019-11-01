import java.util.Scanner;

public class Main {
	static int input = 0;
	static int mergedcount = 0;
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		while(input <10 )
		{
		System.out.println("Enter an array length (must be 10 or greater): ");
		input = scan.nextInt();
		}
		int[] first = new int [input];
		int[] second = new int [input];
		int[] merged = new int [input*2];
		for(int i = 0; i< input; i++)
		{
			first[i] = (int)((Math.random()*100)+1);
		}
		for(int i = 0; i< input; i++)
		{
			second[i] = (int)((Math.random()*100)+1);
		}
		
		for(int i = 0; i< input; i++)
		{
			if(isDuplicate(merged, first[i])){
			merged[mergedcount] = first[i];
			mergedcount++;
			}
			
			if(isDuplicate(merged, second[i]))
			{	
			merged[mergedcount] = second[i];
			mergedcount++;
			}
		}
		
		
		
		
		
	}
	
	public static boolean isDuplicate(int[] merged, int j) {
		
		boolean duplicate = false;
		
		if(mergedcount != 0)
		{
			for(int i = 0; i < mergedcount || i != 0; i++)
			{
				if(merged[i] == j)
				{
					duplicate = true;
					break;
				}
			}
			
		}
		return duplicate;
	}
	
}
