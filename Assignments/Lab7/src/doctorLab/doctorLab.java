package doctorLab;

public class doctorLab {

	public static void main(String[] args) {
		
		// Create two patients
		Patient patient1 = new Patient("FirstPatient", "1");
		Patient patient2 = new Patient("SecondPatient", "2");
		
		// Output patient information
		patient1.writeOutput();
		patient2.writeOutput();
		
		// Create two doctors
		Doctor doctor1 = new Doctor("FirstDoctor", "Doctoring", 50);
		Doctor doctor2 = new Doctor("SecondDoctor", "Doctoret", 25);
		
		// output doctor information
		doctor1.writeOutput();
		doctor2.writeOutput();
		
		// Create billing records
		Billing billing1 = new Billing(doctor1, patient1);
		Billing billing2 = new Billing(doctor1, patient2);
		Billing billing3 = new Billing(doctor2, patient1);
		
		// Output billing information
		billing1.writeOutput();
		billing2.writeOutput();
		billing3.writeOutput();
		
		// Check if two billing records are equal
		System.out.println("First billing record equal to the second = " + billing1.equals(billing2));
	}

}
