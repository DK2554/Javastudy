package com.oop2.method;

import java.util.Scanner;

public class Method2 {
	// ���ڿ��� ���� �޼ҵ带 �����Ѵ�
	// public ���������� String�ڷ������� plus()��� �̸��� ������ �޼ҵ带 ����
	// return���� �ִ� ���·� ����

	public String plus() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		System.out.print("���ڿ� �Է� : ");
		String str2 = sc.nextLine();
		// ���ڿ��� �Է¹޾Ƽ� hap�̶�� ���ڿ��� �����Ѵ�
		String hap = str + str2;
		// �Է¹��� hap�� �������� �޼ҵ� ��� ��ġ�� ������

		return hap;

	}
	// �����ΰ��� �Ű������� �Է¹޾Ƽ� ���� �������ִ� �޼ҵ�
	// ���� ���� ������ ���� ���

	public int plus2(int nu1, int nu2) {
		// ù��° ���� �ι�° ������ ������ ������ ���

		if (nu1 < nu2) {
			System.out.println("����!!");

		}
		
		// �μ��� ���� ���� ������ hap�� �����Ѵ�

		int hap = 0;
		// �ι�° ������ ù��° ������ �� ���� ���ؼ� hap������ �����Ѵ� (��������)
		for (int i = nu2; i < nu1; i++) {
			hap += i;
		}
		return hap;

	}
	// �ϳ��� ���ڸ� �Է¹޾Ƽ� �׹��ڰ� ���������� Ȯ���ϴ� �޼ҵ�
	// �����ڸ� �ƽ�Ű �ڵ尪�̶� ���� �װ����� �۰ų� ũ�� �����ڰ� �ƴϴ�
	// �Ű������� �Է¹޴´�

	public boolean tandf(char ch) {
		boolean flag = false;
		if (ch >= 65 && ch <= 90 || ch <= 122 && ch >= 97) {
			flag = true;

		} else {
			flag = false;
		}

		return flag;

	}
}
