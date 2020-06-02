package com.print.test;

public class PrintTest {
	public static void main(String[] args) {
		//print와 println의 차이
		System.out.print("안녕하세요!");
		System.out.print("저는 유병승입니다.");
		System.out.println();
		System.out.println("안녕하세요!");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("저는 유병승입니다.");
		
		//포멧/형식으로 출력하는 printf사용하기
		String name="유병승";
		int age=19;
		char gender='남';
		double height=180.5;
		
		String name2="원빈";
		int age2=40;
		char gender2='남';
		double height2=180.2;
		System.out.println(name+" "+age+" "+gender+" "+height);
		System.out.println(name2+" "+age2+" "+gender2+" "+height2);
		
		System.out.printf("%-3s %d %c %.2f\n",name,age,gender,height);
		System.out.printf("%5s %d %c %.2f\n",name2,age2,gender2,height2);
		
		//이스케이프문 이용하기
		System.out.println(name+"\t"+age+"\t"+gender+"\t");
		System.out.println("안녕하세요 저는 "+name+"입니다.\n 저는 "+age+"살입니다.");
		System.out.println("c:\\dev");
		//문자열에서 ", ' 사용하고 싶을때
		System.out.println("'하하하' 웃었다");
		System.out.println("\"하하하\"웃었다");
		System.out.println("<p style=\"color:red\">하하하</p>");
	}
}
