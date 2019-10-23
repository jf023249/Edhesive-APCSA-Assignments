public class Lesson_24_Activity_One {

	public static void main(String [] args) {
		
		int linecount = 0;
		
		for(int i = 23; i <=89; i++)
		{
			System.out.print(i + " ");
			linecount++;
			if(linecount == 10)
			{
				System.out.print("\n");
				linecount = 0;
			}
			
		}
	}
	
}