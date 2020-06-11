package com.kh.reapeat;

import java.util.Scanner;

public class Reapeat {
	public void ReapeatTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		System.out.print("문자 입력 : ");
		char get = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char check=str.charAt(i);
			if ((check >= 65 && check <= 90)||(check >= 97 && check <= 122)) {
				if(get == str.charAt(i)){
					count++;
				}
				
			} else   {
				System.out.println("영문자가 아닙니다");
				return;
			}

			// 영문자가 아닐경우에 출력해야한 경우 해야함

		}
		System.out.println("포함된 갯수 : " + count);

	}

	public void ReapeatTest4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("상품입력 ======");
		String add = "";
		for (int i = 0; i < 5; i++) {
			System.out.print("상품id : ");
			String id = sc.nextLine();
			add += " " + id;
			sc.nextLine();
			System.out.print("종류 : ");
			String type = sc.nextLine();
			add += " " + type;
			sc.nextLine();
			System.out.print("상품명 : ");
			String name = sc.nextLine();
			add += " " + name;
			System.out.print("가격 : ");
			int price = sc.nextInt();
			add += " " + price;

			System.out.print("몸무게 : ");
			int weight = sc.nextInt();
			add += "\n" + weight + "만원";
		}
		System.out.println("=========저장회원=========");
		System.out.println(add);

	}

	public void ReapeatTestno() {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원수 입력 : ");
		int count = sc.nextInt();
		String store = "";
		int agehvg = 0;
		int keyhvg = 0;
		int wehvg = 0;
		System.out.println("회원 등록 ");
		for (int i = 0; i < count; i++) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			store += " " + name;
			System.out.print("나이 : ");
			int age = sc.nextInt();
			store += " " + age;
			agehvg += age;
			sc.nextLine();
			System.out.print("주소 : ");
			String address = sc.nextLine();
			store += " " + address;
			System.out.print("키 : ");
			int height = sc.nextInt();
			store += " " + height;
			keyhvg += height;
			System.out.print("몸무게 : ");
			int weight = sc.nextInt();
			store += " " + weight;
			wehvg += weight;
			sc.nextLine();
			System.out.print("연락처 : ");
			String pone = sc.nextLine();
			store += "\n" + pone;

		}
		System.out.println("=========저장회원=========");
		System.out.println(store);
		System.out.println("평균나이 : " + (double) agehvg / count + "세 / 평균 키 : " + (double) keyhvg / count
				+ "CM / 평균 몸무게 : " + (double) wehvg / count);

	}

	public void ReapeatTest2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("회원수를 입력하시오 : ");
		int count = sc.nextInt();
		String[] name = new String[5];
		int[] age = new int[5];
		String[] address = new String[5];
		int[] height = new int[5];
		int[] weight = new int[5];
		String[] pone = new String[5];
		int agehvg = 0;
		int keyhvg = 0;
		int wehvg = 0;
		System.out.println("회원 등록 ");
		for (int i = 0; i < count; i++) {
			System.out.print("이름 : ");
			name[i] = sc.nextLine();
			System.out.print("나이 : ");
			age[i] = sc.nextInt();
			agehvg += age[i];
			sc.nextLine();
			System.out.print("주소 : ");
			address[i] = sc.nextLine();
			System.out.print("키 : ");
			height[i] = sc.nextInt();
			keyhvg += height[i];
			System.out.print("몸무게 : ");
			weight[i] = sc.nextInt();
			wehvg += weight[i];
			sc.nextLine();
			System.out.print("연락처 : ");
			pone[i] = sc.nextLine();
		}
		System.out.println("=========저장회원=========");
		for (int i = 0; i < count; i++) {
			System.out.println(name[i] + age[i] + "세" + address[i] + height[i] + "cm" + weight[i] + "kg" + pone[i]);
		}
		System.out.println("평균나이" + (double) agehvg / count + "세/평균 키 : " + (double) keyhvg / count + "cm / 평균 몸무게 : "
				+ (double) wehvg / count + "kg");
	}

	public void monster() {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		int count = 0;
		int exp = 0;
		System.out.println("0.사냥시작 1.오크사냥 2.용사냥 .3사람사냥. 99끝내기");
		while (true) {
			System.out.print("선택 : ");
			num = sc.nextInt();
			switch (num) {
			case 0:
				System.out.println("사냥을 시작합니다");
				System.out.println("1.오크사냥 2.용사냥 .3사람사냥. 99끝내기");
				break;
			case 1:
				System.out.println("오크 사냥완료+1exp");
				System.out.println("1.오크사냥 2.용사냥 .3사람사냥. 99끝내기");

				exp += 1;
				count++;
				break;
			case 2:
				System.out.println("용사냥 완료+15exp");
				System.out.println("1.오크사냥 2.용사냥 .3사람사냥. 99끝내기");
				exp += 15;
				count++;
				break;
			case 3:
				System.out.println("사람 사냥 완료+10exp");
				exp += 10;
				count++;
				break;
			case 99:
				System.out.println("사냥을 마쳤습니다");
				System.out.print("사낭한 몹의 수는" + count + "마리,획득한 경험치는" + exp + "입니다.");
				return;
			}

		}

	}

	public void menu() {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		String store = "";
		int sum = 0;
		int num = 0, count = 0;
		do {
			System.out.println("김밥류===============");
			System.out.println("1.원조김밥========1000원");
			System.out.println("2.치즈김밥==========1200원");
			System.out.println("3.참치김밥==========2000원");
			System.out.println("라면류===============");
			System.out.println("4.그냥라면========1200원");
			System.out.println("5.치즈라면==========1500원");
			System.out.println("6.짬뽕라면==========2500원");
			System.out.println("기타===============");
			System.out.println("7.튀김========1200원");
			System.out.println("8.순대==========2500원");
			System.out.println("9.오뎅==========1000원");
			System.out.println("10.음료수==========800원");
			System.out.print("메뉴 선택 : ");
			num = sc.nextInt();
			System.out.print("수량선택 : ");
			count = sc.nextInt();
			System.out.println(count + "개 주문하셨습니다");
			System.out.print("추가주문하시겠습니까?(Y/N)");
			char ch = sc.next().charAt(0);

			switch (num) {
			case 1:
				String pnum = "원조김밥";
				int total = count * 1000;
				sum += total;
				store += pnum + " : " + count + "개" + " -" + total + "원\n";
				flag = true;
				break;
			case 2:
				pnum = "치즈김밥";
				total = count * 1200;
				sum += total;
				store += pnum + " : " + count + "개" + " -" + total + "원\n";
				flag = true;
				break;
			case 3:
				pnum = "참치김밥";
				total = count * 2000;
				sum += total;
				store += pnum + " : " + count + "개" + " -" + total + "원\n";
				flag = true;
				break;
			case 4:
				pnum = "라면";
				total = count * 1200;
				sum += total;
				store += pnum + " : " + count + "개" + " -" + total + "원\n";
				flag = true;
				break;
			case 5:
				pnum = "치즈라면";
				total = count * 1500;
				sum += total;
				store += pnum + " : " + count + "개" + " -" + total + "원\n";
				flag = true;
				break;
			case 6:
				pnum = "짬뽕라면";
				total = count * 2500;
				sum += total;
				store += pnum + " : " + count + "개" + " -" + total + "원\n";
				flag = true;
				break;
			case 7:
				pnum = "튀김";
				total = count * 1200;
				sum += total;
				store += pnum + " : " + count + "개" + " -" + total + "원\n";
				flag = true;
				break;
			case 8:
				pnum = "순대";
				total = count * 2500;
				sum += total;
				store += pnum + " : " + count + "개" + " -" + total + "원\n";
				flag = true;
				break;
			case 9:
				pnum = "오뎅";
				total = count * 1000;
				sum += total;
				store += pnum + " : " + count + "개" + " -" + total + "원\n";
				flag = true;
				break;
			case 10:
				pnum = "음료수";
				total = count * 800;
				sum += total;
				store += pnum + " : " + count + "개" + " -" + total + "원\n";
				flag = true;
				break;

			}
			if (ch == 'N') {
				break;
			}
		} while (flag);
		System.out.println("주문하신 정보");
		System.out.println("====================");
		System.out.println(store);
		System.out.println("====================");
		System.out.println("총가격  :" + sum + "원");
	}

}
