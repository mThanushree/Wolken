class Towel {
    public static void main(String []a) {
	//Upcasting
	O o = new D();
	o.toPlay();
	
	//Downcasting
	D d = (D)o;
	d.toPlay();
	}
}