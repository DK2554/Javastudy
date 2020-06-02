package com.scanner.test;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		//키보드로 입력받은 값 받아오기
		//Scanner객체를 이용하면 된다.
		//1. java.util.Scanner import함.
		//2. Scanner객체를 생성함. -> 변수로 값을 저장함
		Scanner sc=new Scanner(System.in);
		//3. sc.nextInt(),sc.nextDouble().sc.next(),sc.nextLine()를 
		//이용해서 데이터를 받아옴
		//System.out.println("당신의 나이는?");
		//System.out.print("당신의 나이는?");
		//System.out.println("입력한 나이는 "+sc.nextInt());
		
		//이름, 나이, 키
		System.out.print("당신의 나이? ");
		System.out.println("당신의 나이는 "+sc.nextInt());
		System.out.print("당신의 키 ? " );
		System.out.println("당신의 키는 "+sc.nextDouble());
		//System.out.print("당신의 이름 ? ");
		System.out.println("당신의 주소? ");
		//System.out.println("당신의 이름은 "+sc.nextLine());
		//System.out.println("당신의 이름은 "+sc.next());

		System.out.println("당신의 주소는 "+sc.nextLine());
		String address;
		address=sc.nextLine();
		
		//이름, 나이, 키, 주소를 입력받고 입력받은 값을
		//한번에 출력해보세요!
		String name2;
		int age2;
		double height2;
		String address2;
		System.out.print("이름 : ");
		name2=sc.nextLine();
		System.out.print("나이 : ");
		age2=sc.nextInt();
		System.out.print("키 : ");
		height2=sc.nextDouble();
		sc.nextLine();//버퍼비우기(쓰레기처리)
		System.out.print("주소 : ");
		address2=sc.nextLine();
		
		System.out.println("===== 입력결과 =====");
		System.out.println("이름 : "+name2+" 나이 : "+age2+" 키 : "
		+height2+" 주소 : "+address2);
		//committest
		
	}
	
}





