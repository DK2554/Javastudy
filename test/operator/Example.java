package test.operator;

import java.util.Scanner;

public class Example {
	public void sample1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("����� �Է�: ");
		int ko = sc.nextInt();
		System.out.print("����� �Է�: ");
		int en = sc.nextInt();
		System.out.print("���м��� �Է�: ");
		int ma = sc.nextInt();
		int sum = ko + en + ma;
		double hvg = sum / 3.0;

		if (hvg >= 60) {
			if (ko >= 40 && en >= 40 && ma >= 40) {
				System.out.println("�հ��Դϴ�");
			} else {
				System.out.println("���հ��Դϴ�");
			}
		} else {
			System.out.println("���հ��Դϴ�.");
		}

	}

	public void sample2() {
		Scanner sc = new Scanner(System.in);
		String name = " ";
		int num = 0;
		int ban = 0;
		int number = 0;
		char gender = ' ';
		double score = 0.0;
		String gender2 = "";
		System.out.print("�л��̸� : ");
		name = sc.nextLine();

		System.out.print("�г� : ");
		num = sc.nextInt();
		System.out.print("�� : ");
		ban = sc.nextInt();
		System.out.print("��ȣ : ");
		number = sc.nextInt();
		System.out.print("���� : ");
		gender = sc.next().charAt(0);
		System.out.print("���� : ");
		score = sc.nextDouble();
		if (gender == 'M') {
			gender2 = "���л�";
		} else {
			gender2 = "���л�";
		}
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�", num, ban, number, gender2, name, score);

	}

	public void sample3() {
		Scanner sc = new Scanner(System.in);
		int nu1 = 0;
		System.out.print("������ �Է��Ͻÿ� : ");
		nu1 = sc.nextInt();
		if (nu1 > 0) {
			System.out.println("����Դϴ�");
		} else {
			System.out.println("����� �ƴϴ�");
		}
	}

	public void sample4() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String str = "";
		System.out.print("���� �ϳ��� �Է��Ͻÿ� : ");
		num = sc.nextInt();
		if (num % 2 == 0) {
			str = "¦����";
		} else {
			str = "Ȧ����";
		}

		System.out.println(str);
	}
}
