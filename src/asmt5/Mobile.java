package asmt5;

import java.util.Date;

//mobile extends bill
	class Mobile extends Bill
	{
	

	String m_manufacturer_name; 
	String plan_name; 
	int m_gb;
	int m_minutes;
	int mobile_number;
	//auto generated constructor
	public Mobile(int bill_id, Date bill_date, String bill_type, double tbill_amount) {
		super(bill_id, bill_date, bill_type, tbill_amount);
		// TODO Auto-generated constructor stub
		this.m_manufacturer_name=m_manufacturer_name;
		this.plan_name=plan_name;
		this.m_gb=m_gb;
		this.m_minutes=m_minutes;
		this.mobile_number=mobile_number;
	}
	//getters
	public String getM_manufacturer_name() {
		return m_manufacturer_name;
	}
	public String getPlan_name() {
		return plan_name;
	}
	public int getM_gb() {
		return m_gb;
	}
	public int getM_minutes() {
		return m_minutes;
	}
	public int getMobile_number() {
		return mobile_number;
	}
	//setters
	public void setM_manufacturer_name(String m_manufacturer_name) {
		this.m_manufacturer_name = m_manufacturer_name;
	}
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	public void setM_gb(int m_gb) {
		this.m_gb = m_gb;
	}
	public void setM_minutes(int m_minutes) {
		this.m_minutes = m_minutes;
	}
	public void setMobile_number(int mobile_number) {
		this.mobile_number = mobile_number;
	}}