package switch_;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*String name = null;
		while(true) {
			System.out.println("이름 입력");
			name = input.next();
			System.out.println("당신의 이름 : "+name);
			%범위에 있는 연산
		*/
		int num;
		while(true) {
			System.out.println("일 입력");
			num = input.nextInt();
			num = num%7;
			switch (num) {
			case 1:System.out.println("월요일");break;
			case 2:System.out.println("화요일");break;
			case 3:System.out.println("수요일");break;
			case 4:System.out.println("목요일");break;
			case 5:System.out.println("금요일");break;
			case 6:System.out.println("토요일");break;
			default : System.out.println("일요일");break;
			
		}	
			
			
		int num1;
		String name=null, name1= null; //null 로 초기화
		while(true) {
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			num1 = input.nextInt();
		
		switch (num1) {
		case 1:name = input.next(); System.out.println("등록성공");
		break;
		case 2:name1 = input.next(); System.out.println("등록성공");
		break;
		case 3:System.out.println("우리집 : "+name);
			   System.out.println(" 회사 : "+name1);break;
		}
		
		
	}
}
}
}


	