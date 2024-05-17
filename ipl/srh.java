package ipl;

class srh {
 String bowler() {
	 return "srh bowler";
 }
 String batters() {
	 return "srh batters";
 }
	String runners() {
		return "srh runner";
	}
}

class Main{
	public static void main(String[] args) {
		srh s=new srh();
		rcb r=new rcb();
		csk c=new csk();
		
		System.out.println(s.batters());
		System.out.println(r.batters());
		System.out.println(c.batters());
		
	}
}