package com.methodtest;

public class ParamObjectTest {

	//��ü�� �Ű������� �ް� �� ��ü�� �����ϱ�
	public void objectUpdate(Product p) {
		p.setProductName("cpu");
		p.setPrice(2000);
	}
	//����Ÿ�� �ŰԺ��� �ް� �����ϱ�
	public void primitiveUpdate(int su) {
		su=2000;
	}
	//�迭 �ѱ�� 
	public void arrayUpdate(int[] num) {
		for(int i=0;i<num.length;i++) {
			num[i]=i*20;
		}
	}
}
