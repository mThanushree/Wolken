class Hospital {
    int id;
	String name;
	long contact;
	String address;
	String emailId;
	String website;
	String type;
	
	boolean admission() {
	    System.out.println("Number of guests");
		return true;
	}
	String provideFood() {
	    System.out.println("Amount of food");
		return "roti";
	}
	boolean vacancy(int numberOfPerson) {
	    return true;
	}
}
	
