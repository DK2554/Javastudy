package com.vari.dataover;

public class DataOverFlowTest {
	//����� �޼ҵ� �ۼ�
	public static void main(String[] args) {
		//byte�ڷ��� ������ �����÷ο� Ȯ���ϱ�
		//byte bnum=127;
		int bnum=127;
		for(int i=0;i<300;i++) {
			System.out.println(bnum++);
		}
	}
	
	
}






