package com.methodtest;

public class Product {
	// �ʵ�
	private String productName;
	private int price;

	// �����ڸ� ����

	public Product() {
		// �⺻������
	}
	
	public Product(String name, int price) {
		productName = name;// �̸��� �ߺ����� ������ this������ ����
		this.price = price;// �������� �ߺ��Ǿ� this������ �� ����

	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
