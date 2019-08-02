package asmt5;

import java.util.Date;

//bill class created
class Bill implements IDisplay, Comparable<Bill> {
	private int bill_id;
	private String bill_date;
	private String bill_type;
	private Double tbill_amount;

	// constructor
	public Bill(int bill_id, String bill_date, String bill_type, double tbill_amount) {
		this.bill_id = bill_id;
		this.bill_date = bill_date;
		this.bill_type = bill_type;
		this.tbill_amount = tbill_amount;
	}
	// setter

	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}

	public void setBill_date(String bill_date) {
		this.bill_date = bill_date;
	}

	public void setBill_type(String bill_type) {
		this.bill_type = bill_type;
	}

	public void setTbill_amount(double tbill_amount) {
		this.tbill_amount = tbill_amount;
	}
	// getter

	public int getBill_id() {
		return bill_id;
	}

	public String getBill_date() {
		return bill_date;
	}

	public String getBill_type() {
		return bill_type;
	}

	public Double getTbill_amount() {
		return tbill_amount;
	}
	
	@Override
	public int compareTo(Bill bill2) {
		// TODO Auto-generated method stub
		return this.getTbill_amount().compareTo(bill2.getTbill_amount());
	}

	public void display() {
		// TODO Auto-generated method stub


		System.out.println("bill_id: "+bill_id);
		System.out.println("Bill Date: "+bill_date);
		System.out.println("Bill Type: "+bill_type);
		System.out.println("Bill Amount: "+tbill_amount);
		
	}

}