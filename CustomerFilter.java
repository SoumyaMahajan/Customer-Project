package com.hexaware.inh;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class CustomerFilter {
                
	      public static void main(String[] args) {
			
	    	  List<Customer> customerList = new ArrayList<Customer>();
	  		customerList.add(new Customer(1, "Soumya", "Khargone", 50000.00, new Date(2000, 1, 1)));
	          customerList.add(new Customer(2, "Sunitha", "Delhi", 85000.00, new Date(1995, 2, 15)));
	          customerList.add(new Customer(3, "Shwetha", "Bangalore", 70000.00, new Date(1998, 7, 20)));
	          customerList.add(new Customer(4, "David", "Kolkata", 60000.00, new Date(2002, 12, 5)));
	          customerList.add(new Customer(5, "Shivendra", "Chennai", 90000.00, new Date(1990, 9, 30)));
	          customerList.add(new Customer(6, "Ragu", "Hyderabad", 45000.00, new Date(2005, 5, 18)));
	          customerList.add(new Customer(7, "Shruti", "Pune", 75000.00, new Date(1992, 11, 12)));
	          customerList.add(new Customer(8, "Madhavan", "Delhi", 95000.00, new Date(1988, 3, 7)));
	          customerList.add(new Customer(9, "Nikhil", "Ahmedabad", 65000.00, new Date(2003, 8, 25)));
	          customerList.add(new Customer(10, "Siddharth", "Mumbai", 80000.00, new Date(1997, 4, 10)));
	          
	          Stream<Customer> filter1 = customerList.stream().filter(x -> x.getPremium() >= 80000.00);
	          
	          System.out.println("Filtered Data is..");
	          filter1.forEach(x -> {
	        	  System.out.println(x);
	          });
	        	 
	          
		}
}
