
public class CarMemberMethodMain {

	public static void main(String[] args) {
		/*
		 * 1. 챠량번호 1234번차량 12시 입차
		 */
		
		
		Car car1=new Car();
		car1.no="1234";
		car1.inTime=12;
		car1.setIpChaData("1234", 12);
		
		/*
		 * 2-1. car1객체 16시출차
		 */
		car1.outTime=16;
		
		/*
		 * 2-2. 주차요금계산
		 */
		
		
		car1.calculateFee();
		
		/*
		 * 2-3.주차요금영수증출력
		 */
		
		car1.print();
		
		
	}

}
