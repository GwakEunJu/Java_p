package oops_p;

class Doh {
	
	String pname;
	int heright ,width ,hypote, ban ,extend, border;
	double PI;

void input(double PI, int ban ) {
	pname = "원";
	this.PI = PI;
	this.ban = ban;
}

void input(int heright ,int width ,int hypote ) {
	pname = "직사각형";
	this.heright = heright;
	this.width = width;
	this.hypote = hypote;
}


void calc() {
	extend = 0;
	border=0;

	extend = heright * width;
	border = (heright + width)*2;
	
	if(pname == "원") {
		
	} 
	
}

void ppp() {
	calc();
	String pp = (pname+"\t"+extend+","+border);
	
	
	System.out.println(pp);
}

}




public class DoMain {

	public static void main(String[] args) {
		Doh do1 = new Doh();
		Doh do2 = new Doh();
		
		do1.input(10, 10, 10);
	
		
		
		do1.ppp();
		do2.ppp();


	}

}
