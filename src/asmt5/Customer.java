package asmt5;


class Customer implements IDisplay
{
int customer_id;
int bill_list; 
double total_amount;
String first_name, last_name, full_name, email_id;
int tbill;

public void Customer(int customer_id, int bill_list,double total_amount,String first_name, String last_name, String full_name, String email_id,int tbill)
{
	this.customer_id=customer_id;
	this.bill_list=bill_list;
	this.total_amount=total_amount;
	this.first_name=first_name;
	this.last_name=last_name;
	this.email_id=email_id;
	this.tbill=tbill;
}

//getters
public int getCustomer_id() {
	return customer_id;
}

public void setCustomer_id(int customer_id) {
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
}}