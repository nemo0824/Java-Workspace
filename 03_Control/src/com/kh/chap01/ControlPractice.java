package com.kh.chap01;

import java.util.Scanner;

public class ControlPractice {

	public void practice1() {
		// 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
		// 종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요

		System.out.printf("메뉴 번호를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");

		System.out.println("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();

		String result = "";

		switch (menu) {
		case 1:
			result = "입력 ";
			break;
		case 2:
			result = "수정 ";
			break;
		case 3:
			result = "죄회 ";
			break;
		case 4:
			result = "삭제 ";
			break;
		case 7:
			result = "종료 ";
			break;

		}
		if(result.equals( "종료")) {
			System.out.println("프로그램이 종료됩니다");
		}else {
			System.out.println(result + "메뉴입니다.");
		}
		 

	}

	public void practice2() {
		// 키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
		// 짝수가 아니면 “홀수다“를 출력하세요.
		// 양수가 아니면 “양수만 입력해주세요.”를 출력하세요.

		Scanner sc = new Scanner(System.in);
		// 양수를 입력받고, 짝수, 홀수를 판별하는 프로그램

		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {// 양수인지 확인

			if (num % 2 == 0) { // 양수이고 짝수일경우
				System.out.println("짝수 입니다");
			} else { // 양수이고 , 홀수일경우
				System.out.println("홀수 입니다");
			}
		} else {
			System.out.println("양수만 입력해주세요.");

		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수 :");
		int kor =sc.nextInt();
		
		System.out.println("수학점수 :");
		int math =sc.nextInt();
		
		
		System.out.println("영어점수 :");
		int eng =sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3;
		
		if(kor>=40 && math>=40 && eng>=40 && avg>=60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다 합격입니다");
			
		} else {
			System.out.println("불밯ㅂ격 입니다");
		}
		
		
		
		
	}
	
	
	
	public void practice4 ()  {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~12 사이의 정수 입력 :");
		int month = sc.nextInt();
		
		switch(month) {
		    case 1 : 
			case 2 :
			case 12 : System.out.println(month +"월은 겨울입니다."); break;
			
			case 3 :
			case 4 :
			case 5 : System.out.println(month + "월은 봄입니다."); break;
			
			case 6 : 
			case 7 :
			case 8 : System.out.println(month + "월은 여름입니다"); break;
			
			case 9 :
			case 10 :
			case 11 : System.out.println(month + "월은 가을입니다."); break;
			
			
			default : System.out.println(month + "월은 잘못 입력된 달입니다");
				
			
			
			
		}
		
		
	}
	
	
	public void practice5 () {
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("아이디 : ");
		String id =sc.nextLine();
		
		
		System.out.println("비밀번호 : ");
		String pwd =sc.nextLine();
		
		// 1. 아이디값 잘 입력했는지 체크할것
		// 2. 아이디값이 잘 입력되었다면 비밀번호를 잘입력했는지 체크할섯
		
		if(id.equals("minmin")) {//아이디 값이 잘 입력 했는지 체크
			if(pwd.equals("Min1234"))  {// 비밀번호 잘입력했는지 체크
				System.out.println();
			}
			
		}
		
	}
	
	public void practice6() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.nextLine();
		
		switch(grade) { 
		
		case "관리자 " :System.out.print("회원관리, 게시글 관리");
		case "회원 " : System.out.print("게시글 작성 , 댓글 작성 ");
		case "비회원 " :	System.out.println("게시글 죄회");
		}
	}
	
	
	
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("키 를 입력해주세요");
		double height =sc.nextDouble();
		
		System.out.println("몸무게(kg)를 입력해주세요 : ");
		double kg =sc.nextDouble();
		
		double BMI = kg / (height*height);
		
		String result = "";
		
		
		if(BMI < 18.5) {
			result = "저체중";
		}else if (BMI < 23) {
			result = "정상체중";
		}else if (BMI <25) {
			result = "과체중";
		}else if (BMI <30) {
			result =  "비만";
		}else {
			result = "고도비만";
		}
		System.out.println("BMI 지수 : " +BMI);
		System.out.println(result);
		
		
		
	}
	
	public void practice8 () {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("피연산자 1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자 2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("연산자 입력 ( +, - , %, /, %) :");
		char op =sc.nextLine().charAt(0);
		
		switch (op) {
		case '+' : System.out.printf("%d %c %d = %d", num1 , op, num2, (num1+num2)); break;
		case '-' : System.out.printf("%d %c %d = %d", num1 , op, num2, (num1-num2)); break;
		case '*' : System.out.printf("%d %c %d = %d", num1 , op, num2, (num1*num2)); break;
		case '%' : System.out.printf("%d %c %d = %f", num1 , op, num2, (num1%num2)); break;	
		case '/' : System.out.printf("%d %c %d = %d", num1 , op, num2, (num1/(double)num2)); break;	
		default : System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다");
			
			
		}
		
		
		
	}
	
	
	public void practice11 ()  {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("비밀번호 입력 (1000~9999");
		int pwd = sc.nextInt();
		
		
		if(pwd >999 && pwd<9999) {
			int first = pwd %10; //일의 자리수 구하기//자리수 체크
			int second = (pwd / 10) % 10 ; //십의 자릿수 구하기
			int third = (pwd /100) % 10; //백의 자릿수 구하기
			int forth = (pwd/ 1000) % 10; //천의 자리수 구하기
			
			if(first != second && first != third && first != forth &&second != third &&
					second != forth && third != forth) {
				//성공
				System.out.println("생성 성공");
			}
		}else {//자리수가 3자리 이하거나 ,5자리 이상인경우 
			//자리수 안 맞음 출력
			System.out.println("중복 값 있음");
		}
		
	}
}
