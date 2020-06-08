package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.  입력 ");
		System.out.println("2.  수정 ");
		System.out.println("3.  조회 ");
		System.out.println("4.  삭제 ");
		System.out.println("7.  종료 ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("입력메뉴입니다");
			break;
		case 2:
			System.out.println("수정메뉴입니다");
			break;
		case 3:
			System.out.println("조회메뉴입니다");
			break;
		case 4:
			System.out.println("삭제메뉴입니다");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다");
			break;
		}

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요");
		int nu1 = sc.nextInt();
		if (nu1 >= 0) {
			if (nu1 % 2 == 0) {
				System.out.println("짝수입니다");
			} else {
				System.out.println("홀수입니다");
			}
		} else {
			System.out.println("양수만 입력해주세요");
		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int ko = sc.nextInt();
		System.out.print("수학점수 : ");
		int ma = sc.nextInt();
		System.out.print("영어점수 : ");
		int En = sc.nextInt();
		int sum = ko + ma + En;
		double hvg = sum / 3.0;
		if (ko >= 40 || ma >= 40 || En >= 40) {
			if (hvg >= 60) {
				System.out.println("국어 : " + ko);
				System.out.println("수학 : " + ma);
				System.out.println("영어 : " + En);
				System.out.println("합계 : " + sum);
				System.out.println("평균 : " + hvg);
				System.out.println("축하합니다 합격입니다");

			} else {
				System.out.println("불합격입니다");
			}

		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력");
		int month = sc.nextInt();
		switch (month) {
		case 1:
			System.out.println(month + "월은 겨울 입니다.");
			break;
		case 2:
			System.out.println(month + "월은 겨울 입니다.");
			break;
		case 3:
			System.out.println(month + "월은 봄 입니다.");
			break;
		case 4:
			System.out.println(month + "월은 봄 입니다.");
			break;
		case 5:
			System.out.println(month + "월은 여름 입니다.");
			break;
		case 6:
			System.out.println(month + "월은 여름 입니다.");
			break;
		case 7:
			System.out.println(month + "월은 여름 입니다.");
			break;
		case 8:
			System.out.println(month + "월은 여름 입니다.");
			break;
		case 9:
			System.out.println(month + "월은 가을 입니다.");
			break;
		case 10:
			System.out.println(month + "월은 가을 입니다.");
			break;
		case 11:
			System.out.println(month + "월은 가을 입니다.");
			break;
		case 12:
			System.out.println(month + "월은 겨울 입니다.");
			break;
		default:
			System.out.println(month + "월은 잘못 입력된 달입니다");

		}
	}

	public void practice5() {
		String id = "myId";
		String pwd = "myPassword12";
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디  : ");
		String inputid = sc.next();
		System.out.print("비밀번호  : ");
		String inputpwd = sc.next();
		if (inputid.equals("myId") && inputpwd.equals("myPassword12")) {
			System.out.println("로그인 성공");
		} else if (!inputpwd.equals("myPassword12")) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else if (!inputid.equals("myId")) {
			System.out.println("아이디가 틀렸습니다.");
		}

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원등급 : ");
		String str = sc.next();
		switch (str) {
		case "관리자":
			System.out.println("회원관리,게시글 관리 게시글 작성, 댓글 작성 게시글 조회");
			break;
		case "회원":
			System.out.println("게시글 작성, 댓글 작성 게시글 조회");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;

		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double weight = sc.nextDouble();
		double bmi = weight / (height * height);
		System.out.print("BMI 지수 : " + bmi);
		System.out.println();
		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("비만");
		} else if (bmi >= 30) {
			System.out.println("고도비만");
		}
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		int nu1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int nu2 = sc.nextInt();
		System.out.print("연산자 입력(+,-,*,/,%) : ");
		String tt = sc.next();
		if (nu1 > 0 && nu2 > 0) {
			if (tt.equals("+")) {
				System.out.println(nu1 + tt + nu2 + "=" + (nu1 + nu2));
			} else if (tt.equals("-")) {
				System.out.println(nu1 + tt + nu2 + "=" + (nu1 - nu2));
			} else if (tt.equals("*")) {
				System.out.println(nu1 + tt + nu2 + "=" + (nu1 * nu2));
			} else if (tt.equals("/")) {
				System.out.println(nu1 + tt + nu2 + "=" + (nu1 / nu2));
			} else if (tt.equals("%")) {
				System.out.println(nu1 + tt + nu2 + "=" + (nu1 % nu2));
			} else {
				System.out.println("");
			}

		} else {
			System.out.println("잘못입력하셨습니다");
		}

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int fl = sc.nextInt();
		System.out.print("과제 고사 점수 : ");
		int rep = sc.nextInt();
		System.out.print("출석 횟수 : ");
		int count = sc.nextInt();
		double total = (mid * 0.20) + (fl * 0.30) + (rep * 0.30) + (count * 1.0);
		System.out.println("============결과=============");
		if (20 - (20 * 0.30) > count * 1.0) {
			System.out.println("Fail [출석회수 부족(" + count + "/20)]");
		} else {

			System.out.println("중간 고사 점수(20) : " + (mid * 0.20));
			System.out.println("기말 고사 점수(30) : " + (fl * 0.30));
			System.out.println("과제 점수(30) : " + (rep * 0.30));
			System.out.println("출석 점수(20) : " + (count * 1.0));
			System.out.println("총점 : " + total);
			if (total >= 70) {

				System.out.println("Pass");
			} else if (total < 70) {
				System.out.println("Fail [점수 미달]");
			}

		}

	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.println("선택 : ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: new ControlPractice().practice1(); break;
		case 2: new ControlPractice().practice2(); break;
		case 3: new ControlPractice().practice3(); break;
		case 4: new ControlPractice().practice4(); break;
		case 5: new ControlPractice().practice5(); break;
		case 6: new ControlPractice().practice6(); break;
		case 7: new ControlPractice().practice7(); break;
		case 8: new ControlPractice().practice8(); break;
		case 9: new ControlPractice().practice9(); break;
		default : System.out.println("잘못입력하셨습니다.");
		}
	}
}
