package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.  �Է� ");
		System.out.println("2.  ���� ");
		System.out.println("3.  ��ȸ ");
		System.out.println("4.  ���� ");
		System.out.println("7.  ���� ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("�Է¸޴��Դϴ�");
			break;
		case 2:
			System.out.println("�����޴��Դϴ�");
			break;
		case 3:
			System.out.println("��ȸ�޴��Դϴ�");
			break;
		case 4:
			System.out.println("�����޴��Դϴ�");
			break;
		case 7:
			System.out.println("���α׷��� ����˴ϴ�");
			break;
		}

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ���");
		int nu1 = sc.nextInt();
		if (nu1 >= 0) {
			if (nu1 % 2 == 0) {
				System.out.println("¦���Դϴ�");
			} else {
				System.out.println("Ȧ���Դϴ�");
			}
		} else {
			System.out.println("����� �Է����ּ���");
		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� : ");
		int ko = sc.nextInt();
		System.out.print("�������� : ");
		int ma = sc.nextInt();
		System.out.print("�������� : ");
		int En = sc.nextInt();
		int sum = ko + ma + En;
		double hvg = sum / 3.0;
		if (ko >= 40 || ma >= 40 || En >= 40) {
			if (hvg >= 60) {
				System.out.println("���� : " + ko);
				System.out.println("���� : " + ma);
				System.out.println("���� : " + En);
				System.out.println("�հ� : " + sum);
				System.out.println("��� : " + hvg);
				System.out.println("�����մϴ� �հ��Դϴ�");

			} else {
				System.out.println("���հ��Դϴ�");
			}

		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 ������ ���� �Է�");
		int month = sc.nextInt();
		switch (month) {
		case 1:
			System.out.println(month + "���� �ܿ� �Դϴ�.");
			break;
		case 2:
			System.out.println(month + "���� �ܿ� �Դϴ�.");
			break;
		case 3:
			System.out.println(month + "���� �� �Դϴ�.");
			break;
		case 4:
			System.out.println(month + "���� �� �Դϴ�.");
			break;
		case 5:
			System.out.println(month + "���� ���� �Դϴ�.");
			break;
		case 6:
			System.out.println(month + "���� ���� �Դϴ�.");
			break;
		case 7:
			System.out.println(month + "���� ���� �Դϴ�.");
			break;
		case 8:
			System.out.println(month + "���� ���� �Դϴ�.");
			break;
		case 9:
			System.out.println(month + "���� ���� �Դϴ�.");
			break;
		case 10:
			System.out.println(month + "���� ���� �Դϴ�.");
			break;
		case 11:
			System.out.println(month + "���� ���� �Դϴ�.");
			break;
		case 12:
			System.out.println(month + "���� �ܿ� �Դϴ�.");
			break;
		default:
			System.out.println(month + "���� �߸� �Էµ� ���Դϴ�");

		}
	}

	public void practice5() {
		String id = "myId";
		String pwd = "myPassword12";
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵�  : ");
		String inputid = sc.next();
		System.out.print("��й�ȣ  : ");
		String inputpwd = sc.next();
		if (inputid.equals("myId") && inputpwd.equals("myPassword12")) {
			System.out.println("�α��� ����");
		} else if (!inputpwd.equals("myPassword12")) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		} else if (!inputid.equals("myId")) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ����� : ");
		String str = sc.next();
		switch (str) {
		case "������":
			System.out.println("ȸ������,�Խñ� ���� �Խñ� �ۼ�, ��� �ۼ� �Խñ� ��ȸ");
			break;
		case "ȸ��":
			System.out.println("�Խñ� �ۼ�, ��� �ۼ� �Խñ� ��ȸ");
			break;
		case "��ȸ��":
			System.out.println("�Խñ� ��ȸ");
			break;

		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű(m)�� �Է����ּ��� : ");
		double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է����ּ��� : ");
		double weight = sc.nextDouble();
		double bmi = weight / (height * height);
		System.out.print("BMI ���� : " + bmi);
		System.out.println();
		if (bmi < 18.5) {
			System.out.println("��ü��");
		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("����ü��");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("��ü��");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("��");
		} else if (bmi >= 30) {
			System.out.println("����");
		}
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ǿ�����1 �Է� : ");
		int nu1 = sc.nextInt();
		System.out.print("�ǿ�����2 �Է� : ");
		int nu2 = sc.nextInt();
		System.out.print("������ �Է�(+,-,*,/,%) : ");
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
			System.out.println("�߸��Է��ϼ̽��ϴ�");
		}

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�߰� ��� ���� : ");
		int mid = sc.nextInt();
		System.out.print("�⸻ ��� ���� : ");
		int fl = sc.nextInt();
		System.out.print("���� ��� ���� : ");
		int rep = sc.nextInt();
		System.out.print("�⼮ Ƚ�� : ");
		int count = sc.nextInt();
		double total = (mid * 0.20) + (fl * 0.30) + (rep * 0.30) + (count * 1.0);
		System.out.println("============���=============");
		if (20 - (20 * 0.30) > count * 1.0) {
			System.out.println("Fail [�⼮ȸ�� ����(" + count + "/20)]");
		} else {

			System.out.println("�߰� ��� ����(20) : " + (mid * 0.20));
			System.out.println("�⸻ ��� ����(30) : " + (fl * 0.30));
			System.out.println("���� ����(30) : " + (rep * 0.30));
			System.out.println("�⼮ ����(20) : " + (count * 1.0));
			System.out.println("���� : " + total);
			if (total >= 70) {

				System.out.println("Pass");
			} else if (total < 70) {
				System.out.println("Fail [���� �̴�]");
			}

		}

	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� �����ϼ���");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. P/F");
		System.out.println("���� : ");
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
		default : System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	}
}
