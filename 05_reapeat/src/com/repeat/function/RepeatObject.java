package com.repeat.function;
import java.util.Scanner;
public class RepeatObject {
	public void basicRepeat() {
		//for�� Ȱ���ϱ�
		//for �ʱ��: �ݺ����� ���ذ��� �ʱ�ȭ�ϴ� ��
		//���ǽ�: ������ �Ǵ°��� Ư�� ����(10,5)�ݺ����� ���������� ����
		//������: 
		for(int i=1;i<=4;i++) {
			System.out.println("�ȳ��ϼ���");
		}
		for(int i=0; i<10;i++) {
			System.out.println(i++);
		}
		for(int i=100; i>0; i--) {
			System.out.println(i);
		}
		//1~100
//		

//		for(int i=0; i<=100;i++) {
//			if((i+1)%2!=0) {
//				System.out.println(i+1);
//			}
//		}
		
		
	}
	
	
	
	
	
	
	
	
	
	public void repeatTest() {
		//for�� ����
		Scanner sc=new Scanner(System.in);
		int sum=0;
		//String subject="";
		for(int i=0;i<3;i++) {
			if(i==0) {
				System.out.print("���������Է� : ");
			}else if(i==1) {
				System.out.print("���������Է� : ");
			}else {
				System.out.print("���������Է� : ");
			}
			/*switch(i){
				case 0: subject="����";break:
				case 1: subject="����";break:
				case 2: subject="����";break:
			*/
			
			sum+=sc.nextInt();
		}
		System.out.println("�հ� : "+sum);
		//�����񺰷� �Է�
		//ù��°�� ���������ޱ�
		//�ι���� �������� �ޱ�
		//����°�� �������� �ޱ�
		//�������� :, ��������: , ��������:, 
		
		
		
		
	}
	public void repeatTest2() {
		Scanner sc=new Scanner(System.in);
//		System.out.print("���ϴ� Ƚ���� �Է��Ͻÿ� : ");
//		int count=sc.nextInt();
//		for(int i=0;i<count;i++) {
//			System.out.println("���");
//			
//		};
		String str="";
		System.out.print("�Է��� �޼��� ���� �Է��Ͻÿ� : ");
		int su1=sc.nextInt();
		sc.nextLine();
		System.out.print("�޼����� �Է��Ͻÿ� : ");
		for(int i=0; i<su1;i++) {
			str+=sc.nextLine();
			
		}
		System.out.println(str);
		
		
	}
	public void repeatTest3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int num=sc.nextInt();
		String supak="";
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				supak+="��";					
			}else {
				supak+="��";
			}
			
			
		}
		System.out.println(supak);
		
		
		
		
	}
	public void repeatTest4() {
		Scanner sc=new Scanner(System.in);
		System.out.print("������ ���α׷� ");
		System.out.print("���� �Է��Ͻÿ� : ");
		int dan=sc.nextInt();
		if(dan>0&&dan<10) {
			for(int i=1;i<10;i++) {
				System.out.println(dan+"*"+i+"="+dan*i);
			}
			
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	
		
		
			
			
		
		
	}

}
