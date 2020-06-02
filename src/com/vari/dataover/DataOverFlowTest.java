package com.vari.dataover;

public class DataOverFlowTest {
	//실행용 메소드 작성
	public static void main(String[] args) {
		//byte자료형 데이터 오버플로우 확인하기
		//byte bnum=127;
		int bnum=127;
		for(int i=0;i<300;i++) {
			System.out.println(bnum++);
		}
	}
	
	
}






