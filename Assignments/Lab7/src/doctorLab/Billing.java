package doctorLab;

public class Billing {
	// Define class properties
	private String patientName;
	private String doctorName;
	private double billingAmount;
	
	// Define class constructor
	public Billing(Doctor doctor, Patient patient) {
		this.patientName = patient.getName();
		this.doctorName = doctor.getName();
		this.billingAmount = doctor.getOfficeVisitFee();
	}
	
	// Define class methods
	public void writeOutput() {
		System.out.println("Patient Name: " + this.patientName + "\nDoctor Name: " + this.doctorName + "\nBilling Amount: $" + this.billingAmount + "\n");
	}
	
	public boolean equals(Billing billing) {
		if(this.patientName.equals(billing.patientName) && this.doctorName.equals(billing.doctorName) && ((this.billingAmount - billing.billingAmount) < 0.001)) {
			return true;
		} else {
			return false;
		}
	}
}