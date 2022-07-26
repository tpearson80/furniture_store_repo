package business;

import java.util.Scanner;

//*************************************************************************************************
//
//                       This class runs the main method of the program
//
//*************************************************************************************************

public class CheckOut {

	// Main method of program
	public static void main(String[] args) {
		menu();
		goBackMenu();
		
	}

	// method that creates the menu of the program
	public static void menu() {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("*********Main Menu**********" + "\nEnter 1 to see furniture items list: "
				+ "\nEnter 2 to make purchase: " + "\nEnter 3 to exit: ");
		System.out.println("****************************");
		number = sc.nextInt();
		
		// gets the product name if user selects 1
		if (number == 1) {
			// Creates a new product
			Product product = new Product();
			product.getProductName();
		} 
		// lets user purchase product if they select 2
		else if (number == 2) {
			// Creates a new product
			Product product = new Product();
			// Creates a new customer
			Customer customer = new Customer();
			// Creates a new transaction
			Transaction transaction = new Transaction();
			// calls the getProductName method from the Product class
			product.getProductName();
			// calls the getQuantity method from the Product class
			product.getQuantity();
			// calls the getFirstName method from the customer class
			customer.getFirstName();
			// calls the getLastName method from the customer class
			customer.getLastName();
			// calls the getCustomerID method from the customer class
			customer.getCustomerID();
			// calls the storeCustomerData method from the customer class and saves data to
			// CustomerInfo.txt
			customer.storeCustomerData("CustomerInfo.txt", "", true);
			// calls the customerIDDataList method and saves data to CustomerID.txt
			customer.customerIDDataList("CustomerID.txt", "", true);
			// calls the storeProductData method and saves data to ProductInfo.txt
			product.storeProductData("ProductInfo.txt", "", true);
			// calls the productIDDataList method and saves data to ProductID.txt
			product.productIDDataList("ProductID.txt", "", true);
			// calls the storeTransactionData method and saves data to TransactionInfo.txt
			transaction.storeTransactionData("TransactionInfo.txt", "", true);
			// calls the transactionIDDataList method and saves data to TransactionID.txt
			transaction.transactionIDDataList("TransactionID.txt", "", true);
			System.out.println("Thank you for your order!");

		// lets user exit the program	
		} else if (number == 3) {
			System.out.println("Thank you for visiting our furniture store");
			sc.close();
			System.exit(0);
		} 

		// gives error message if user enters incorrectly and sends them back to menu
		else {
			System.out.println("Error, Try Again!");
			menu();
		}
		goBackMenu();
	}

	// method that asks user if they wish to go back to the menu of the program
	private static void goBackMenu() {
		String repeat;
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to go back to the menu? "
				+ "\nEnter yes to go to menu or any other key+enter to exit: ");
		repeat = sc.nextLine();
		if (repeat.equalsIgnoreCase("yes")) {
			menu();
		} else
			System.out.println("Thank you for visiting our furniture store");
		sc.close();
		System.exit(0);
	}

}
