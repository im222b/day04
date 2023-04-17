package day04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		/*
		if , else if 또는 else 중 하나만 실행 된다
		if(조건식){
		종속 문장
		}else if(조건식){
		종속문장
		}else if(조건식){
		....
		else{
		종속문장
		}
		*/
		
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수입력");
		num = input.nextInt();
		if(num > 100) {
			System.out.println("100보다 크다");
		}else if(num > 50) {
			System.out.println("50보다 크다");
		}else if(num > 30) {
			System.out.println("30보다 크다");
		}else {
			System.out.println("30과 같거나 작은수");
		}
		System.out.println("다음 문장들 실행");
		System.out.println();
		
		/*
		 커피의 개당 가격은 2000원 이다. 10개 초과하면 초과하는 양에 대해서만 개당 
		 1500원씩 받는다 
		 커피의 개수를 입력 받아 금액을 출력하시오.
		 10 : 20000
		 11 : 21500
		 */
		int money = 0;
		System.out.println("커피 개수입력");
		num = input.nextInt();
		if(num <= 10 ) {
			money = 2000 * num;
		}else {
			money = 20000 + (num-10) *1500;
		}
		System.out.println(num + "개수 값 : " + money);
	}
}


