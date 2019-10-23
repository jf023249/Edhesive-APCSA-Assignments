import java.util.Scanner;

public class Lesson_24_Activity_Three {

	public static void main(String [] args)
	{
		int linecount = 0;
		System.out.println("Enter a number between 0 and 100:");
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		if(input <0 || input >100)
		{
			System.out.println("error");
		}
		else {
		for(int i = input; i <=100; i++)
		{
			System.out.print(i + " ");
			linecount++;
			if(linecount == 20)
			{
				System.out.print("\n");
				linecount = 0;
			}
			
		}
		}

	}
	
}
