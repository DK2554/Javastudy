package com.oop.model.vo;

public class Employee {
	
	//static ���� �̿��ϱ�
	public static int empNo;
	private static int empNo2;
	
	
	//final Ŭ�������� ����� ����ϴ� ������ ���
	public final int EMP_NUMBERR=100000;
	
	
	
	// �������,�ʵ� ����
	// ���������ڸ� �����ϸ� default�� ����, default-���� ��Ű������ ���� ����
	String name;
	// private ��������� ������ ������� ����
	private int age;
	// protected ��ӵ� ��ü������ ���� ���� �ٸ� ��Ű���� �ִ� ��ü������ ���� �Ұ�
	protected String address;
	// public ��𿡼��� ���� ������ ��ü
	private String department;

	String job;

	public void printTest() {
		System.out.println(age);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		if (department.equals("�����") || department.equals("������")) {
			this.department = department;
		} else {
			System.out.println("�Է��Ҽ� ���� ���Դϴ� �ٽ� �Է��ϼ���");
		}

	}
}
