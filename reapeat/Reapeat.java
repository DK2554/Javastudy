package com.kh.reapeat;

import java.util.Scanner;

public class Reapeat {
	public void ReapeatTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		System.out.print("���� �Է� : ");
		char get = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char check=str.charAt(i);
			if ((check >= 65 && check <= 90)||(check >= 97 && check <= 122)) {
				if(get == str.charAt(i)){
					count++;
				}
				
			} else   {
				System.out.println("�����ڰ� �ƴմϴ�");
				return;
			}

			// �����ڰ� �ƴҰ�쿡 ����ؾ��� ��� �ؾ���

		}
		System.out.println("���Ե� ���� : " + count);

	}

	public void ReapeatTest4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǰ�Է� ======");
		String add = "";
		for (int i = 0; i < 5; i++) {
			System.out.print("��ǰid : ");
			String id = sc.nextLine();
			add += " " + id;
			sc.nextLine();
			System.out.print("���� : ");
			String type = sc.nextLine();
			add += " " + type;
			sc.nextLine();
			System.out.print("��ǰ�� : ");
			String name = sc.nextLine();
			add += " " + name;
			System.out.print("���� : ");
			int price = sc.nextInt();
			add += " " + price;

			System.out.print("������ : ");
			int weight = sc.nextInt();
			add += "\n" + weight + "����";
		}
		System.out.println("=========����ȸ��=========");
		System.out.println(add);

	}

	public void ReapeatTestno() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ȸ���� �Է� : ");
		int count = sc.nextInt();
		String store = "";
		int agehvg = 0;
		int keyhvg = 0;
		int wehvg = 0;
		System.out.println("ȸ�� ��� ");
		for (int i = 0; i < count; i++) {
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			store += " " + name;
			System.out.print("���� : ");
			int age = sc.nextInt();
			store += " " + age;
			agehvg += age;
			sc.nextLine();
			System.out.print("�ּ� : ");
			String address = sc.nextLine();
			store += " " + address;
			System.out.print("Ű : ");
			int height = sc.nextInt();
			store += " " + height;
			keyhvg += height;
			System.out.print("������ : ");
			int weight = sc.nextInt();
			store += " " + weight;
			wehvg += weight;
			sc.nextLine();
			System.out.print("����ó : ");
			String pone = sc.nextLine();
			store += "\n" + pone;

		}
		System.out.println("=========����ȸ��=========");
		System.out.println(store);
		System.out.println("��ճ��� : " + (double) agehvg / count + "�� / ��� Ű : " + (double) keyhvg / count
				+ "CM / ��� ������ : " + (double) wehvg / count);

	}

	public void ReapeatTest2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ȸ������ �Է��Ͻÿ� : ");
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
		System.out.println("ȸ�� ��� ");
		for (int i = 0; i < count; i++) {
			System.out.print("�̸� : ");
			name[i] = sc.nextLine();
			System.out.print("���� : ");
			age[i] = sc.nextInt();
			agehvg += age[i];
			sc.nextLine();
			System.out.print("�ּ� : ");
			address[i] = sc.nextLine();
			System.out.print("Ű : ");
			height[i] = sc.nextInt();
			keyhvg += height[i];
			System.out.print("������ : ");
			weight[i] = sc.nextInt();
			wehvg += weight[i];
			sc.nextLine();
			System.out.print("����ó : ");
			pone[i] = sc.nextLine();
		}
		System.out.println("=========����ȸ��=========");
		for (int i = 0; i < count; i++) {
			System.out.println(name[i] + age[i] + "��" + address[i] + height[i] + "cm" + weight[i] + "kg" + pone[i]);
		}
		System.out.println("��ճ���" + (double) agehvg / count + "��/��� Ű : " + (double) keyhvg / count + "cm / ��� ������ : "
				+ (double) wehvg / count + "kg");
	}

	public void monster() {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		int count = 0;
		int exp = 0;
		System.out.println("0.��ɽ��� 1.��ũ��� 2.���� .3������. 99������");
		while (true) {
			System.out.print("���� : ");
			num = sc.nextInt();
			switch (num) {
			case 0:
				System.out.println("����� �����մϴ�");
				System.out.println("1.��ũ��� 2.���� .3������. 99������");
				break;
			case 1:
				System.out.println("��ũ ��ɿϷ�+1exp");
				System.out.println("1.��ũ��� 2.���� .3������. 99������");

				exp += 1;
				count++;
				break;
			case 2:
				System.out.println("���� �Ϸ�+15exp");
				System.out.println("1.��ũ��� 2.���� .3������. 99������");
				exp += 15;
				count++;
				break;
			case 3:
				System.out.println("��� ��� �Ϸ�+10exp");
				exp += 10;
				count++;
				break;
			case 99:
				System.out.println("����� ���ƽ��ϴ�");
				System.out.print("�糶�� ���� ����" + count + "����,ȹ���� ����ġ��" + exp + "�Դϴ�.");
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
			System.out.println("����===============");
			System.out.println("1.�������========1000��");
			System.out.println("2.ġ����==========1200��");
			System.out.println("3.��ġ���==========2000��");
			System.out.println("����===============");
			System.out.println("4.�׳ɶ��========1200��");
			System.out.println("5.ġ����==========1500��");
			System.out.println("6.«�Ͷ��==========2500��");
			System.out.println("��Ÿ===============");
			System.out.println("7.Ƣ��========1200��");
			System.out.println("8.����==========2500��");
			System.out.println("9.����==========1000��");
			System.out.println("10.�����==========800��");
			System.out.print("�޴� ���� : ");
			num = sc.nextInt();
			System.out.print("�������� : ");
			count = sc.nextInt();
			System.out.println(count + "�� �ֹ��ϼ̽��ϴ�");
			System.out.print("�߰��ֹ��Ͻðڽ��ϱ�?(Y/N)");
			char ch = sc.next().charAt(0);

			switch (num) {
			case 1:
				String pnum = "�������";
				int total = count * 1000;
				sum += total;
				store += pnum + " : " + count + "��" + " -" + total + "��\n";
				flag = true;
				break;
			case 2:
				pnum = "ġ����";
				total = count * 1200;
				sum += total;
				store += pnum + " : " + count + "��" + " -" + total + "��\n";
				flag = true;
				break;
			case 3:
				pnum = "��ġ���";
				total = count * 2000;
				sum += total;
				store += pnum + " : " + count + "��" + " -" + total + "��\n";
				flag = true;
				break;
			case 4:
				pnum = "���";
				total = count * 1200;
				sum += total;
				store += pnum + " : " + count + "��" + " -" + total + "��\n";
				flag = true;
				break;
			case 5:
				pnum = "ġ����";
				total = count * 1500;
				sum += total;
				store += pnum + " : " + count + "��" + " -" + total + "��\n";
				flag = true;
				break;
			case 6:
				pnum = "«�Ͷ��";
				total = count * 2500;
				sum += total;
				store += pnum + " : " + count + "��" + " -" + total + "��\n";
				flag = true;
				break;
			case 7:
				pnum = "Ƣ��";
				total = count * 1200;
				sum += total;
				store += pnum + " : " + count + "��" + " -" + total + "��\n";
				flag = true;
				break;
			case 8:
				pnum = "����";
				total = count * 2500;
				sum += total;
				store += pnum + " : " + count + "��" + " -" + total + "��\n";
				flag = true;
				break;
			case 9:
				pnum = "����";
				total = count * 1000;
				sum += total;
				store += pnum + " : " + count + "��" + " -" + total + "��\n";
				flag = true;
				break;
			case 10:
				pnum = "�����";
				total = count * 800;
				sum += total;
				store += pnum + " : " + count + "��" + " -" + total + "��\n";
				flag = true;
				break;

			}
			if (ch == 'N') {
				break;
			}
		} while (flag);
		System.out.println("�ֹ��Ͻ� ����");
		System.out.println("====================");
		System.out.println(store);
		System.out.println("====================");
		System.out.println("�Ѱ���  :" + sum + "��");
	}

}
