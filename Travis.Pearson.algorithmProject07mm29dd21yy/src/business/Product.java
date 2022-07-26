package business;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

//********************************************************************************************
//
//                     This is the product class that contains the products
//
//********************************************************************************************
public class Product {

	//product class variables
	private static int productID;
	private static double productPrice;
	private static String productName;
	private static int quantity;
	Scanner sc = new Scanner(System.in);
	
	//empty constructor
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	//constructor with parameters
	public Product(int productID, double productPrice, String productName, int quantity) {
		super();
	
	}

	//method to get the productID
	public int getProductID() {
		if (productName == "Standard Sofa") {
			productID = 10001;
		}
		else if (productName == "Sectional Sofa") {
			productID = 10002;
		}
		else if (productName == "Chair") {
			productID = 10003;
		}
		else if (productName == "Barstool") {
			productID = 10004;
		}
		else if (productName == "Dining Chairs") {
			productID = 10005;
		}
		else if (productName == "Office Chair") {
			productID = 10006;
		}
		else {
			System.out.println("Invalid Entry");
		}
		return productID;
	}

	// method to get the product price
	public double getProductPrice() {
		if (productName == "Standard Sofa") {
			productPrice = 725;;
		}
		else if (productName == "Sectional Sofa") {
			productPrice = 1750;
		}
		else if (productName == "Chair") {
			productPrice = 325;
		}
		else if (productName == "Barstool") {
			productPrice = 65;;
		}
		else if (productName == "Dining Chairs") {
			productPrice = 125;
		}
		else if (productName == "Office Chair") {
			productPrice = 225;
		}
		else {
			System.out.println("Invalid Entry");
		}
		return productPrice;
	}
		

	// method to set the price of the product
	public static void setProductPrice(double productPrice) {
		Product.productPrice = productPrice;
	}

	//method to find out what product the customer wants and sets the price
	public void getProductName() {
		int number;
		System.out.println("**********Product List**********");
		System.out.println("Enter 1 for Standard Sofa");
		System.out.println("Enter 2 for Sectional Sofa");
		System.out.println("Enter 3 for Chair");
		System.out.println("Enter 4 for Barstool");
		System.out.println("Enter 5 for Dining Chairs");
		System.out.println("Enter 6 for Office Chair");
		System.out.println("*******************************");
		System.out.println();
		System.out.println("Enter number for the product you are purchasing: ");
		number = sc.nextInt();
		if (number == 1) {
			productName = "Standard Sofa";
			productPrice = 725;
			quantity = 30;
		}
		else if (number == 2) {
			productName = "Sectional Sofa";
			productPrice = 1750;
			quantity = 20;
		}
		else if (number == 3) {
			productName = "Chair";
			productPrice = 325;
			quantity = 50;
		}
		else if (number == 4) {
			productName = "Barstool";
			productPrice = 65;
			quantity = 125;
		}
		else if (number == 5) {
			productName = "Dining Chair";
			productPrice = 125;
			quantity = 125;
		}
		else if (number == 6) {
			productName = "Office Chair";
			productPrice = 225;
			quantity = 50;
		}
		else if (number < 1 || number > 6) {
			System.out.println("Invalid Entry");
			getProductName();
		}
		else {
			System.out.println("Invalid Entry");
			getProductName();
		}

		System.out.println("You entered " + productName + ". That costs $" + productPrice);
	}

	public int getQuantity() {
		System.out.println("How many would you like? ");
		quantity = sc.nextInt();
		if (quantity > 0) {
			System.out.println("Your total will be $" + (quantity * productPrice));
		}
		return quantity;
	}

	//method to store product data to a file
	public Object[] storeProductData(String productFile, String text, boolean updateFile) {
		Object[] productData = new Object[4];
		productData[0] = productID;
		productData[1] = productName;
		productData[2] = productPrice;
		productData[3] = quantity;
		
		// Creates a file object called f
		File f = new File(productFile);
		// Creates FileWriter object called fw
		FileWriter fw;
		try {
			fw = new FileWriter(f, updateFile);

			// Using PrintWriter method to collect product data
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Product ID: " + productData[0]);
			pw.println("Product Name: " + productData[1]);
			pw.println("Product Price: " + productData[2]);
			pw.println("Quantity Left: " + productData[3]);
			pw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return productData;
	}

	// method to save an ArrayList of products to a file for business
	public void productIDDataList(String productIDFile, String text, boolean updateFile) {
		ArrayList<String> productIDDataList = new ArrayList<>();
		productIDDataList.add(productID, productName);
		
		try {
			// Creates a file object called f
			File f = new File(productIDFile);
			// Creates FileWriter object called fw
			FileWriter fw;
			fw = new FileWriter(f, updateFile);
			// Using PrintWriter method to collect product data
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Product ID: " + productID);
			pw.println("Product Name: " + productName);
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
