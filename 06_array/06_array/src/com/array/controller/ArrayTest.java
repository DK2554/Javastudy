package com.array.controller;

import java.util.Scanner;

public class ArrayTest {
	public void arrayBasicTest() {
		// 기본배열 선언과 할당하기
		int[] numbers = new int[3];
		System.out.println(numbers[0]);
		// 배열 사용하기 위해서는 반드시 할당해줘야함
		numbers[0] = 10;// 할당안하면 int형의 경우에는 초기값으로0을 부여함
		System.out.println(numbers[0]);

		// 같은 자료형의 변수를 모아 놓음!같은 자료형만 저장가능
		// 배열은 보관할 변수의 갯수를 정해놔야함
		// 한번정한 배열변수의 갯수는 추가,삭제가 불가능
		// ============06-11=============
		// 배열 ,선언할당
		// 정수형 10개를 보관할 수있는 변수 선언
		// 학생이름 5명을 저장할려는 변수지정

		int[] num = new int[10];
		String[] name = new String[5];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		name[0] = "유병승";
		name[1] = "김도환";
		name[2] = "강승윤";
		name[3] = "선유민";
		name[4] = "장대은";
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] += i + 1;
		}

	}

	public void studytest() {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[6];
		for (int i = 0; i < name.length; i++) {
			System.out.print("이름을 입력하시오 : ");
			name[i] = sc.nextLine();
		}
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);

		}
		// 배열 선언과 동시에 초기값을 대입
		String animal[] = { "코끼리", "사자", "매", "얼룩말", "돌고래" };

	}

	public void arrayTest() {
		Scanner sc = new Scanner(System.in);
		char[] ch = new char[5];
		for (int i = 0; i < ch.length; i++) {

			System.out.print((i + 1) + "번째 입력 :");
			ch[i] = sc.next().charAt(0);
		}
		System.out.print("첫번째  : " + ch[0]);
		System.out.print("네번째  : " + ch[3]);
	}

	public void arrayTest2() {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.print("정수 입력 " + (i + 1) + ":");
			num[i] = sc.nextInt();
			count += num[i];
		}
		System.out.println("합계 " + count);

	}

	public void arrayRandom() {
		int[] random = new int[5];

		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 20) + 1;
		}
		for (int i = 0; i < random.length; i++) {
			if (random[i] % 2 != 0) {
				System.out.println("홀수값입니다 : " + random[i]);

			}

		}
		int total = 0;
		for (int i = 0; i < random.length; i++) {
			int count = 0;
			for (int j = 0; j < random.length; j++) {
				if (i != j && random[i] == random[j]) {
					count++;
					total += count;
				}

			}

			/*
			 * else { System.out.println("짝수값입니다 : " + random[i]);
			 */
			System.out.println(random[i] + ": " + count);
		}

		System.out.println("중복값갯수 : " + total);

	}

	public void swapData() {
		// 문자열 4개 저장할수 있는 변수를 만들고
		// 가.나.다.라를 저장하고
		// 배열에 저장되어 있는 나와 다의 위치를 변경하세요
		String[] ch1 = new String[4];
		String tmp = "";
		ch1[0] = "가";
		ch1[1] = "나";
		ch1[2] = "다";
		ch1[3] = "라";

		tmp = ch1[2];
		ch1[2] = ch1[3];
		ch1[3] = tmp;
		System.out.println(ch1[2] + ch1[3]);

	}

	public void arrayCopy() {
		// 앝은복사...
		// 배열의 주고값만 복사하여 실제 값이 저장되는 변수를 공유하는 방법
		int[] arr = { 1, 2, 3, 4 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		int[] copyArr = arr;
		for (int i = 0; i < copyArr.length; i++) {
			System.out.println(copyArr[i]);
		}
		// 2.System.arraycopy()메소드 이용하기
		// System.arraycopy(복사될대상배열,시작위치,값을 가져올 배열,시작위치,복사될갯수)
		int[] num = { 1, 2, 3, 4 };
		int[] copyNum = new int[num.length];
		for (int value : copyNum)
			System.out.print(value + " ");
		System.arraycopy(num, 0, copyNum, 0, num.length);// 깊은복사
		System.out.println("");
		for (int value : copyNum)
			System.out.print(value + " ");
	}

	public void doubleArray() {
		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = j+1;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				
				System.out.print(arr[i][j]);
				
			}
			System.out.println();

		}
		int [][]arr2=new int[3][3];
		int count=1;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j]=count++;
					
			
				
				
			}

		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				
				System.out.print(arr2[i][j]);
				
			}
			System.out.println();

		}
		
	}
}
