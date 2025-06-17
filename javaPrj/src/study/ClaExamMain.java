package study;

class ClaStud {
	int no, ban, tot, avg;
	String pname, tel;
	int [] jum;
	
	ClaStud(int no, String pname, int ban, String tel, int [] jum) {
		this.pname = pname;
		this.tel = tel;
		this.jum = jum;
		this.no = no;
		this.ban = ban;
	}
	
	ClaStud(int kor, int eng, int mat) {
		this(0, " ", 0, "", new int [] {kor, eng, mat});
	}
	
	ClaStud(int kor, int eng, int mat, int art) {
		this(0, " ", 0, "", new int [] {kor, eng, mat, art});
	}
	
	void ppp() {
		tot = 0;
		String ttt = ban+"\t"+pname+"\t"+no+"\t"+tel+"\t";
		
		for (int i : jum) {
			ttt += "\t"+ i;
			tot+= i;
		}
		avg = tot/jum.length;
		ttt += "\t"+tot+"\t"+avg;		
		System.out.println(ttt);
		
	}
}

public class ClaExamMain {

	public static void main(String[] args) {
		ClaStud [] studs = {
			new ClaStud (1,"홍길동",2,"010-1234-5687", new int [] {96,56,45}),
			new ClaStud (2,"김길동",2,"010-5823-5687", new int [] {66,56,15}),	
			new ClaStud (1,"이길동",2,"010-1974-5687", new int [] {96,66,85}),	
			new ClaStud (2,"박길동",2,"010-1742-5687", new int [] {86,76,45}),
			new ClaStud (2,"호길동",2,"010-1742-5687", new int [] {86,76,45, 78}),	
		
		};
		
	  for (ClaStud st : studs) {
		st.ppp();
	}

	}

}
