package asmt5;

import java.util.Date;

//mobile extends bill
class Mobile extends Bill {

	private String m_manufacturer_name;
	private String plan_name;
	private String m_gb;
	private String m_minutes;
	private int mobile_number;

	// auto generated constructor,
	public Mobile(int bill_id, String bill_date, String bill_type, double tbill_amount, String m_manufacturer_name,
			String plan_name, String m_gb, String m_minutes, int mobile_number) {
		super(bill_id, bill_date, bill_type, tbill_amount);
		// TODO Auto-generated constructor stub
		this.m_manufacturer_name = m_manufacturer_name;
		this.plan_name = plan_name;
		this.m_gb = m_gb;
		this.m_minutes = m_minutes;
		this.mobile_number = mobile_number;
	}

	// getters
	public String getM_manufacturer_name() {
		return m_manufacturer_name;
	}

	public String getPlan_name() {
		return plan_name;
	}

	public String getM_gb() {
		return m_gb;
	}

	public String getM_minutes() {
		return m_minutes;
	}

	public int getMobile_number() {
		return mobile_number;
	}

	// setters
	public void setM_manufacturer_name(String m_manufacturer_name) {
		this.m_manufacturer_name = m_manufacturer_name;
	}

	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}

	public void setM_gb(String m_gb) {
		this.m_gb = m_gb;
	}

	public void setM_minutes(String m_minutes) {
		this.m_minutes = m_minutes;
	}

	public void setMobile_number(int mobile_number) {
		this.mobile_number = mobile_number;
	}
public void display() {
	super.display();
	System.out.println("Manufacturer Name: "+m_manufacturer_name);
	System.out.println("Plan Name: "+plan_name);
	System.out.println("Mobile Number: "+mobile_number);
	System.out.println("Internet Usage: "+m_gb);
	System.out.println("Minute Usage: "+m_minutes);
	System.out.println("***************************************");

}
}
