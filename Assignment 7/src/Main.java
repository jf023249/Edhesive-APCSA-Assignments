import java.util.Scanner;


public class Main {

	public static double numberScramble(double num)
	{
		if(num < 0)
		{
			return 0.0;
		}
		
		num+=5;
		num/=2;
		num = Math.sqrt(num);
		
		return num;
	}
	
	public static boolean isEdhesivePalindrome(String str)
	{
		String changed = "";
		String backwards = "";
		if(str.length() < 4 || str.length() >14)
		{
			return false;
		}
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == '4')
			{
				changed = changed + 'a';
			}
			else if(str.charAt(i) == '3')
			{
				changed = changed + 'e';
			}
			else if(str.charAt(i) == '0')
			{
				changed = changed + 'o';
			}
			else
			{
				changed = changed + str.charAt(i);
			}
		}
		for(int i = str.length()-1; i >=0; i--)
		{
			if(str.charAt(i) == '4')
			{
				backwards = backwards + 'a';
			}
			else if(str.charAt(i) == '3')
			{
				backwards = backwards + 'e';
			}
			else if(str.charAt(i) == '0')
			{
				backwards = backwards + 'o';
			}
			else
			{
				backwards = backwards + str.charAt(i);
			}
		}
		if(backwards.equalsIgnoreCase(changed))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static String duplicate(String str)
	{
		String result = "";
		if(str.length() %2 == 1)
		{
			for(int x = 0; x < str.length(); x++)
			{
				for(int i = 0; i<str.length(); i++)
				{
					result = result + str.charAt(x);
				}
			}
		}
		if(str.length() %2 ==0)
		{
			for(int x = 0; x < str.length(); x++)
			{
				for(int i = 0; i<str.length()*2; i++)
				{
					result = result + str.charAt(x);
				}
			}
		}
		return result;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
		String duplicate = scan.nextLine();
		System.out.println("The duplicated String is: " + duplicate(duplicate));
		System.out.println("Next, please enter a String to check for Edhesive Palindromes.");
		String palindrome = scan.nextLine();
		if(isEdhesivePalindrome(palindrome))
		{
			System.out.println("Nice, you found an Edhesive Palindrome!");
		}
		else
		{
			System.out.println("Too bad, that isn't an Edhesive Palindrome.");
		}
		System.out.println("Almost done! Please enter a number to scramble.");
		double num = scan.nextDouble();
		System.out.println("The scrambled number is: " + numberScramble(num));
		
	}
	
}
