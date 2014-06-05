import java.util.Arrays;
import java.util.Scanner;
public class SumCards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String hands = input.nextLine();
		String str = hands + " " + Integer.MAX_VALUE;
		String[] hand = str.split("[S H  D C  ]+ ");
		int sum = 0;
		int result  =0;
		for (int i = 0; i < hand.length - 1; i++) {
				
					if(hand[i + 1].equals(hand[i])) {
						sum += sumHands(hand[i]) * 2;
					}
					else if(i >= 1 && hand[i].equals(hand[i -1])) {
							sum += sumHands(hand[i]) * 2;
							
					}
					else {
	
						sum += sumHands(hand[i]);
					}
				
				result = sum;
			
		}
		System.out.println(result);
	}

	private static int sumHands(String string) {
		String[] face = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] suit = new String[]{"S", "H", "D", "C"};
		switch(string) {
		case "2": return 2;
		case "3": return 3;
		case "4": return 4;
		case "5": return 5;
		case "6": return 6;
		case "7": return 7;
		case "8": return 8;
		case "9": return 9;
		case "10": return 10;
		case "J": return 12;
		case "Q": return 13;
		case "K": return 14;
		case "A": return 15;
			
		}
		return 0;
	}

}
