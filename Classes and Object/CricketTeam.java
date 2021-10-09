class CricketTeam {
    public static void main(String []a) {
	    Cricket c = new Cricket();
		byte ct;
		byte ctt;
		c.totalSeats();
		c.stadiumType();
		c.win = 5;
		ct = c.win;
		c.lose = 2;
		ctt = c.lose;
		System.out.println(ct);
		System.out.println(ctt);
	}
}