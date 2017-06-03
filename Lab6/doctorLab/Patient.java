package doctorLab;

public class Patient extends Person {
	// Define class properties
	private String name;
	private String identificationNumber;
	
	// Define class constructor
	public Patient(String name, String identificationNumber) {
		super(name);
		this.name = super.getName();
		this.identificationNumber = identificationNumber;
	}
	
	// Define class methods
	@Override
	public void writeOutput() {
		System.out.println("Name: " + this.name + "\nSocial Security #: " + this.identificationNumber + "\n");
	}
}
