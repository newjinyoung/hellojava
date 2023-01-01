package ch03;

public class VIPCustomer extends Customer {
	

	double salesRatio;
	private String agentID;

	/*public VIPCustomer() {

		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer() call");
	}
	*/
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	
	public String getAgentID() {
		return agentID;
	}
}
