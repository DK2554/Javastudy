package com.loop.FW;

import java.util.Scanner;

public class ForWhile {
	public void printstar1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ϳ� �Է� : ");
		int num = sc.nextInt();
		if (num > 0) {
			for (int i = 1; i <= num; i++) {// Ƚ��
				for (int j = 0; j < i; j++) {// �����ϸ鼭 �����
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("����� �ƴմϴ�");
		}
	}

	public void printStart2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ϳ� �Է� : ");
		int num = sc.nextInt();
		if (num > 0) {
			for (int i = 0; i <num; i++) {// Ƚ��
				for (int j = 0; j <= i; j++) {// �����ϸ鼭 �����
					System.out.print("*");
				}
				System.out.println();
			}
		} else if(num<0) {
			num=num*(-1);
			for (int i = 0; i < num; i++) {// Ƚ��
				for (int j = 0; j < i; j++) {// �����ϸ鼭 �����
					System.out.print(" ");
				}
				for (int k = 0; k < num - i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else if(num==0) {
			System.out.println("��±���� �����ϴ�.");
		}

	}

}
