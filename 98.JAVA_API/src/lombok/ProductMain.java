package lombok;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product();
		p1.setNo(2);
		p1.setName("감자깡");
		p1.setPrice(3000);
		
		Product p2=new Product(1, "새우깡", 2000);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
	}

}
