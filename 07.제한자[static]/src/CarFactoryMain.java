
public class CarFactoryMain {

	public static void main(String[] args) {
		
		
		System.out.println("차량생산대수:"+Car.count);
		Car.count=0;
	
		Car car1=new Car(1, "SM7",  "RED");
		Car car2=new Car(2, "BMW",  "WHITE");
		Car car3=new Car(3, "SM8",  "BLACK");
		System.out.println("차량총생산대수:"+Car.count);
	    car1.headerPrint();
		car1.print();
		car2.print();
		car3.print();
		
		
		/************** case2 ************************
		System.out.println("차량생산대수:"+Car.getCount());
		Car.setCount(0);
		Car car1=new Car(1, "SM7", "RED");
		Car car2=new Car(2, "BMW", "WHITE");
		Car car3=new Car(3, "SM8", "BLACK");
		System.out.println("차량총생산대수:"+Car.getCount());
		Car.headerPrint();
		car1.print();
		car2.print();
		car3.print();
		********************************************/
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
