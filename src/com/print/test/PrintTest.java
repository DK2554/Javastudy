package com.print.test;

public class PrintTest {
	public static void main(String[] args) {
		//print�� println�� ����
		System.out.print("�ȳ��ϼ���!");
		System.out.print("���� �������Դϴ�.");
		System.out.println();
		System.out.println("�ȳ��ϼ���!");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("���� �������Դϴ�.");
		
		//����/�������� ����ϴ� printf����ϱ�
		String name="������";
		int age=19;
		char gender='��';
		double height=180.5;
		
		String name2="����";
		int age2=40;
		char gender2='��';
		double height2=180.2;
		System.out.println(name+" "+age+" "+gender+" "+height);
		System.out.println(name2+" "+age2+" "+gender2+" "+height2);
		
		System.out.printf("%-3s %d %c %.2f\n",name,age,gender,height);
		System.out.printf("%5s %d %c %.2f\n",name2,age2,gender2,height2);
		
		//�̽��������� �̿��ϱ�
		System.out.println(name+"\t"+age+"\t"+gender+"\t");
		System.out.println("�ȳ��ϼ��� ���� "+name+"�Դϴ�.\n ���� "+age+"���Դϴ�.");
		System.out.println("c:\\dev");
		//���ڿ����� ", ' ����ϰ� ������
		System.out.println("'������' ������");
		System.out.println("\"������\"������");
		System.out.println("<p style=\"color:red\">������</p>");
	}
}
