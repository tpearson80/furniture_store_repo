package business;

import java.util.LinkedHashMap;
import java.util.Map;

//**********************************************************************************************
//
//                     This is the business class
//
//**********************************************************************************************
public class Business extends CheckOut {

	// creates a linked hash map to store customer data
	Map<String, Customer> customerMap = new LinkedHashMap<>();
	{

		Customer customer1 = new Customer("4343456765678765", "Pearson");
		Customer customer2 = new Customer("6473627363746374", "Skywalker");
		Customer customer3 = new Customer("4343423677878987", "Solo");

		customerMap.put("6123434356545676", customer1);
		customerMap.put("6473627363746374", customer2);
		customerMap.put("4343423677878987", customer3);

		System.out.println(customerMap);
	}
	// creates a linked hash map to store product data
	Map<Product, Product> productList = new LinkedHashMap<>();
	{
		productList.keySet();
	}
	
	// creates a linked hash map to store transaction data
	Map<Transaction, Transaction> transactionList = new LinkedHashMap<>();
	{
		transactionList.keySet();
	}
	
}
