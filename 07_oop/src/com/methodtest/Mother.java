package com.methodtest;

public class Mother {
	
	//�ʵ忡�� ��ü�� �� �� �ִ�
	private Me son=new Me();
	
	
	public void requestOrder() {
		//me���� �ɺθ� ��Ű��
		//Me son=new Me();
		Product p=son.order("�ᳪ��", 50000);
		System.out.println(p.getProductName());
		System.out.println(p.getPrice());
		
	}
	public void requestOrder(String order) {
		//Me son=new Me();
		son.order("��û��");
		son.order("����");
		son.order("�ڶ�");
	}
}
