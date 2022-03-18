package pk04_2;

public class ChTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char aVar='A';
		System.out.println("aVar : " + aVar);
		System.out.println("aVar : " + (int)aVar);
		
		aVar='B';
		System.out.println("aVar : " + aVar);
		System.out.println("aVar : " + (int)aVar);
		
		int result = ((int)aVar+1); // B의 코드값 // 66
		System.out.println((char)result);
		
		
	}

}
