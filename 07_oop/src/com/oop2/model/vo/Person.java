package com.oop2.model.vo;

public class Person {
	// �ʵ� ����
	private String name = "������";// ����� ���ÿ� �ʱ�ȭ
	private int age = 30;// ����� ���ÿ� �ʱ�ȭ

	{// ������
		name = "������";
		age++;
	}

	// �⺻������
	public Person() {
		System.out.println("Person����");

	}

	// ��ü�� �����ҋ� ���=>������
	// ������ ���ÿ� �������(�ʵ�)�� ���� ����
	// �����ϸ鼭 ����������.....
	// �Ű������� �ִ� �����ڸ� �̿��Ѵ�.
	//������==Ŭ������ /������(�̿��� �Ű������� ����)
	public Person(String name, int age) {
		//���� �ʱ�ȭ 
		this.age = age;//��������� �Ű�����(�Ķ����)�� �����Ѵ�
		this.name = name;

	}

	// �ʵ忡 �����ϱ� ���� getter setter����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
