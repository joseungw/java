package example;

public class TypeMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12, b=13;
		float c=0;
		c=(a+b)/2.0f;//35/2=12.5
		System.out.println(c);
		
		char c1='A';
		System.out.println(c1);
		
		char c2=++c1;
		System.out.println(c2);
		
	}

}
