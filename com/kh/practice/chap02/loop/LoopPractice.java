package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		if (num < 1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���");
		}

		for (int i = 1; i <= num; i++) {

			System.out.print(" " + (i));
		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		if (num < 1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���");
			System.out.print("1�̻��� ���ڸ� �Է��Ͻÿ� : ");
			num = sc.nextInt();
		}

		for (int i = 1; i <= num; i++) {

			System.out.print(" " + (i));
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		if (num < 1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���");
		}

		for (int i = num; i > 0; i--) {

			System.out.print(" " + (i));
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		if (num < 1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���");
			System.out.print("1�̻��� ���ڸ� �Է��Ͻÿ� : ");
			num = sc.nextInt();
		}

		for (int i = num; i > 0; i--) {

			System.out.print(" " + (i));
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (i == num) {
				System.out.print(i);
				System.out.print("=");
				count += num;
				break;
			}
			System.out.print(i);
			count += i;
			System.out.print("+");
		}
		System.out.print(count);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("ù ��° ���� : ");
		int num = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		if (num < 1 || num2 < 1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���");
			return;
		}
		int start = 0;
		int temp;
		if (num > num2) {
			start = num2;
			temp = num;
		} else {
			start = num;
			temp = num2;
		}

		for (int i = start; i <= temp; i++) {

			System.out.print(" " + (i));
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("ù ��° ���� : ");
		int num = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		if (num < 1 || num2 < 1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���");
			System.out.print("ù ��° ���� : ");
			num = sc.nextInt();
			System.out.print("�� ��° ���� : ");
			num2 = sc.nextInt();
		}
		int start = 0;
		int temp;
		if (num > num2) {
			start = num2;
			temp = num;
		} else {
			start = num;
			temp = num2;
		}

		for (int i = start; i <= temp; i++) {

			System.out.print(" " + (i));
		}
	}

	public void gogodan() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����  :");
		int num = sc.nextInt();
		System.out.printf("====%d��======\n", num);
		for (int i = 1; i <= 9; i++) {

			System.out.println(num + " * " + i + " = " + num * i);

		}
	}

	public void gogodan2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����  :");
		int num = sc.nextInt();
		if (num > 9) {
			System.out.println("9 ������ ���ڸ� �Է����ּ���");
			System.out.print("����  :");
			num = sc.nextInt();
		}

		for (int i = num; i <= 9; i++) {

			System.out.printf("====%d��======\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}

		}
	}
	public void practice11() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� ���� : ");
		int num=sc.nextInt();
		System.out.print("����");
		int num2=sc.nextInt();
		int sum;
		int i=0;
		while(i<10) {
			System.out.print(num+" ");
			num=num+num2;
			i++;
		}
	}
	public void practice12() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("������(+,-,*,/,% ) : ");
	
			String ch=sc.nextLine();
			if(ch.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�");
				return;
			}
			System.out.print("����1 : ");
			int num=sc.nextInt();
			System.out.print("����2: ");
			int num2=sc.nextInt();
			if(num<=0||num2<=0) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			switch(ch) {
			case "+": System.out.printf("%d + %d = %d\n",num,num2,num+num2);sc.nextLine();break;
			case "-": System.out.printf("%d - %d = %d\n",num,num2,num-num2);sc.nextLine();break;
			case "*": System.out.printf("%d * %d = %d\n",num,num2,num*num2);sc.nextLine();break;
			case "/": System.out.printf("%d / %d = %d\n",num,num2,num/num2);sc.nextLine();break;
			case "%": System.out.printf("%d %% %d = %d\n",num,num2,num%num2);sc.nextLine();break;
			default: System.out.println("���� �������Դϴ� �ٽ��Է����ּ���");sc.nextLine();break;
			}
			
		}
	}
	public void practice13() {
		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է� : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void practice14() {
		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է� : ");
		int num=sc.nextInt();
		for(int i=0;i<=num;i++)
		{
			for(int j=0;j<num-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
