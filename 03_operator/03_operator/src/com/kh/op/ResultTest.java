package com.kh.op;
import java.util.Scanner;
public class ResultTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�");
		System.out.print("ù ��° �� : ");
		int num1=sc.nextInt();
		System.out.print("�� ���� �� : ");
		int num2=sc.nextInt();
		System.out.println("�� ���� ���ϱ�"+(num1+num2));
		System.out.println("�� ���� ����"+(num1-num2));
		System.out.println("�� ���� ���ϱ�"+(num1*num2));
		System.out.println("�� ���� ������"+((double)num1/num2));
		System.out.println("�� ���� ��������"+(num1%num2));
	}

}