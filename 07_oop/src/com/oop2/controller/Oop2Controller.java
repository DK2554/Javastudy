package com.oop2.controller;

import com.oop2.model.vo.Animal;
import com.oop2.model.vo.Info;
import com.oop2.model.vo.Person;

public class Oop2Controller {
	public void intialTest() {
		// �ʱ�ȭ���, ����� ���ÿ� �ʱ�ȭ �׽�Ʈ
	//	Person p = new Person();
		//System.out.println(p.getName());
		//System.out.println(p.getAge());
		Person p=new Person("�赵ȯ",29);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		Person dh=new Person("������",27);
		System.out.println(dh.getName());
		System.out.println(dh.getAge());
		
		
		//�����ڿ� ���������ڸ� �����ϸ� ������ ���� ��ü������ ���ѵ�;.
		//�⺻�����ڸ� �ڵ������ϴ� ����
		//Ŭ���� ���ο� �����ڰ� �������!!
		Person bs=new Person();
		
		//animal �����ϱ�
		Animal dog=new Animal();
		Animal cat=new Animal("����","�����",3);
		Animal snack=new Animal("������","�����");
		
		
		Info a=new Info();
		Info b=new Info("������",19,"��⵵ �����");
		Info c=new Info("�¿���",32,"���ν�",'��',100);
		System.out.println(a.getName()+a.getAge()+a.getAddress()+a.getGender()+a.getMoney());
		System.out.println(b.getName()+b.getAge()+b.getAddress());
		System.out.println(c.getName()+c.getAge()+c.getAddress()+c.getGender()+c.getMoney());
	}
}
