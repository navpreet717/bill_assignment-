package asmt5;

import java.util.Date;

//internet extends bill class
class Internet extends Bill {
	private String p_name;
	private int gb_used;

	// auto generated super constructor
	public Internet(int bill_id, String bill_date, String bill_type, double tbill_amount, String p_name, int gb_used) {
		super(bill_id, bill_date, bill_type, tbill_amount);
		// TODO Auto-generated constructor stub
		// constructor
		this.p_name = p_name;
		this.gb_used = gb_used;
	}

	public String getP_name() {
		return p_name;
	}

	public int getGb_used() {
		return gb_used;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public void setGb_used(int gb_used) {
		this.gb_used = gb_used;
	}
public void display()
{
	super.display();
	System.out.println("Provider Name: "+p_name);
	System.out.println("Internet Usage: "+gb_used);
	System.out.println("***************************************");

}
}
