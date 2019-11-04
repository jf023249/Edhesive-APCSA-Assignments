import java.util.Scanner;

public class Main {
	 
	
	public static void main(String[] args)
	{
		int input = 0;
		int mergedcount = 0;
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
		
		System.out.print("First Array: ");
		for(int i = 0; i<first.length; i++)
		{
		if(first[i] != 0)
		{
		System.out.print(first[i] + " ");
		}
		}
		System.out.println("");

		
		for(int i = 0; i< input; i++)
		{
			second[i] = (int)((Math.random()*100)+1);
		}
		
		System.out.print("Second Array: ");
		for(int i = 0; i<second.length; i++)
		{
		if(second[i] != 0)
		{
		System.out.print(second[i] + " ");
		}
		}
		System.out.println("");

		
		for(int i = 0; i< input; i++)
		{
			if(!isDuplicate(merged, first[i], mergedcount)){
			merged[mergedcount] = first[i];
			mergedcount++;
			}
			
			if(!isDuplicate(merged, second[i], mergedcount))
			{	
			merged[mergedcount] = second[i];
			mergedcount++;
			}
		}
		
		System.out.print("Merged Array: ");
		for(int i = 0; i<merged.length; i++)
		{
		if(merged[i] != 0)
		{
		System.out.print(merged[i] + " ");
		}
		}
		System.out.println("");
		
		
		
		
	}
	
	public static boolean isDuplicate(int[] merged, int j, int mergedcount) {
		
		boolean duplicate = false;
		
		if(mergedcount != 0)
		{
			for(int i = 0; i < mergedcount; i++)
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
