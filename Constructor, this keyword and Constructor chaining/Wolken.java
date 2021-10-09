class Wolken {
    String id;
	String emailId;
	long contact;
	
	Wolken() {
	    System.out.println();
	}
	Wolken(String idd) {
	    id = idd;
	}

	Wolken(String idd, String emailId, long contact) {
	    this(idd);
		this.emailId = emailId;
		this.contact = contact;
	}
	void result() {
		System.out.println(id + "\t" + emailId + "\t" + contact);
	}
}