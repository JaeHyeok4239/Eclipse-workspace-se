package lang;

public class StringMain {

	public static void main(String[] args) {
		String str1 = "Have a nice day!!!";
		String str2 = "오늘은 수요일 String 클래스를 공부해요.";
		System.out.println("---------------------length----------------------");
		System.out.println(str1.length());
		System.out.println(str2.length());
		String emptyStr=" ";
		System.out.println("empty string length:" + emptyStr.length());
		// String id = "";
		String id = null;
		if(id == null || id.equals("")) {
			System.out.println("아이디를 입력하세요.");
			
		}
		System.out.println("-------------charAt---------------");
		String userId = "$TAEsdanlqa3tu-9@!#%%@$@!@@$!@#$%!#124";
		char firstChar = userId.charAt(0);
		char lastChar = userId.charAt(userId.length()-1);
		System.out.println("first char :"+firstChar);
		System.out.println("last char :"+lastChar);
		System.out.println(" >> 아이디의 첫글자는 영문대(소)문자여야한다.");
		System.out.println(" >> 아이디는 영문대(소)문자, 숫자 여야한다.");
		if(firstChar >='a' && firstChar <= 'z' || firstChar >='A' && firstChar<='Z') {
			System.out.println(firstChar+"는 아이디 첫글자로 유효합니다.");
		}
		System.out.println("----------------userId의 유효성 체크------------------");
		for(int i = 0; i < userId.length();i++) {
			char tempChar = userId.charAt(i);
			System.out.print(tempChar+" ");
			
		}
		System.out.println();
		System.out.println("------------------substring-----------------------");
		System.out.println("Have a nice day!!!".substring(7));
		System.out.println("오늘은 수요일 String 클래스를 공부해요.".substring(4));
		
		System.out.println("Have a nice day!!!".substring(7,11));
		System.out.println("오늘은 수요일 String 클래스를 공부해요.".substring(4,7));
		
		System.out.println("------------------indexOf-----------------------");
		String email = "king4239@naver.com";
		int atSignPosition = email.indexOf("@");
		System.out.println("email at sign position:" + atSignPosition);
		System.out.println(email.substring(0,atSignPosition));
		System.out.println(email.substring(atSignPosition+1));
		
		
		
		
		System.out.println("----------------------------split--------------------------");
		String phoneNumber = "010-1234-5677";
		String[] phoneNumberArray = phoneNumber.split("-");
		for(String splitNo : phoneNumberArray) {
			System.out.println(splitNo);
		}
		
		System.out.println("-----------------replace------------------------");
		String str3 = "자바는 객체지향언어입니다. 우리는 자바를 공부합니다.";
		System.out.println(str3.replace("자바", "JAVA"));
		System.out.println(str3.replace(".", ".\n"));
		
		
		
		System.out.println("-------------toUpperCase, toLowerCase--------------");
		System.out.println("java".toUpperCase());
		System.out.println("JAVA".toLowerCase());
		System.out.println("JaVa".toLowerCase());
		
		
		
		System.out.println("----------startsWith-----------");
		String[] names= {"전경호","김미숙","김은희","신명숙","김건수","정수근"};
		for (String name : names) {
			if(name.startsWith("김")) {
				System.out.println(name);
			}
		}
		/*
		 * 김씨를 찾아서 새로운 배열에 담아보세요
		 */
		/*
		 * 1.배열크기얻기
		 */
		int count=0;
		for (String name : names) {
			if(name.startsWith("김")) {
				count++;
			}
		}
		/*
		 * 2.배열생성
		 */
		String[] kimArray=new String[count];
		/*
		 * 3.기존배열의 김씨를 새로운배열에담기
		 */
		int index=0;
		for (String name : names) {
			if(name.startsWith("김")) {
				kimArray[index] = name;
				index++;
			}
		}
		System.out.println("---------------김씨배열출력-------------");
		for (String kimName : kimArray) {
			System.out.println(kimName);
		}
		
		
		
		
	}

}
