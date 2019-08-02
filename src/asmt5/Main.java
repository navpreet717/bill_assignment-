package asmt5;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bill In = new Internet(2, " Tuesday 30 June, 2019", "Internet", 67, "Virgin", 5);
		Bill Hy = new Hydro(1, "Tuesday 30 June 2019", "Hydro", 30, "NavHydro", "10 Units");
		Bill Mo = new Mobile(3, "Tuesday 30 June 2019", "Mobile", 500, "Apple", "LTE", "5 GB", "500 minutes", 987655678);
		Bill Mo1 = new Mobile(4, "Tuesday 30 June 2019", "Mobile", 570, "Samsung", "3g+LTE", "7 GB", "700 minutes", 987875678);
		Customer cc = new Customer(1, 2, 97, "NAVPREET KAUR", "BAJWA", "nav@gmail.com", 700);
		Customer cc1 = new Customer(2, 3, 70, "NAV", "BAJWA", "nav717@gmail.com", 80);
		Customer cc2 = new Customer(3, 1, 67, "Gursahab", "Dhillon", "gursahab717@gmail.com", 80);
		
		cc.add_bill(Hy);
		cc.add_bill(In);
		cc1.add_bill(In);
		cc1.add_bill(Mo);
		cc1.add_bill(Mo1);
		cc2.add_bill(null);
		
		//sort customer
		Customer_list customerArray=new Customer_list();
		customerArray.customer_add(cc);
		customerArray.customer_add(cc1);
		customerArray.customer_add(cc2);
		customerArray.display();
	}

}
