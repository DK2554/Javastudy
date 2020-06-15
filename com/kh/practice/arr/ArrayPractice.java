package com.kh.practice.arr;

import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(" " + num[i]);
		}
	}

	public void practice2() {
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		for (int i = 9; i <= num.length; i--) {
			if (i < 0) {
				return;
			}
			System.out.print(" " + num[i]);

		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

	public void practice4() {
		String[] str = { "���", "��", "����", "������", "����" };
		System.out.println(str[1]);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String arr = sc.nextLine();
		char[] array = new char[arr.length()];
		System.out.print("ã�� ���� �Է� : ");
		char ch = sc.next().charAt(0);
		String k = "";
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = arr.charAt(i);
			if (array[i] == ch) {
				count++;
				k = k + i + " ";
			}

		}
		System.out.println(arr + "�� " + ch + "�� �����ϴ� ��ġ(�ε���): " + k);
		System.out.println(ch + " ����  : " + count);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String[] month = { "��", "ȭ", "��", "��", "��", "��", "��" };
		System.out.print("0~6���� ���� �Է� : ");
		int num = sc.nextInt();

		switch (num) {
		case 0:
			System.out.println(month[0] + "����");
			break;
		case 1:
			System.out.println(month[1] + "����");
			break;
		case 2:
			System.out.println(month[2] + "����");
			break;
		case 3:
			System.out.println(month[3] + "����");
			break;
		case 4:
			System.out.println(month[4] + "����");
			break;
		case 5:
			System.out.println(month[5] + "����");
			break;
		case 6:
			System.out.println(month[6] + "����");
			break;
		default:
			System.out.println("�߸� �Է��ϼ˾��ϴ�");

		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int su1 = sc.nextInt();
		int[] num = new int[su1];
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.print("�迭" + i + "��° �ε����� ������ : ");
			num[i] = sc.nextInt();
			sum += num[i];
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");

		}
		System.out.println("");
		System.out.println("���� : " + sum);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ȧ���� ���� �Է� : ");
		int nu1 = sc.nextInt();
		if (nu1 % 2 != 1 && nu1 < 3) {
			while (true) {
				System.out.println("�ٽ��Է��Ͻÿ� ");
				System.out.print("Ȧ���� ���� �Է� : ");
				nu1 = sc.nextInt();
				if (nu1 % 2 == 1 && nu1 > 3) {
					break;
				}
			}
		}
		int[] num = new int[nu1];
		int var = num.length / 2;
		for (int i = 0; i < num.length; i++) {

			if (i <= num.length / 2) {
				num[i] = i + 1;
			} else if (i > num.length / 2) {
				for (int j = var; j < num.length; j++) {
					num[i] = (j - i) + 1;// ���������� �ִ´� j������ ��������
				}

			}

		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] chicken = { "���", "�Ķ��̵�", "����", "����" };
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		for (int i = 0; i < chicken.length; i++) {
			if (chicken[i].equals(name)) {
				System.out.println(name + "ġŲ ��� ����");
				break;
			} else {
				System.out.println(name + "ġŲ�� ���� �޴��Դϴ�.");
				break;
			}
		}

	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�� ��ȣ (-����)");
		String number = sc.nextLine();// number������ ���ڿ��� ���ڸ� Ư�����ڿ� �Բ� �����ؼ� �Է¹޾� �����Ѵ�.
		char[] num1 = new char[number.length()];// �迭 ���� char�迭 ������ �Է¹��� ���ڿ����̸�ŭ �迭����Ȯ��
		char[] num2 = new char[number.length()];// ���� �迭�� ������� ���纹���� ����Ѵ�.
		for (int i = 0; i < number.length(); i++) {
			num1[i] = number.charAt(i);// �Է¹��� ���ڿ��� ���� �ϳ��ϳ��� �迭���� �������� �ѱ��ھ� �ִ´�
			num2[i] = number.charAt(i);
		}
		for (int i = 0; i < num1.length; i++) {
			if (i > 7) {// 8�ڸ����� �� ���� ǥ���ϴ� �κ�
				num2[i] = '*';
			}

		}
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num2[i]);// ����� ����ϴ� �κ�
		}
	}

	public void practice11() {
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10 + 1);
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(" " + num[i]);
		}
	}

	public void practice12() {
		int[] num = new int[10];
		int MiN=10,MAX=0;
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10 + 1);
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(" " + num[i]);
		}System.out.println();
		for(int i=0;i<num.length;i++) {
			if(num[i]>MAX) {
				MAX=num[i];
			}else if(num[i]<MiN) {
				MiN=num[i];
			}
		
		}
		System.out.println("�ִ밪 : "+MAX);
		System.out.println("�ּڰ� : "+MiN);
		

	}

}
