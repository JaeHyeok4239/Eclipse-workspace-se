
public class MemberMethodThisMain {

	public static void main(String[] args) {


		System.out.println("---------------------mmt1--------------------");
		MemberMethodThis mmt1=new MemberMethodThis();
		//mmt1.memberField1 = 11;
		//mmt1.memberField2 = 22;
		
		mmt1.setMemberField1(11);
		mmt1.setMemberField1(22);
		   
		//System.out.println(mmt1.memberField1);
		//System.out.println(mmt1.memberField2);
		
		
		
		
		
		
		
		System.out.println("---------------------mmt2--------------------");
		
		MemberMethodThis mmt2=new MemberMethodThis();
		
		//mmt2.memberField1 = 11;
		//mmt2.memberField2 = 22;
		
		mmt2.setMemberField1(11);
		
		
		
		mmt2.setMemberField1(22);
		

	}

}
