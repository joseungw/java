package three1;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int x = sc.nextInt();
		
		if(x>=0)
		{
			System.out.println("양수");
		}
		else if(x<=0)
		{
			System.out.println("음수");
			System.out.println("절대값"+x*-1);
		}
		
			
	}

}
