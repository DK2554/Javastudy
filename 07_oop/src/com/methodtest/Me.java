package com.methodtest;

public class Me {
	//�ɺθ� �ϴ� ���
	
	
	public Me() {
		
	}
	public Product order(String order,int money) {
		//���ǻ����:�ᳪ��,�κ�,����.....
		return new Product(order,money);
	}
	public void  order(String order)
	{
		switch(order)
		{
		case "��û��":System.out.println("��û�� �� ...");break;
		case "����" : System.out.println("������....");break;
		case "�ڶ�" : System.out.println("����~");break;
		default : System.out.println("�˾Ƽ� �Ұ�~");break;
		}
	
		
	}

}
