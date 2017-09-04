package com.java4s;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("/customers")
public class RestfulXMLExample {
 
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Customer getCustomerDetails(@PathParam("id") int custId) { 
		
		 
     // WRITE DATABASE LOGIC TO RETRIEVE THE CUSTOMER RECORD WITH 'custID' 
		
		Customer cust = new Customer();
		cust.setCustName("Java4s");
		cust.setCustCountry("USA");
		cust.setCustId(custId);
 
		return cust;		
 	}

}