package com.repeat.function;
import java.util.Scanner;
public class RepeatObject {
	public void basicRepeat() {
		//for문 활용하기
		//for 초기식: 반복문의 기준값을 초기화하는 식
		//조건식: 기준이 되는값이 특정 조건(10,5)반복문을 빠져나오는 조건
		//증감식: 
		for(int i=1;i<=4;i++) {
			System.out.println("안녕하세요");
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
		//for문 응용
		Scanner sc=new Scanner(System.in);
		int sum=0;
		//String subject="";
		for(int i=0;i<3;i++) {
			if(i==0) {
				System.out.print("국어점수입력 : ");
			}else if(i==1) {
				System.out.print("수학점수입력 : ");
			}else {
				System.out.print("영어점수입력 : ");
			}
			/*switch(i){
				case 0: subject="국어";break:
				case 1: subject="국어";break:
				case 2: subject="국어";break:
			*/
			
			sum+=sc.nextInt();
		}
		System.out.println("합계 : "+sum);
		//각과목별로 입력
		//첫번째는 국어점수받기
		//두번재는 영어점수 받기
		//세번째는 수학점수 받기
		//국어점수 :, 수학점수: , 영어점수:, 
		
		
		
		
	}
	public void repeatTest2() {
		Scanner sc=new Scanner(System.in);
//		System.out.print("원하는 횟수를 입력하시오 : ");
//		int count=sc.nextInt();
//		for(int i=0;i<count;i++) {
//			System.out.println("출력");
//			
//		};
		String str="";
		System.out.print("입력할 메세지 수를 입력하시오 : ");
		int su1=sc.nextInt();
		sc.nextLine();
		System.out.print("메세지를 입력하시오 : ");
		for(int i=0; i<su1;i++) {
			str+=sc.nextLine();
			
		}
		System.out.println(str);
		
		
	}
	public void repeatTest3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num=sc.nextInt();
		String supak="";
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				supak+="박";					
			}else {
				supak+="수";
			}
			
			
		}
		System.out.println(supak);
		
		
		
		
	}
	public void repeatTest4() {
		Scanner sc=new Scanner(System.in);
		System.out.print("구구단 프로그램 ");
		System.out.print("단을 입력하시오 : ");
		int dan=sc.nextInt();
		if(dan>0&&dan<10) {
			for(int i=1;i<10;i++) {
				System.out.println(dan+"*"+i+"="+dan*i);
			}
			
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
	
		
		
			
			
		
		
	}

}
