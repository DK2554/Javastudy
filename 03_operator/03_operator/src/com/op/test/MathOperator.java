package com.op.test;

public class MathOperator {

	public static void main(String[] args) {
		//�������ó���ϱ�
		//������� -> ������ �ڷ����� �ش���.
		//byte, short, int, long, float, double
		//+, -, /, *, %(������)
		int su=19,su1=20,su2=30;
		//su+su1;//������길 ó���Ͽ� ���� ���� ����, �������� ����� ���ִ�, 
		//�ٸ� ������, ������ ����
		int result;
		result=su+su1;
		System.out.println("+������ : "+result);
		System.out.println("+���� : "+(su+su1));
		result=su1-su2;
		System.out.println("-������ : "+result);
		result=su1*su2;
		System.out.println("*������ : "+result);
		result=(su+su1)*su2;
		System.out.println("*������ : "+result);
		
		//result
		double result2=(double)su/su2;//�����⿬���� �� ��� �ڷ����� ����!
		
		System.out.println("/������ : "+result2);
		
		
		//������ ����ϱ�
		result=su%su2;
		System.out.println(result);
		System.out.println(5%2);
		
		//¦��, Ȧ�� ����
		//2/2 = 0  ������, 3/2 = 1 4/2 = 0 5/2 = 1
		//n����� ���ϴ� ��
		
		//���� �ΰ��� �Է¹޾� �ΰ��� ���� +,-,*,/,% ������ ���� �����ϰ�
		//�� ����� ����ϼ���!
		
		
		
	}
	
}





