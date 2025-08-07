
public class OperatorLogicalPractice1 {

	public static void main(String[] args) {
		boolean isAdultA = true;
		boolean hasTicketA = true;
		
		boolean isAdultB = false;
		boolean hasTicketB = true;
		
		boolean canEnterA = isAdultA && hasTicketA;
		boolean canEnterB = isAdultB && hasTicketB;
		
		System.out.println("A 입장 가능 여부:"+(canEnterA && true));
		System.out.println("B 입장 가능 여부:"+(canEnterB && true));
		
		boolean groupCanEnter = canEnterA && canEnterB;
		boolean partialEnter = canEnterA || canEnterB;
		
		System.out.println("두 사람 모두 입장 가능:"+(groupCanEnter && true));
        System.out.println("둘 중 한 명이라도 입장 가능:"+(partialEnter && true));
        
        System.out.println("입장 상태 코드 (A, B):"+(canEnterA && true)+", "+(canEnterB && true));
        
        
        
        
        System.out.println("-------------------------------------------------------------------------");
        
        boolean salaryJang = true;
        boolean ageJang = true;
        boolean genderJang = true;
        boolean heightJang = true;
        
        boolean canWelcomeA = salaryJang && ageJang;
        boolean canWelcomeB = genderJang && heightJang;
        boolean canWelcomeC = canWelcomeA && canWelcomeB;
       
        System.out.println("우수 회원입니다"+(canWelcomeA && true));
        System.out.println("장신 남성 회원입니다."+(canWelcomeB && true));
        System.out.println("일반 회원입니다."+(canWelcomeC && false));
        
        
        System.out.println("-------------------------------------------------------------------------");
        
        
        
        boolean salaryOver1B = true;
        boolean ageOver30 = true;     
        boolean isMale = true;       
        boolean heightOver180 = true;

        boolean isExcellent = salaryOver1B && ageOver30;
        boolean isTallMan = isMale && heightOver180;

       
        String excellentMsg = (isExcellent && true) + ""; 
        String tallMsg = (isTallMan && true) + "";

       
        System.out.println(isExcellent && true ? "우수 회원입니다." : "");
        System.out.println(isTallMan && true ? "장신 남성 회원입니다." : "");
        System.out.println((isExcellent || isTallMan) && false ? "일반 회원입니다." : "");
    }
        
        
  
        
}


