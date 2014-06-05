import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class SimpleExpression {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String numbers = input.nextLine();
		String[] num = numbers.trim().split("[\\s \\- + ]+");
		String[] sign = numbers.trim().split("[\\s \\. \\d]+");

		double s = Double.parseDouble(num[0]);
		BigDecimal sum  = new BigDecimal(s);

		int counter = 1;
		for (int i = 1; i < num.length; i++) {
			double n = Double.parseDouble(num[i]);
				if(sign[counter].equals("-")) {
					
					BigDecimal bigN = new BigDecimal(n);
					sum = sum.subtract(bigN);		
					counter++;
				}
				else {
					BigDecimal bigS = new BigDecimal(n);
					sum = sum.add(bigS);
					counter++;
				}
			
		}
		DecimalFormat df = new DecimalFormat("##########.#######");
		System.out.printf("%s", df.format(sum));
		

	}

}
