package silsub.sample;

import java.util.Scanner;

public class Munjae {
	public void test1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("***�ʱ� �޴�***");
		System.out.println("1.�Է�");
		System.out.println("2.����");
		System.out.println("3.��ȸ");
		System.out.println("4.����");
		System.out.println("7.����");

		boolean str = false;
		int num = 0;
		while (true)

		{
			System.out.println("�޴��� �Է��Ͻÿ�  : ");
			num = sc.nextInt();
			switch (num) {

			case 1:
				System.out.println("�Է¸޴��� ���õǾ����ϴ�.");
				System.out.println("=======================");
				System.out.println("1.�Է�");
				System.out.println("2.����");
				System.out.println("3.��ȸ");
				System.out.println("4.����");
				System.out.println("7.����");

				break;
			case 2:
				System.out.println("�����޴��� ���õǾ����ϴ�.");
				System.out.println("=======================");
				System.out.println("1.�Է�");
				System.out.println("2.����");
				System.out.println("3.��ȸ");
				System.out.println("4.����");
				System.out.println("7.����");

				break;
			case 3:
				System.out.println("��ȸ�޴��� ���õǾ����ϴ�.");

				System.out.println("=======================");
				System.out.println("1.�Է�");
				System.out.println("2.����");
				System.out.println("3.��ȸ");
				System.out.println("4.����");
				System.out.println("7.����");

				break;
			case 4:
				System.out.println("�����޴��� ���õǾ����ϴ�.");
				System.out.println("=======================");

				System.out.println("1.�Է�");
				System.out.println("2.����");
				System.out.println("3.��ȸ");
				System.out.println("4.����");
				System.out.println("7.����");

				break;
			case 7:
				System.out.println("���α׷��� ����˴ϴ�.");

				return;
			default:
				System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�:");
				System.out.println("=======================");
				System.out.println("�ٽ��Է��Ͻʽÿ�");
				System.out.println("=======================");
				System.out.println("***�ʱ� �޴�***");
				System.out.println("1.�Է�");
				System.out.println("2.����");
				System.out.println("3.��ȸ");
				System.out.println("4.����");
				System.out.println("7.����");

			}
		}

	}
	public void inputTest() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		String name=sc.nextLine();
		System.out.print("���̸� �Է��Ͻÿ� : ");
		int age=sc.nextInt();
		System.out.print("Ű�� �Է��Ͻÿ� : ");
		double height=sc.nextDouble();
		if((name!=null&&name.length()!=0)&&(age>0&&height>0)) {
			System.out.println("�̸� : "+name);
			System.out.println("���� : "+age);
			System.out.println("Ű : "+height);
			System.out.printf("Ȯ�� : %s�� ���̴� %d�̰� Ű�� %.1fcm�̴�",name,age,height);
			
		}else {
			return;
		}
	}
	public void test6() {
		Scanner sc=new Scanner(System.in);
		System.out.print("ù��° ���� : ");
		int nu1=sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int nu2=sc.nextInt();
		if(nu1>0&&nu2>0) {
			System.out.printf("%d + %d =%d\n",nu1,nu2,nu1+nu2);
			System.out.printf("%d - %d =%d\n",nu1,nu2,nu1-nu2);
			System.out.printf("%d * %d =%d\n",nu1,nu2,nu1*nu2);
			System.out.printf("%d / %d =%d\n",nu1,nu2,nu1/nu2);
			System.out.printf("%d %% %d =%d\n",nu1,nu2,nu1%nu2);
	
		}
	}
	
}
