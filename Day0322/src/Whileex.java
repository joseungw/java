import java.util.Scanner;

public class Whileex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean st = true;
		int j = 0;
		Scanner sc = new Scanner(System.in);
		while(st)
		{
			System.out.println("1-10사이의 숫자를 입력하세요. 0을 입력하면 종료합니다");
			j = sc.nextInt();
			if(j==0)
			{
				st=false;
				System.out.println("0번을 입력받았습니다. 종료합니다.");
			}
		}
	}

}
