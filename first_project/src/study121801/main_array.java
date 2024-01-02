package study121801;

import java.util.Arrays;
import java.util.Scanner;

public class main_array {

	static Scanner scan  = new Scanner(System.in);
	
	public static void main(String[] args) {
		//16개의 정수를 중복없이 배열에 저장하기
		int[]number = new int[16];
		
		for(int i=0; i<number.length; i++) {
			number[i] = (int)(Math.random()*50)+1;
			for(int k=0; k<i; k++) {
				if(number[k] == number[i]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(number));
		
		// number 배열을 한줄에 4개씩 4줄로 출력하세요.
		for(int i=0; i<number.length; i++) {
			if(i%4==0) 
				System.out.println();
			System.out.printf("%2d ",number[i]);
			
		}
		System.out.println();
		
		int[][] arr2 = new int[3][2];
		arr2[0][0] = 100;
		arr2[0][1] = 30;
		
		arr2[1][0] = 50;
		arr2[1][1] = 10;
		
		int[][] bingo = new int[][] {
			{24,12,45,11},{9,4,12,31},{6,41,39,17},{1,50,43,22}
		};
		for(int i=0; i<bingo.length; i++) {
			for(int k=0; k<bingo[i].length; k++) {
				if(bingo[i][k]<=25)
					System.out.printf("%2s ","★");
				else
					System.out.printf("%2d ",bingo[i][k]);
			}
			System.out.println();
		}
		
		//bingo 배열에서 25이하는 숫자대신 ★을 출력하세요.
		
		//크기가 서로 다른 이차원배열
		
		int[][] arr5 = new int[3][];	
		int[] a = new int[]{1,2,3,4,5};
		int[] b = {10,20,30,40};
		int[] c = {11,22,33,44,55,66,77};
		arr5[0] = a;
		arr5[1] = b;
		arr5[2] = c;
		
		
		for(int i=0; i<arr5.length; i++) {
			for(int k=0; k<arr5[i].length; k++) {
				System.out.print(arr5[i][k]+" ");
			}
			System.out.println();
		}
		
		//자바 스크립트 - 배열에 정수나 실수나 문자열을 복합적으로 저장할 수 있다.
		//자바 - 배열생성시 부여한 데이터 타입에 맞는 데이터만 저장 가능
		
		int num11 = scan.nextInt();
		scan.nextLine();
		String word = scan.nextLine();
				
		System.out.println(num11+" "+word);
		
		String[][] info = new String[3][3];
		
		for(int i=0; i<info.length; i++) {
			System.out.print("이름 : ");
			info[i][0] = scan.nextLine();
			
			System.out.print("나이 : ");
			int age = scan.nextInt();
			info[i][1] = Integer.toString(age);		//숫자를 문자열로 변경
			
			scan.nextLine();
			System.out.print("직업 : ");
			info[i][2] = scan.nextLine();
		}
		for(int i=0; i<info.length; i++) {
				System.out.printf("이름 : %s 나이 : %s 직업 : %s \n",info[i][0],info[i][1],info[i][2]);
		}
		
	
		//	과제 - 자바 배열 문제
		//	{30,4,50,60,14,80,45,72,94,25}
		// 10개의 정수가 저장된 배열의 값을 확인하고
		// 평균을 구하세요
		// 10개의 정수를 평균 이하인 숫자들은 F , 평균 이상인 숫자들은 A라고 표시되는
		// 배열을 만들어 출력하세요
		
		// 출력 결과 - F,F,A,A,F,A,F,A,A,F
		
	
		
		
	
	
	}
}

// 자바스크립스 배열에 특정값 존재여부 - indexOf(특정값) , includes(특정값)
// 자바 배열은 indexOf , includes가 없다.
// indexOf와 contains로 존재여부를 알 수 있지만,
// String과 List 클래스에서만 사용가능
// 비정방 배열
// Integer.toString
// Integer.parseInt()
// Float.parseFloat(); Double.parseDouble();
// static Scanner scan  = new Scanner(System.in);
// scan.nextInt() , scan.nextLine()