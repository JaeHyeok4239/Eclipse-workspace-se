
public class AcademyMemberArrayConstructorMain {

	public static void main(String[] args) {
		AcademyStudent[] students= {
				new AcademyStudent(1, "KIM", "JAVA"),
				new AcademyStudent(2, "LIM", "OFFICE"),
				new AcademyStudent(3, "SIM", "IOS")				
		};
		AcademyGangsa[] gansas= {
				new AcademyGangsa(4, "김강사","웹디자인"),
				new AcademyGangsa(5, "정강사","자바"),
		};
		AcademyStaff[] staffs= {
				new AcademyStaff(6, "심팀장","교육"),
				new AcademyStaff(7, "나대리","회계"),
		};
		System.out.println("-------------AcademyMember전체출력-----------");
		System.out.println("----------Student------------");
		for(AcademyStudent student:students ) {
			student.print();
		}
		System.out.println("----------Gangsa------------");
		for (AcademyGangsa gangsa : gansas) {
			gangsa.print();
		}
		System.out.println("----------Staff------------");
		for (AcademyStaff staff : staffs) {
			staff.print();
		}
	}

}
