package asmt5;

import java.util.Date;

//hydro class extends bill
	class Hydro extends Bill
	{
		String agency_name;
		String unit_consume;
		//auto generated constrcutor
	public Hydro(int bill_id, Date bill_date, String bill_type, double tbill_amount) {
			super(bill_id, bill_date, bill_type, tbill_amount);
			// TODO Auto-generated constructor stub
	//constructor properties
			this.agency_name=agency_name;
			this.unit_consume=unit_consume;
	}
	//getters
	public String getAgency_name() {
		return agency_name;
	}
	public String getUnit_consume() {
		return unit_consume;
	}
	//setters
	public void setAgency_name(String agency_name) {
		this.agency_name = agency_name;
	}
	public void setUnit_consume(String unit_consume) {
		this.unit_consume = unit_consume;
	}
	
	
	
	}