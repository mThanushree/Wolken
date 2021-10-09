import java.util.Scanner;
class Crickettt {
    public static void main(String []a) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the teams");
	int num;
	num = scan.nextInt();
	IplT []ipl = new IplT[num];
	
	for(int i = 0; i < ipl.length; i++) {
	scan.nextLine();
	System.out.println("enter the team name");
	String nam = scan.nextLine();
	System.out.println("enter the number of players");
	int play = scan.nextInt();
	scan.nextLine();
	System.out.println("enter the captain name");
	String cap = scan.nextLine();
	scan.nextLine();
	System.out.println("enter the color code");
	String code = scan.nextLine();
	
	IplT t = new IplT();
	t.setTeamName(nam);
	t.setNoOfPlayers(play);
	t.setCaptainName(cap);
	t.setColor(code);
	
	ipl[i] = t;
	}
	
	for(int i = 0; i < ipl.length; i++) {
	IplT t = ipl[i];
	String nim = t.getTeamName();
	int plays = t.getNoOfPlayers();
	String caps = t.getCaptainName();
	String codes = t.getColor();
	
	System.out.println(nim + " " + plays + " " + caps + " " + codes + " ");
	}
	}
}