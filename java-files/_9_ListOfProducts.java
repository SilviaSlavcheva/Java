import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class _9_ListOfProducts {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String fileName = "inputf.txt";
		String outputFile = "output.txt";
		Scanner fileReader = null;
		PrintStream fileOutput = null;

		 try {
			 fileReader  = new Scanner (new File(fileName), "windows-1251");
			 fileOutput = new PrintStream(outputFile, "UTF-8");
			 String num;
			 ArrayList<String> list = new ArrayList<String>();
		 while (fileReader.hasNext()) {
			 Product product = new Product();
			 product.setName(fileReader.next());
			 product.setPrice(fileReader.nextFloat());
			 String doneProduct = product.toString();
			 list.add(doneProduct);
		 }
		 Collections.sort(list);
			for (String str : list) {
				fileOutput.println(str.toString());;
			}
		 }
		 catch(FileNotFoundException fnf) {			
			 System.out.println("File " + fileName + " not found.");
			 }
			 catch(NullPointerException npe) {
			 System.err.format("File " + fileName + "not found.");
			 }
			 finally {
				 if(fileReader != null) {
					 fileReader.close();
				 }
				 if(null != fileOutput) {
					 fileOutput.close();
				 }
				 System.out.println("Scanner closed.");
			 }
	 }
	

}
class Product {
	private String name;
	private float price;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return this.price + " " + this.name;
	}
}
