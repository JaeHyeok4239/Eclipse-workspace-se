
public class CalculatorMain {

	public static void main(String[] args) {
		  Calculator calculator = new Calculator();
			/*
			int result=calculator.add(23,34);
			System.out.println(result);
			result=calculator.sub(23,34);
			System.out.println(result);
			result=calculator.mul(23,34);
			System.out.println(result);
			result=calculator.div(45435,34);
			System.out.println(result);
			*/
		  
	        
		    int result = calculator.add(23, 34);
	        System.out.println("덧셈 결과: " + result);

	        result = calculator.sub(23, 34);
	        System.out.println("뺄셈 결과: " + result);

	        result = calculator.mul(23, 34);
	        System.out.println("곱셈 결과: " + result);

	        double result1 = calculator.div(45435.0, 34.0);
	        System.out.println("나눗셈 결과: " + result1);
	}

}
