package com.methodtest;

public class Main {

	public static void main(String[] args) {
		Mother m=new Mother();
		m.requestOrder();
		m.requestOrder("��Ű��");
		ParamObjectTest po=new ParamObjectTest();
		Product p =new Product("�ڵ���",100);
		System.out.println(p.getProductName()+p.getPrice());
		po.objectUpdate(p);//�Ű��������� ����
		System.out.println(p.getProductName()+p.getPrice());
		//����Ÿ�� ����
		int su=10;
		System.out.println(su);
		po.primitiveUpdate(su);//���� �Ű��������� ����
		System.out.println(su);
		
		
		
		//�迭 �Ű����� Ȱ���ϱ�
		int[] params= {1,2,3,4,5,6};
		po.arrayUpdate(params);
		for(int v:params) {
			System.out.print(v+" ");
			
		}System.out.println();
	}

}
