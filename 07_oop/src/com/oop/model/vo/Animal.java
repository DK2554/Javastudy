package com.oop.model.vo;

public class Animal {
	public static int count;
	public int aniNo;
	public String name;
	public String category;
	public String seosickge;
	public int year;
	public char gender;
	//�ʱ�ȭ ��� �����ϱ�
	{//��ü�� �����Ҷ� ���� ����
		name="���ڿ�����";
		category="�����̰�";
		seosickge="������ī";
		year=20;
		gender='��';
		aniNo=count++;
				
	}
	//Ŭ�������� �ʱ�ȭ
	static {//���ѹ��� ����
		count=0;//�ʵ�(�������)�� �ƴ� Ŭ���������� ���డ��
				//������ static�� ���α׷� ����� ������� Ȯ��
				//�ʵ�� new����ÿ��� heap�������� �ö�´�
		
	}
}
