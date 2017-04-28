
public class ParsingCommandLineArguments {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0;
		String arg;
		String outputfile = "";
		boolean vflag = false;
		
		System.out.println("Brute force processing of command line arguments\n");
		for (String s: args) {
	            System.out.println(s);
		  }
		
		System.out.println("\nInterpreting the arguments\n");
		  // check for arguments of the form "-logfile text.txt -verbose"
		  while (i < args.length && args[i].startsWith("-")) {
			  // get the argument and the increment the counter
			  arg = args[i++];

	    // use this type of check for flag arguments
	            if (arg.equals("-verbose")) {
	                System.out.println("verbose mode on");
	                vflag = true;
	            }

	    // use this type of check for arguments that require arguments (-logfile text.txt)
	            else if (arg.equals("-logfile")) {
	                if (i < args.length)
	                    outputfile = args[i++];
	                else
	                    System.err.println("-output requires a filename");
	               
	            }
		  }
		  if (vflag)
              System.out.println("output file = " + outputfile);
	}

}
