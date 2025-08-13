class FinalFieldClass{
	public final static int PORT_NUMBER=80;
	
	public final static double INCENTIVE_RATE=0.1;
	
	public final static double PI=3.141592;
	
	public final static int EARTH_RADIUS=6400;
	
	
}



public class FinalFieldClassMain {

	public static void main(String[] args) {
		/*
		
		<< The final field FinalFieldClass.INCENTIVE_RATE cannot be assigned >>
		
		FinalFieldClass.PORT_NUMBER=81;
		FinalFieldClass.INCENTIVE_RATE=0.3;
		FinalFieldClass.PI=3.15;
		
		*/
		System.out.println(FinalFieldClass.PORT_NUMBER);
		System.out.println(FinalFieldClass.INCENTIVE_RATE);
		System.out.println(FinalFieldClass.PI);
		System.out.println(FinalFieldClass.EARTH_RADIUS);
		System.out.println("----------------- Math ----------------------");
		
		/*
		
		<< The final field FinalFieldClass.INCENTIVE_RATE cannot be assigned >>
		Math.PI = 3.111;
		Math.E = 3.111;
		
		*/
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
	}

}
