public class AcademySteff extends AcademyMember {
	
	
	public String depart; //부서
	public AcademySteff() {
		// TODO Auto-generated constructor stub
	}
	
	public AcademySteff(int no, String name, String depart) {
		super();
		this.no = no;
		this.name = name;
		this.depart = depart;
		
	}
	
	public void staffPrint() {
		this.print();
		System.out.println(this.depart);
	}
	
	

}
