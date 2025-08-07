
public class OperatorUnary {

	public static void main(String[] args) {
        int a=1;
        int b=2;
        System.out.println("------산술연산자(부호연산자)------");
        int ar = -a;
        int br = +b;
        System.out.println(a);
        System.out.println(ar);
        System.out.println(b);
        System.out.println(br);
        System.out.println("---------논리연산자(부정연산자)-------");
        boolean myTurn=true;
        System.out.println(myTurn);
        myTurn=!myTurn;
        System.out.println(myTurn);
        myTurn=!myTurn;
        System.out.println(myTurn);
        System.out.println("------------------------[++i , --i ]---------------------------");
		int i = 5;
		int j = 5;
		++i;
		--j;
		System.out.println(i);
		System.out.println(j);
		
		
		System.out.println("------------------------[i++ , i-- ]---------------------------");
		i=5;
		j=5;
		i++;
		j--;
		System.out.println("i = "+i);
		System.out.println("j="+j);
		
		

		System.out.println("-------------------[++i1 , i2++]----------------------------");
		int i1=5;
		int i2=5;
		int i1r = ++i1;// i1  = i1+1; --> i1r=i1;
		int i2r = i2++;// i2r = i2;   --> i2=i2+1;
		System.out.println("i1 = "+i1);
		System.out.println("i1r = "+i1r);
		System.out.println("i2 = "+i2);
		System.out.println("i2r = "+i2r);
		
		
		System.out.println("------------------------------------------------------------------");
		int h=1;
		int o=2;
		int p=3;
		int k=4;
		int l=5;
		h++;
		o++;
		p++;
		k++;
		l++;
		h--;
		o--;
		p--;
		k--;
		l--;
		System.out.println("h = "+h);
		System.out.println("o = "+o);
		System.out.println("p = "+p);
		System.out.println("k = "+k);
		System.out.println("l = "+l);
		
		
		
		}

}
