package bok;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 1개를 입력하세요");
		String str = sc.next();
		char ch = str.charAt(0);
		System.out.println((char)(ch-32));
	}

}
