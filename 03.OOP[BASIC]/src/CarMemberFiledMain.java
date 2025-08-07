
public class CarMemberFiledMain {

	public static void main(String[] args) {
		Car car1;
		//Car클래스를 사용하여 차객체를 생성
		car1 = new Car();
 
		//차객체(car1)의 맴버필드 no에 "1234"값 대입
		car1.no="1234";
		//차객체(car1)의 맴버필드 inTime에 "12"값 대입
		car1.inTime=12;
		
		car1.outTime=16;
		
	    car1.fee = (car1.outTime-car1.inTime)*1000;
		
	    System.out.printf("------------------------------------------\n");
	    System.out.printf("%s %s %s %s\n","차량번호","입차시간","출차시간","주차요금");
	    System.out.printf("------------------------------------------\n");
	    System.out.printf("%6s %8d  %8d   ￦ %d" ,car1.no,car1.inTime,car1.outTime,car1.fee);
		
		
	}

}
