import java.util.Scanner;

public class Gugudan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c=0;
		System.out.println("구구단 단수를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		for (a=1;a<10;a++) {
			b=a*c;
			System.out.println(c+"*"+a+"="+b);
			
		}
	}

}
