package business;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

//*******************************************************************************************
//
//           This is the customer class of the program
//
//*******************************************************************************************
public class Customer {

	// class variables
	private String lastName;
	private String firstName;
	private String customerID;
	private double purchases;
	Scanner sc = new Scanner(System.in);

	// empty constructor
	public Customer() {
		super();
	}

	// constructor with parameters
	public Customer(String lastName, String firstName, String customerID) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.customerID = customerID;

	}
	
	//constructor with parameters for Business class
	public Customer(String customerID, String lastName) {
		super();
		this.customerID = customerID;
		this.lastName = lastName;
	}

	// method to get the last name of the customer
	public String getLastName() {
		System.out.println("Enter Last Name: ");
		lastName = sc.nextLine();
		return lastName;
	}

	// method to set the last name of customer
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// method to get the first name of customer
	public String getFirstName() {
		System.out.println("Enter First Name: ");
		firstName = sc.nextLine();
		return firstName;
	}

	// method to set first name of customer
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// method to get the customer's credit card number and set as their customer ID
	public String getCustomerID() {
		System.out.println("Enter 16 digit Credit Card Number: ");
		customerID = sc.nextLine();
		purchases++;
		return customerID;
	}

	// method to set the customer ID
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	// method to get the products purchased by customer
	public double getPurchases() {
		Product product = new Product();
		
		if (purchases > 0) {
			purchases = product.getProductPrice();
		}
		return purchases;
	}

	// method to set the products purchased by customer
	public void setPurchases(double purchases) {
		this.purchases = purchases;
	}

	// method to store the customer data to a file
	public Object[] storeCustomerData(String customerFile, String text, boolean updateFile) {
		Object[] customerData = new Object[4];
		customerData[0] = this.lastName;
		customerData[1] = this.firstName;
		customerData[2] = this.customerID;
		customerData[3] = this.purchases;

		// Creates a file object called f
		File f = new File(customerFile);
		// Creates FileWriter object called fw
		FileWriter fw;
		try {
			fw = new FileWriter(f, updateFile);

			// Using PrintWriter method to collect user's personal data
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Last Name: " + customerData[0]);
			pw.println("First Name: " + customerData[1]);
			pw.println("Customer ID: " + customerData[2]);
			pw.println("Purchases Made: " + customerData[3]);
			pw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return customerData;
	}

	// method to create an ArrayList of customerID and save to a file for the business
	public void customerIDDataList(String customerIDFile, String text, boolean updateFile) {
		ArrayList<String> customerIDDataList = new ArrayList<>();
		customerIDDataList.add(customerID);

		try {
			// Creates a file object called f
			File f = new File(customerIDFile);
			// Creates FileWriter object called fw
			FileWriter fw;
			fw = new FileWriter(f, updateFile);
			// Using PrintWriter method to collect user's personal data
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Last Name: " + lastName);
			pw.println("Customer ID: " + customerID);
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// method to create an ArrayList of customer's last name and save to a file for the business
	public void customerNameDataList(String customerNameFile, String text, boolean updateFile) {
		ArrayList<String> customerNameDataList = new ArrayList<>();
		customerNameDataList.add(lastName);

		try {
			// Creates a file object called f
			File f = new File(customerNameFile);
			// Creates FileWriter object called fw
			FileWriter fw;
			fw = new FileWriter(f, updateFile);
			// Using PrintWriter method to collect user's personal data
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Customer Last Name: " + lastName);
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
