package generic;

import java.util.HashSet;
import java.util.Set;

public class HashSetStringWrapperMain {

	public static void main(String[] args) {
		System.out.println("------------------- String --------------------------");
		
		Set<String> authorizationSet = new HashSet<String>();
		authorizationSet.add("STAFF");
		authorizationSet.add("STUDENT");
		authorizationSet.add("GANGSA");
		authorizationSet.add("ADMIN");
		authorizationSet.add("SUPERADMIN");
		System.out.println("# set size :" + authorizationSet.size());
		System.out.println(authorizationSet);
		
		boolean isAdd = authorizationSet.add("ADMIN");
		System.out.println(" >> 추가여부:"+isAdd);
		System.out.println(authorizationSet);
		
		
		System.out.println("------------------- Wrapper --------------------------");
		Set<Integer> lottoSet = new HashSet<Integer>();
		while(lottoSet.size() < 6 ) {
			boolean isadd = lottoSet.add((int)(Math.random()*45+1));
			System.out.println(isadd);
		}
		System.out.println(lottoSet);
		
	
	
	
	}

}
