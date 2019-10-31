public class Lesson_29_Activity_One {

    public static String [] list = {"hippo", "giraffe"};

	
	public static void main(String[] args) {
		
		String maxstring = "";
		
		
		for(int i = 0; i <list.length; i++)
		{
			if(list[i].length() > maxstring.length())
			{
				maxstring = list[i];
				
			}
		}
		
		System.out.println(maxstring);
		
	}
	
}
