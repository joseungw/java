package three1;

import java.util.Scanner;

public class Control2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		
		System.out.println("키를 입력하세요");
		float feight=sc.nextFloat();
		
		if (score>=60)
		{
			System.out.println("합격");
		}
		else
		{
			System.out.println("불합격");
		} 
		
		//int score=68;
		
		//if(score>=60)
		{
			//System.out.println("합격");
		}
		//else
		{
			System.out.println("불합격");
		}
	}

}
