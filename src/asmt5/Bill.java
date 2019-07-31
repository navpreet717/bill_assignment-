package asmt5;

import java.util.Date;

//bill class created
	class Bill
	{
	int bill_id;
	Date bill_date;
	String bill_type;
	double tbill_amount;
	
	// constructor
	public Bill(int bill_id,Date bill_date,String bill_type,double tbill_amount) {
		this.bill_id=bill_id;
		this.bill_date=bill_date;
		this.bill_type=bill_type;
		this.tbill_amount=tbill_amount;
	}
	//setter

	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}

	public void setBill_date(Date bill_date) {
		this.bill_date = bill_date;
	}

	public void setBill_type(String bill_type) {
		this.bill_type = bill_type;
	}

	public void setTbill_amount(double tbill_amount) {
		this.tbill_amount = tbill_amount;
	}
	//getter

	public int getBill_id() {
		return bill_id;
	}

	public Date getBill_date() {
		return bill_date;
	}

	public String getBill_type() {
		return bill_type;
	}

	public double getTbill_amount() {
		return tbill_amount;
	}
}