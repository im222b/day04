package day04;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 if (조건식 {//참인 경우 종속문장 실행
		 종속 문장
		 }
		 else{// if 조건이 거짓인 경우 실행
		 종속문장
		 }
		 if 문은 단독으로 사용 가능하지만 else 문은 if 문 다음에 와야한다.
		 결과적으로 if 또는 else 둘 즁 하나만 실행된다
		 */
		
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		if (num % 3 == 0 ) {
			System.out.println("입력수의 3의 배수");
		}else {
			System.out.println("입력수의 3의 배수 아님!");
		}
		System.out.println("다음 문장들 실행!!!");
		
		System.out.println();
	
		//수를 입력 받아 0보다 크고 100보다 작으면 정상 아니면 비정상 출력
		
		int num1;
		System.out.println("수 입력");
		num1 = input.nextInt();
		if(num1 > 0 && num1 < 100 ) {
			System.out.println("정상");
		}else {
			System.out.println("비정상");
		}
	}
}
