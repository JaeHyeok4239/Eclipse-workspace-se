import javax.swing.JOptionPane;

public class RunTimeExceptionCatchMain2 {

	public static void main(String[] args) {
		
		String str = null;
		int[] intArray = null;
		try {
		System.out.println("stmt1");
		if((int)(Math.random()*2) == 0){
			str = "예외";
			
		}
		/*
		 * 예외발생예상코드
		 */
		int length = str.length();
		/*
		 1. 예외상황발생하면  NullPointerException객체생성한후 
		예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
		 2. 던져진 예외객체는 catch block에 선언된 변수의 타입을검사해서 타입에일치하는 
		변수에 대입된다.   
		 3. 현재실행흐름은 예외가발생한곳에서 catch block으로 실행흐름이이동한다.
		 */
		System.out.println("length:"+length);
		System.out.println("stmt2");
		
		intArray = new int[3];
		/*
		 * 예외발생예상코드
		 */
		intArray[(int)(Math.random()*5)]=999;
		/*
		 1. 예외상황발생하면  ArrayIndexOutOfBoundsException객체생성한후 
			예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
		 2. 던져진 예외객체는 catch block에 선언된 변수의 타입을검사해서 타입에일치하는 
			변수에 대입된다.   
		 3. 현재실행흐름은 예외가발생한곳에서 catch block으로 실행흐름이이동한다.
		*/
		System.out.println(intArray[0]+" ");
		System.out.println(intArray[1]+" ");
		System.out.println(intArray[2]+" ");
		System.out.println();
		System.out.println("stmt3");
		} catch(Exception e) {
			System.out.println("---------------- catch start [Exception]----------------");
			System.out.println("Exception:"+e.getMessage());
			
			System.out.println("---------------- catch start [Exception]----------------");
			JOptionPane.showMessageDialog(null,  "호갱님 죄송합니다. 프로그램을 종료합니다.");
			
			/*
		     * Terminates the currently running Java Virtual Machine.
		     */
			
			System.exit(0);
		}
		
		
		
		System.out.println("stmt99");
		System.out.println("JVM 실행흐름 return");
		return;
	}

}
