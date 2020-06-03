package com.op.test;

public class MathOperator {

	public static void main(String[] args) {
		//산술연산처리하기
		//산술연산 -> 숫자형 자료형에 해당함.
		//byte, short, int, long, float, double
		//+, -, /, *, %(나머지)
		int su=19,su1=20,su2=30;
		//su+su1;//산술연산만 처리하여 끝낼 수는 없고, 연산결과를 출력을 해주던, 
		//다른 연산을, 변수에 대입
		int result;
		result=su+su1;
		System.out.println("+연산결과 : "+result);
		System.out.println("+연산 : "+(su+su1));
		result=su1-su2;
		System.out.println("-연산결과 : "+result);
		result=su1*su2;
		System.out.println("*연산결과 : "+result);
		result=(su+su1)*su2;
		System.out.println("*연산결과 : "+result);
		
		//result
		double result2=(double)su/su2;//나누기연산을 할 경우 자료형에 주의!
		
		System.out.println("/연산결과 : "+result2);
		
		
		//나머지 계산하기
		result=su%su2;
		System.out.println(result);
		System.out.println(5%2);
		
		//짝수, 홀수 구분
		//2/2 = 0  나머지, 3/2 = 1 4/2 = 0 5/2 = 1
		//n배수를 구하는 것
		
		//숫자 두개를 입력받아 두개의 값을 +,-,*,/,% 연산을 각각 실행하고
		//그 결과를 출력하세요!
		
		
		
	}
	
}





