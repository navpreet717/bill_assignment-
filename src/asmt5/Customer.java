package asmt5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Customer implements IDisplay, Comparable<Customer> {
	Integer customer_id;
	int bill_list;
	double total_amount;
	String first_name, last_name, full_name, email_id;
	int tbill;

	public Customer(Integer customer_id, int bill_list, double total_amount, String first_name, String last_name,
			String email_id, int tbill) {
		this.customer_id = customer_id;
		this.bill_list = bill_list;
		this.total_amount = total_amount;
		this.first_name = first_name;
		this.last_name = last_name;
		this.full_name = first_name + " " + last_name;
		this.email_id = email_id;
		this.tbill = tbill;

	}

//getters
	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public int getBill_list() {
		return bill_list;
	}

	public void setBill_list(int bill_list) {
		this.bill_list = bill_list;
	}

	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public int getTbill() {
		return tbill;
	}

	public void setTbill(int tbill) {
		this.tbill = tbill;
	}
	public double totalBalance() {
		double total=0;
		for(int i=0;i<Bill_List.size();i++)
		{
			Bill b1=Bill_List.get(i);
			total+=b1.getTbill_amount();
		}
		return total;
	}

//array for sorting
	ArrayList<Bill> Bill_List = new ArrayList<Bill>();

	public void add_bill(Bill bill) {
		Bill_List.add(bill);

	}

	public void sortBills() {
		// COllections.sort = default Java function that sorts an array list
		// To sort an arraylist, you need to make sure the Bill class has implemented
		// the compareTo function
		// Check the Bill.java file > compareTO function to see the implementation
		Collections.sort(this.Bill_List);
	}

//data linked to idisplay interface which will show out with detail of bills of  customer
	public void display() {

		if (Bill_List.size() == 0) {
			System.out.println("This customer has no bills");
		} else

		{
			System.out.println("---------------------BILL INFORMATION-----------------");

			sortBills();
			for (int i = 0; i < Bill_List.size(); i++) {
				Bill b1 = Bill_List.get(i);
				b1.display();
			}
		}
		System.out.println("TOTAL BILL TO PAY"+totalBalance());
		System.out.println("   ");

		}
	

//built in method when implement interface in customer class
	@Override
	public int compareTo(Customer cstmr) {
		// TODO Auto-generated method stub
		return this.getCustomer_id().compareTo(cstmr.getCustomer_id());
	}
}