package week1.Assignment2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		//char test1[]=test.toCharArray();
		String test1[]=test.split(" ");
		for (int i = 0; i < test1.length; i++) {
			if(i%2!=0)
			{
				char test2[] = test1[i].toCharArray();
				String rev = "";
				for (int j = test2.length - 1; j >= 0; j--) {
					rev=rev+test2[j];
				}
				System.out.println(rev);
			}
			else
			{
				System.out.println(test1[i]);
			}
		}

	}

}
