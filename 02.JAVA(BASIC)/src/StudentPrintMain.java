
public class StudentPrintMain {

	public static void main(String[] args) {
		 System.out.println("학생성적관리 프로그램");
	        String name="장재혁";
	        String ID="250701";
	        int korean=92;
	        int english=88;
	        int math=100;
	        float str1=280;
	        float str2=93.3F;
	        char result2='A';
	        char rank='1';
	        
	        String name1="임광묵";
	        String ID1="250702";
	        int korean1=80;
	        int english1=88;
	        int math1=70;
	        float str5=238; 
	        float str6=79.3F;
	        char result3='C';
	        char rank1='2';
	        
	        System.out.println("----------------------------학생 성적출력--------------------------");
	        System.out.println("학번    이름     국어   영어   수학    총점    평균    평점    석차");
	        System.out.println("-------------------------------------------------------------------");
	        System.out.println(ID+"  "+name+"    "+korean+"     "+english+"    "+math+"    "+str1+"    "+str2+"      "+result2+"      "+rank);
	        System.out.println(ID1+"  "+name1+"    "+korean1+"     "+english1+"     "+math1+"    "+str5+"    "+str6+"      "+result3+"      "+rank1);
	        System.out.println("-------------------------------------------------------------------");
	}

}
