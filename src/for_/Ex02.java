package for_;

import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int evenSum = 0, oddSum = 0;
	for (int i=1;i<=10 ;i++) {
		if(i%2 ==0) {
			evenSum += i;
		}else {
		oddSum += i;}
		}
	System.out.println("1-10 짝수의 합"+evenSum);
	System.out.println("1-10 홀수의 합"+oddSum);
	
}
}
