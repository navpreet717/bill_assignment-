package asmt5;

import java.util.ArrayList;
import java.util.Collections;

public class Customer_list {

	ArrayList<Customer> Customer_List = new ArrayList<Customer>();

	public void customer_add(Customer customer) {
		Customer_List.add(customer);

	}

	public void getCustomerById(int cid) {
		Customer_List.get(cid);

	}
	public void sortCustomerById()
	{
		Collections.sort(this.Customer_List);
	}
	public void display()
	{
		sortCustomerById();
		
		for(int i=0;i<Customer_List.size();i++)
		{
			Customer c1=Customer_List.get(i);
			System.out.println("customer Id:"+c1.getCustomer_id());
			System.out.println("customer Full Name: "+ c1.getFull_name());
			System.out.println("customer Email ID: "+ c1.getEmail_id());
			System.out.println("--------------------------------------");
    		c1.display();
	}	
	}

}
