package business;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

//*************************************************************************************************
//
//                       This class contains Transaction information
//
//*************************************************************************************************
public class Transaction {

	//class variables
	private double totalCostPerTransaction;
	static int transactionID = 0;
	Product product = new Product();
	Customer customer = new Customer();
	
	
	//empty constructor
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	//constructor with parameters
	public Transaction(double totalCostPerTransaction, int transactionID,
			Product product, Customer customer) {
		super();
	}
	
	// method to get a transaction ID number
	public int getTransactionID() {
		if (totalCostPerTransaction > 0) {
			transactionID++;
			this.customer.getClass();
		}
		return transactionID;
	}
	

	//method to get total cost per transaction
	public double getTotalCostPerTransaction() {
		totalCostPerTransaction = this.customer.getPurchases();
		return totalCostPerTransaction;
	}
	
	//method to set total cost per transaction
	public void setTotalCostPerTransaction(double totalCostPerTransaction) {
		this.totalCostPerTransaction = totalCostPerTransaction;
	}
	
	// method to store transaction data and save to file
	public Object[] storeTransactionData(String transactionFile, String text, boolean updateFile) {
		Object[] transactionData = new Object[4];
		transactionData[0] = transactionID;
		transactionData[1] = totalCostPerTransaction;
		transactionData[2] = product;
		transactionData[3] = customer;
		
		// Creates a file object called f
		File f = new File(transactionFile);
		// Creates FileWriter object called fw
		FileWriter fw;
		try {
			fw = new FileWriter(f, updateFile);

			// Using PrintWriter method to collect transaction data
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Transaction ID: " + transactionData[0]);
			pw.println("Transaction Cost: " + transactionData[1]);
			pw.println("Product Info: " + transactionData[2]);
			pw.println("Customer Info: " + transactionData[3]);
			pw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return transactionData;
	}

	// method to collect transaction ID's to an ArrayList and save to a file
	public void transactionIDDataList(String transactionIDFile, String text, boolean updateFile) {
		ArrayList<String> transactionIDDataList = new ArrayList<>();
		transactionIDDataList.add(transactionID, null);
		
		try {
			// Creates a file object called f
			File f = new File(transactionIDFile);
			// Creates FileWriter object called fw
			FileWriter fw;
			fw = new FileWriter(f, updateFile);
			// Using PrintWriter method to collect transactionID data
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Transaction ID number: " + transactionID);
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
