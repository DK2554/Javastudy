package com.oop2.model.vo;

public class Animal {
	private String name;
	private String category;
	private int age;
	
	//�⺻������ ����! �����ڰ� Ŭ���� ���ο� ������ �Ƚᵵ �ڵ��Ҵ������� ������ �� �����ؾ���
	
	public Animal() {
		
	}
	//�Ű������� �ִ� ������(3)
	public Animal(String name,String category,int age) {
		this.age=age;
		this.category=category;
		this.name=name;
		
	}//�Ű������� 2���� ������
	public Animal(String name,String category) {
		this.name=name;
		this.category=category;
	}
	//�޼ҵ�(getter,setter)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
