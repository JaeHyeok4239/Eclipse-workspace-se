/*
 * java.lang package 에소속된 클래스는 import 구문생략가능
 */
/*
 import 단축키
    ctrl + shift + o
 */

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.itwill.shop.ShopService;
import com.itwill.shop.product.Product;


public class JavaPackageImportMain {

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("--------java.lang package---------");
		String str1 = "임포트";
		java.lang.String str2 = "김경호";
		Object object = new Object();
		java.lang.System.out.println(java.lang.Math.random());
		System.out.println("--------java.lang 이외의 package---------");
		InputStream in;
		Socket socket = new Socket("www.naver.com", 80);
		System.out.println(socket);
		System.out.println("----------사용자정의 패키지-------------");
		ShopService shopService=new ShopService();
		System.out.println(shopService);
		Product product=new Product();
		System.out.println(product);
		com.itwill.shop.admin.Product adminProduct=new com.itwill.shop.admin.Product();
		System.out.println(adminProduct);
	}

}