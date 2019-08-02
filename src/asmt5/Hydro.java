package asmt5;

import java.util.Date;

//Hydro class extends bill
class Hydro extends Bill {
	private String agency_name;
	private String unit_consume;

	// auto generated constrcutor
	public Hydro(int bill_id, String bill_date, String bill_type, double tbill_amount, String agency_name,
			String unit_consume) {
		super(bill_id, bill_date, bill_type, tbill_amount);
		// TODO Auto-generated constructor stub
		// constructor properties
		this.agency_name = agency_name;
		this.unit_consume = unit_consume;
	}

	// getters
	public String getAgency_name() {
		return agency_name;
	}

	public String getUnit_consume() {
		return unit_consume;
	}

	// setters
	public void setAgency_name(String agency_name) {
		this.agency_name = agency_name;
	}

	public void setUnit_consume(String unit_consume) {
		this.unit_consume = unit_consume;
	}
	public void display()
	{
super.display();
System.out.println("Comapny Name: "+agency_name);
System.out.println("Unit Consume: "+unit_consume);
System.out.println("***************************************");


	}

}