package kh.java.operator;

import java.util.Scanner;

public class TestOperator {
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int num2 = (num / 100) * 100;
		System.out.println("��� : " + num2);
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���ϰ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�ѹٱ��Ͽ� �� ���� �� : ");
		int num2 = sc.nextInt();
		int num3 = 0;
		int num4 = 0;
		if (num1 % num2 != 0) {
			num4 = num1 % num2;
			num3 = (num1 / num2) + 1;
		} else {
			num3 = num1 / num2;
		}
		System.out.println("���� ���� : " + num1);
		System.out.println("�ٱ��� ���ϼ� : " + num2);
		System.out.printf("%d���� ������ �������� %d���� �ʿ��մϴ�\n", num1, num3);
		System.out.println("������ �ٱ��Ͽ� ���� ���Ͽ� ������ : " + num4);
	}

	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �ϳ� �Է��Ͻÿ� : ");
		char ch = sc.next().charAt(0);
		char ch2 = ' ';
		if (ch >= 65 && ch < 97) {
			ch2 = (char) (ch + 32);
		} else if (ch >= 97 && ch <= 122) {
			ch2 = (char) (ch - 32);
		}
		System.out.println("�빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ�");
		System.out.println(ch + "->" + ch2);
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		char ch = sc.next().charAt(0);

		int num = (int) ch;
		System.out.println(ch + " is unicode : " + num);
	}

}
