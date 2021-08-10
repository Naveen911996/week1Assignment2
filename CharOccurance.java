package week1.Assignment2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0 ;
		char str1[]= str.toCharArray();
		int length=str1.length;
		for (int i = 0; i < length; i++) {
			if(str1[i]=='e')
			{
				count++;
			}
		}
		System.out.println("Total count of e : " + count);
	}

}
