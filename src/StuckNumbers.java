import java.util.Arrays;
import java.util.Scanner;
public class StuckNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String numbers = input.nextLine();
		String nums = input.nextLine();
		int counter = 0;
		String result = " ";
		boolean stuck = false;
		String[] num = nums.split(" ");
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				for (int j2 = 0; j2 < num.length; j2++) {
					for (int k = 0; k < num.length; k++) {
						result = compareNumbers(num[i], num[j], num[j2], num[k]);
						if(result != null) {
							System.out.printf("%1$s|%2$s==%3$s|%4$s", num[i], num[j], num[j2], num[k]);
							System.out.println();
							stuck = true;
						}
						
					}
				}
			}
		}
		if(stuck == false) {
			System.out.println("No");
			
	}


		
	}

	private static String compareNumbers(String string, String string2,
			String string3, String string4) {
		String first = "";
		String second = "";
		String str = "";
	
		if(string3.equals(string) == false && string3.equals(string2) == false && string4.equals(string) == false  
				&& string4.equals(string2) == false&& string4.equals(string3) == false && string2.equals(string) == false) {
			first = string + string2;
			second = string3 + string4;
			if(first.equals(second)) {
				str = string + " " + string2 + " " + string3 + " " + string4;
				return str;
				
			}
			
		}
		
		return null;
	}

}
