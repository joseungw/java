package day0311;

public class charcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'a';
		System.out.println("c1="+(int)c1);
		//char c2=c1+1
		char c3=(char)(c1+1);
		System.out.println((int)c3);
		char c4 = ++c1;
		System.out.println((int)c4);
		int i = 'B'-'A';
		System.out.println(i);
		int j = '2'-'0';
		System.out.println(j);
		
	}

}
