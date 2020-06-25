package com.oop.controller;

import com.oop.model.vo.Animal;
import com.oop.model.vo.Employee;
import com.oop.model.vo.ObjectTest;
import com.oop.model.vo.Person;
//import com.oop.model.vo.Person2;

public class ObjectUseController {
	public void useObjectTest() {
		// ��ü�� �̿��Ϸ���
		// 1. ��ü�� �����ؼ� �ν���ȭ(�޸� ���� Ȯ��)new �����ڸ� ����
		new Person();// �޸𸮰����� Person�� ����
		// new Person2();//���� �����ڿ� ���� ��뿩�θ� ���� �Ҽ� �ִ�.
		// default�� ����� Ŭ������ �ܺο��� �ƿ��� �� ����!

		// ������Ʈ���� ���� Ŭ������ �ڷ������� ����� ������
		// �ڷ��� ������;
		Person p = new Person();// ���� ����->������ ���� ����,heap�� �ִ� �ּҰ��� �����ϴ� ����
		p.setNo(20);
		System.out.println(p.getNo());
		p = new Person();
		System.out.println(p.getNo());

		// �ʵ��� ���������� Ȱ���ϱ�
		// ���������ڴ� �ʵ忡 ����������(��ü����.�ʵ��) ���ɿ��θ� ����.
		Employee em = new Employee();
		// System.out.println(em.department);
		//// System.out.println(em.name); //default�� ���� ��Ű�� �ȿ����� ���డ��
		// System.out.println(em.age);
		// em.department="�����";
		// em.department="��������";
		// System.out.println(em.department);
		System.out.println(em.getDepartment());
		em.setDepartment("��������");
		System.out.println(em.getDepartment());
		// static���� ����� ������
		// Ŭ���� ������� ���ϸ�,��ü�� �������� �ʰ� ����� �����ϴ�.
		// static�� ����ϸ� static ������ �����Ѵ�.
		// static����� Ŭ�����̸�.������
		Employee.empNo = 100;
		// �Ϲ� �ʵ�� ������ �Ұ���
		// Employee.name;
		// ���������ڰ� private�� static������ �����ϱ�
		// Employee.empNo2=200;

		// final�� ����� ����
		// em.EMP_NUMBERR=200;
	}

	public void initialBlockTest() {
		// �ʱ�ȭ��Ͽ� ���� �׽�Ʈ �ϱ�
		Animal am = new Animal();
		am.name = "�����ӱ�";
		System.out.println(am.category);
		System.out.println(am.gender);
		System.out.println(am.seosickge);
		System.out.println(am.name);
		System.out.println(am.year);
		System.out.println(am.aniNo);
		// System.out.println(Animal.aniNo);//static=Ŭ���������� Ŭ�����̸�.�����̸�
		Animal b = new Animal();
		System.out.println(b.category);
		System.out.println(b.gender);
		System.out.println(b.seosickge);
		System.out.println(b.name);
		System.out.println(b.year);
		System.out.println(b.aniNo);
		Animal c = new Animal();
		c.name = "ȣ����";
		c.category = "����̰�";
		c.seosickge = "��λ�";
		System.out.println(c.category);
		System.out.println(c.gender);
		System.out.println(c.seosickge);
		System.out.println(c.name);
		System.out.println(c.year);
		System.out.println(c.aniNo);

		// am.aniNo = 500;// static �������� ����ÿ��� static�� �Ҵ���� ���� ��� ���� ���Ѵ�
		// System.out.println(am.aniNo);
		// System.out.println(b.aniNo);
	}

	public void ot() {
		ObjectTest aa = new ObjectTest();// ��ü aa����
		ObjectTest bb = new ObjectTest();// ��ü bb����
		ObjectTest cc = new ObjectTest();// ��ü cc����
		System.out.println(aa+":"+aa.name + aa.age + aa.money + aa.job + aa.religion + aa.height + aa.weight + aa.achive);
		System.out.println(bb+":"+bb.name + bb.age + bb.money + bb.job + bb.religion + bb.height + bb.weight + bb.achive);
		System.out.println(cc+":"+cc.name + cc.age + cc.money + cc.job + cc.religion + cc.height + cc.weight + cc.achive);
		
	}

}
