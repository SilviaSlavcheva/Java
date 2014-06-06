import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;


public class _10_OrderOfProducts {
	public static void main(String[] args) throws Exception {
		String fileName = "Products.txt";
		String fileNameS = "Order.txt";
		String outputFile = "output.txt";
		Scanner fileReader = null;
		Scanner fileReaderS = null;
		PrintStream fileOutput = null;

		 try {
			 fileReader  = new Scanner (new File(fileName), "windows-1251");
			 fileReaderS = new Scanner (new File(fileNameS), "windows-1251");
			 fileOutput = new PrintStream(outputFile, "windows-1251");
			 Locale.setDefault(Locale.ROOT);
			 ArrayList<Products> products = new ArrayList<Products>();
			 while(fileReader.hasNext()) {
				 products.add(new Products(fileReader.next(), fileReader.nextDouble()));
				 
			 }
			 double result = 0;
			 while(fileReaderS.hasNext()) {
				 double quantity = fileReaderS.nextDouble();
				 String currentProduct = fileReaderS.next();
				 for (Products product : products) {
					 if(product.getName().equals(currentProduct)) {
					 result += quantity * product.getPrice();
					 }
				 }
			}
			 
				fileOutput.printf("%.2f", result);
				
			 
		 }catch(FileNotFoundException fnf) {			
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