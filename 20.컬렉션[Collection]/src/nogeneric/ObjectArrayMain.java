package nogeneric;

public class ObjectArrayMain {

	public static void main(String[] args) {
		/*
		Object o1=new Account();
		Object o2=new Account();
		Object o3=new Account();
		Object o4=new Account();
		Object o5=new Account();
		*/
		
		Object[] objectArray=new Object[5];
		System.out.println("------------------Account --> Object형변환--------------");
		objectArray[0]=new Account();
		objectArray[1]=new Account();
		objectArray[2]=new Account();
		objectArray[3]=new Account();
		objectArray[4]=new Account();
		
		for (int i = 0; i < objectArray.length; i++) {
			Account account = (Account)objectArray[i];
			account.print();
		}
		System.out.println("------------------Student --> Object형변환--------------");
		Object[] objectArray2=new Object[5];
		objectArray2[0]=new Student();
		objectArray2[1]=new Student();
		objectArray2[2]=new Student();
		objectArray2[3]=new Student();
		objectArray2[4]=new Student();
		for (int i = 0; i < objectArray2.length; i++) {
			Student student =(Student)objectArray2[i];
			student.print();
		}
	}

}
