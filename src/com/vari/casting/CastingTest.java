package com.vari.casting;

public class CastingTest {
	//����� �޼ҵ�
	public static void main(String[] args) {
		int age=19;
		double height=180.5;
		height=age;
		System.out.println(height);
		//�������ÿ� �ڷ����� �ٸ��� ū �ڷ������� �ڵ�����ȯ�Ͽ� ó����
		System.out.println(age+height);
		//������ ����ȯ�ϱ�
		//age=(int)age+height;//double
		age=(int)age+(int)height;
		age=age+(int)height;
		age=(int)(age+height);
		age=(int)height;
		
		//char���� ���ο� �������� ���� �װ��� ���εǴ� code������ ���ڸ� �ҷ����Ե�
		int cNum=97;
		char ch=(char)cNum;
		System.out.println(ch);	
		System.out.println((char)(ch+1));
		//11 -> int ->double�� ����
		//11.0
		ch='O';
		cNum=ch;
		System.out.println(cNum);
		System.out.println((char)cNum);
		
		
		
	}
}





