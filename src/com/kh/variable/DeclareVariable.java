package com.kh.variable;

public class DeclareVariable {
	//���� �����ϱ�
	public static void main(String[] args) {
		//���ú���(��������)
		//���� ���� ����
		boolean isBolean;
		//������ ���� ����
		char gender;
		
		//���ڿ� ���� ����
		String name;
		
		//������ ���� �����ϱ�
		//4����
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		
		//�Ǽ�
		float fNum;
		double dNum;
		
		//����Ģ�˾ƺ���!
		//1. ���� �����ȿ� ������ �������� ������ �� ����!
		//String dNum;
		//2. ������ ��ҹ��ڸ� �����Ѵ�
		double DNum;
		double dNUm;
		//3. ���� ����� ������
		//int public;
		//4. �������� ������ ���ڷ� �� �� ����.
		//int 1num;
		int num1;//���ڴ� ù���ڰ� �ƴ� ���� ����� ����
		//5. Ư����ȣ _, $�� ����� ������
		char _gender;
		char $test;
		//char ^^gedner;
		//char ^gedner;
		char gen_der;
		char te$st;
		
		//����� ������ �� �����ϱ�
		//���� ������ �Ҷ��� ���Կ����� '='�� Ȱ���Ͽ� ���� ������ �ִ´�
		//���� = ���Ե� ��(���ͷ�, ����)
		
		//������ ���ֱ�
		boolean flag;
		flag=true;
		//flag=0;
		//flag=True;
		flag=false;
		flag=10<9;//���߿� �� �ڼ���~!
		
		//userAge���� �����ϰ� ���ֱ�!
		int userAge;
		userAge=19;
		long account;
		account=1000000000;//�ڵ�����ȯ!
		account=1000000000000L;
		
		//�Ǽ��ֱ�
		float fnum1;
		fnum1=180.5f;
		double weight;
		weight=65.5;
		
		//����, ���ڿ� �� �ֱ�
		char character;
		character='A';
		//a//������ �ǹ�
		String str="������ �����ϴ°� ������?";
		//character='������';
		str="A";
		
		//����=������ ���ֱ�
		String str2=str;
		int testAge=userAge;
		
		//������ �� ����ϱ�
		//������ ���� ����� �Ϸ��� 
		//�������� �̿��ϸ�ȴ�.
		
		System.out.println(str);
		System.out.println(userAge);
		
		//���
		//����� �ʱⰪ�� ���� �� ������� �ʴ� ������ ����
		//final ���� ����Ͽ� ������ ��
		int studentAge=27;//����
		studentAge=30;
		final int teacherAge=19;//����� ����� �ʱ�ȭ
		//teacherAge=39;
		
		
		//���ڿ� Ȱ���ϱ�
		String msg="����";
		System.out.println(msg);
		String msg2=new String("����");
		System.out.println(msg2);
		
		msg="����"+"ĢĢ����"+msg2;
		System.out.println(msg);
		System.out.println(msg+"KTX ��~~");
		//���ڿ��ڷ��� + ���ڿ��ڷ��� => ���ڿ� ���տ���!
		//���ڿ��ڷ��� + ������ �ڷ��� => ���ڿ� ���տ���!
		//�������ڷ��� + �������ڷ��� => ���ϱ� ����!
		msg="����"+(123+45)+"��!~!";
		System.out.println(msg);
		msg=""+123+45+"����"+"��~!";
		System.out.println(msg);
		
		name="������";
		double height=180.5;
		weight=65.5;
		
		System.out.println(name+teacherAge+height+weight);
		
		name="������";
		height=179.0;
		weight=65.4;
		System.out.println(name+" "+teacherAge+" "+height+" "+weight);
		
		
		
		
		
		
		
		
		
		
	}

}
