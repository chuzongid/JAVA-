package study1219;

import java.util.Arrays;

public class homework {

	public static void main(String[] args) {
		int[] num = new int[] {30,4,50,60,14,80,45,72,94,25};
		int total = 0;
		int average = 0;
		char [] grade = new char[num.length];
		
		for(int i=0; i<num.length; i++) {
			 total += num[i];
		}
		average = total / num.length;
		
		for(int i=0; i<num.length; i++) {
			if(num[i]<=average) {
				grade[i] = 'F';
			}else {
				grade[i] = 'A';
			}
		}
		System.out.print(Arrays.toString(grade));
		
		

	}

}
//과제 - 자바 배열 문제
	//	{30,4,50,60,14,80,45,72,94,25}
	// 10개의 정수가 저장된 배열의 값을 확인하고
	// 평균을 구하세요
	// 10개의 정수를 평균 이하인 숫자들은 F , 평균 이상인 숫자들은 A라고 표시되는
	// 배열을 만들어 출력하세요
	
	// 출력 결과 - F,F,A,A,F,A,F,A,A,F