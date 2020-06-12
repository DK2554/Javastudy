package com.array.controller;

import java.util.Scanner;

public class ArrayTest {
	public void arrayBasicTest() {
		// �⺻�迭 ����� �Ҵ��ϱ�
		int[] numbers = new int[3];
		System.out.println(numbers[0]);
		// �迭 ����ϱ� ���ؼ��� �ݵ�� �Ҵ��������
		numbers[0] = 10;// �Ҵ���ϸ� int���� ��쿡�� �ʱⰪ����0�� �ο���
		System.out.println(numbers[0]);

		// ���� �ڷ����� ������ ��� ����!���� �ڷ����� ���尡��
		// �迭�� ������ ������ ������ ���س�����
		// �ѹ����� �迭������ ������ �߰�,������ �Ұ���
		// ============06-11=============
		// �迭 ,�����Ҵ�
		// ������ 10���� ������ ���ִ� ���� ����
		// �л��̸� 5���� �����ҷ��� ��������

		int[] num = new int[10];
		String[] name = new String[5];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		name[0] = "������";
		name[1] = "�赵ȯ";
		name[2] = "������";
		name[3] = "������";
		name[4] = "�����";
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] += i + 1;
		}

	}

	public void studytest() {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[6];
		for (int i = 0; i < name.length; i++) {
			System.out.print("�̸��� �Է��Ͻÿ� : ");
			name[i] = sc.nextLine();
		}
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);

		}
		// �迭 ����� ���ÿ� �ʱⰪ�� ����
		String animal[] = { "�ڳ���", "����", "��", "��踻", "����" };

	}

	public void arrayTest() {
		Scanner sc = new Scanner(System.in);
		char[] ch = new char[5];
		for (int i = 0; i < ch.length; i++) {

			System.out.print((i + 1) + "��° �Է� :");
			ch[i] = sc.next().charAt(0);
		}
		System.out.print("ù��°  : " + ch[0]);
		System.out.print("�׹�°  : " + ch[3]);
	}

	public void arrayTest2() {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.print("���� �Է� " + (i + 1) + ":");
			num[i] = sc.nextInt();
			count += num[i];
		}
		System.out.println("�հ� " + count);

	}

	public void arrayRandom() {
		int[] random = new int[5];

		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 20) + 1;
		}
		for (int i = 0; i < random.length; i++) {
			if (random[i] % 2 != 0) {
				System.out.println("Ȧ�����Դϴ� : " + random[i]);

			}

		}
		int total = 0;
		for (int i = 0; i < random.length; i++) {
			int count = 0;
			for (int j = 0; j < random.length; j++) {
				if (i != j && random[i] == random[j]) {
					count++;
					total += count;
				}

			}

			/*
			 * else { System.out.println("¦�����Դϴ� : " + random[i]);
			 */
			System.out.println(random[i] + ": " + count);
		}

		System.out.println("�ߺ������� : " + total);

	}

	public void swapData() {
		// ���ڿ� 4�� �����Ҽ� �ִ� ������ �����
		// ��.��.��.�� �����ϰ�
		// �迭�� ����Ǿ� �ִ� ���� ���� ��ġ�� �����ϼ���
		String[] ch1 = new String[4];
		String tmp = "";
		ch1[0] = "��";
		ch1[1] = "��";
		ch1[2] = "��";
		ch1[3] = "��";

		tmp = ch1[2];
		ch1[2] = ch1[3];
		ch1[3] = tmp;
		System.out.println(ch1[2] + ch1[3]);

	}

	public void arrayCopy() {
		// ��������...
		// �迭�� �ְ��� �����Ͽ� ���� ���� ����Ǵ� ������ �����ϴ� ���
		int[] arr = { 1, 2, 3, 4 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		int[] copyArr = arr;
		for (int i = 0; i < copyArr.length; i++) {
			System.out.println(copyArr[i]);
		}
		// 2.System.arraycopy()�޼ҵ� �̿��ϱ�
		// System.arraycopy(����ɴ��迭,������ġ,���� ������ �迭,������ġ,����ɰ���)
		int[] num = { 1, 2, 3, 4 };
		int[] copyNum = new int[num.length];
		for (int value : copyNum)
			System.out.print(value + " ");
		System.arraycopy(num, 0, copyNum, 0, num.length);// ��������
		System.out.println("");
		for (int value : copyNum)
			System.out.print(value + " ");
	}

	public void doubleArray() {
		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = j+1;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				
				System.out.print(arr[i][j]);
				
			}
			System.out.println();

		}
		int [][]arr2=new int[3][3];
		int count=1;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j]=count++;
					
			
				
				
			}

		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				
				System.out.print(arr2[i][j]);
				
			}
			System.out.println();

		}
		
	}
}
