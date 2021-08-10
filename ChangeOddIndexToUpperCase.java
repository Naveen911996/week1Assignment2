package week1.Assignment2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		
		char test1[] = test.toCharArray();
		for (int i = 0; i < test1.length;  i++) {
			if(i%2!=0)
			{
				test1[i]=Character.toUpperCase(test1[i]);
			}
			
		}
		System.out.println(new String(test1));

	}

}
