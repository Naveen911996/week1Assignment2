package week1.Assignment2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss"; 
		if(text1.length()==text2.length())
			
		{
			char text3[]=text1.toCharArray();
			char text4[]=text2.toCharArray();
			Arrays.sort(text3);
			Arrays.sort(text4);
			System.out.println(text3);
			System.out.println(text4);
			if(Arrays.equals(text3,text4))
			{
				System.out.println("It is a anagram");
			}
			else
			{
			System.out.println("It is not a anagram");
			}
			
		}
	}

}
