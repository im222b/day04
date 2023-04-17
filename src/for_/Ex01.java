package for_;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	/* 
	 for(1.초기값 ; 2.조건식 ; 4.증감식){ (;이 2개이상은 있어야함)
	 		3.종속문장                 (조건식에 참인지 거짓인지 확인후 종속 문장 확인 후 증감식 이후 다시 동일)
	 } 
	 반복문을 사용할 경우
	 -어떠한 식이 동일하게 동작해야 하는경우
	 -어떠한 값이 규칙적으로 변하는 경우
	 */
	int i = 1, sum = 0;
	for( i = 1; i <= 10 ; i++ ) {
		sum = sum + i;
	}
	System.out.println("i :" + i);
	
	/*
	sum = sum + i; i++;
	sum = sum + i; i++;
	sum = sum + i; i++;
	sum = sum + i; i++;
	sum = sum + i; i++;
	sum = sum + i; i++;
	sum = sum + i; i++;
	sum = sum + i; i++;
	sum = sum + i; i++;
	sum = sum + i; i++;
	*/
	System.out.println("1-10의 합 : "+sum);
	
	int num;
	System.out.println("반복횟수 입력 ");
	num = input.nextInt();
	for(int k =0 ; k < num; k++)
		System.out.println("k : "+k);
	
}
}
