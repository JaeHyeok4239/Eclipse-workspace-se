
public class AcademyMemberMain {

	public static void main(String[] args) {
		AcademyStudent st1 = new AcademyStudent(1, "KIM", "JAVA"); 
		AcademyStudent st2 = new AcademyStudent(2, "LEE", "AI"); 
		
		AcademyGangsa gs1 = new AcademyGangsa(3, "김강사", "JAVA");
		AcademyGangsa gs2 = new AcademyGangsa(4, "정강사", "DB");
		
		
		AcademyStaff sf1 = new AcademyStaff(5, "심팀장", "SALES");
		AcademyStaff sf2 = new AcademyStaff(6, "김과장", "ACCOUNT");
		
		System.out.println("--------------Student--------------");
		st1.studentPrint();
		st2.studentPrint();
		st1.print();
		
		

	}

}
