package com.oop2.method;

import java.util.Scanner;

//��������� Ŭ����
public class MethodTest {

	// ���� ����� �ϴ� �޼ҵ� �����
	// ��ȯ���� ���� �Ű������� �ִ� �޼ҵ�
	public void calculator(int su1, int su2, char op) {
		// ����ϴ� ��ɸ� ó��
		double result = 0;
		switch (op) {
		case '+':
			result = su1 + su2;
			break;
		case '-':
			result = su1 - su2;
			break;
		case '*':
			result = su1 * su2;
			break;
		case '/':
			result = su1 / (double) su2;
			break;
		case '%':
			result = su1 % su2;
			break;
		}
		System.out.println("" + su1 + op + su2 + "=" + result);

	}

	// ��ȯ���� �ְ� �Ű������� �ִ� ����
	public double calculator2(int su1, int su2, char op) {

		double result = 0;
		switch (op) {
		case '+':
			result = su1 + su2;
			break;
		case '-':
			result = su1 - su2;
			break;
		case '*':
			result = su1 * su2;
			break;
		case '/':
			result = su1 / (double) su2;
			break;
		case '%':
			result = su1 % su2;
			break;
		}
		// �޼ҵ忡 ��ȯ���� ������ �ݵ�� return���� ����ؾ���
		// return : return ��ȯ���� ���ͷ��̳� ������ �ۼ�
		System.out.println(result);
		return result;

	}

	// �Ű������� ���� ��ȯ���� �ִ� ����
	public double calculator3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int su = sc.nextInt();
		System.out.print("���� �Է� : ");
		int su2 = sc.nextInt();
		System.out.print("������  : ");
		double result = 0;
		switch (sc.next().charAt(0)) {
		case '+':
			result = su + su2;
			break;
		case '-':
			result = su - su2;
			break;
		case '*':
			result = su * su2;
			break;
		case '/':
			result = su / (double) su2;
			break;
		case '%':
			result = su % su2;
			break;
		}
		//return�� �ϳ��� ���� ���尡��
		return result;

	}

}
