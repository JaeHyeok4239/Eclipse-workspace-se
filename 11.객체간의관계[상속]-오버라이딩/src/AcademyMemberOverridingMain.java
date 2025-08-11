
public class AcademyMemberOverridingMain {

	public static void main(String[] args) {
		//AcademyMember academyMember=new AcademyMember(0, "아무개");
		AcademyStudent st1=new AcademyStudent(1, "KIM","JAVA");
		AcademyStudent st2=new AcademyStudent(2, "LEE","AI");

		AcademyGangsa gs1=new AcademyGangsa(3,"김강사","JAVA");	
		AcademyGangsa gs2=new AcademyGangsa(4,"정강사","DB");
		
		AcademyStaff sf1=new AcademyStaff(5, "심팀장","SALES");
		AcademyStaff sf2=new AcademyStaff(6, "김과장","ACCOUNT");
		System.out.println("--------------Student-------------");
		st1.print();
		st2.print();
		
		//st1.print();
		System.out.println();
		System.out.println(st1.getNo());
		System.out.println(st1.getName());
		System.out.println("---------Gangsa-----------");
		gs1.print();
		gs2.print();
		
		System.out.println();
		System.out.println("---------Staff--------");
		sf1.print();
		sf2.print();
		
		System.out.println();
	}

}
