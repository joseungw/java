package bok;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		System.out.println("월요일에는 "+(++i)+"개 입니다.");
		System.out.println("화요일에는 "+(++i)+"개 입니다.");
		System.out.println("수요일에는 "+(++i)+"개 입니다.");
		System.out.println("목요일에는 "+(++i)+"개 입니다.");
		System.out.println("금요일에는 "+(++i)+"개 입니다.");
		System.out.println("토요일에는 "+(++i)+"개 입니다.");
		System.out.println("일요일에는 "+(++i)+"개 입니다.");
		int n = 0;
		for ( n=0; n<7; n++)
		{
			n++;
			System.out.println("알의 개수"+n);
		}
	}

}
