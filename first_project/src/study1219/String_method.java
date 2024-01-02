package study1219;

import java.util.Arrays;
import java.util.Scanner;

public class String_method {
	public static void main(String[] args) {
		String word = "i like banana chacha";
		
		char ch = word.charAt(2);
		System.out.println(ch);
		
		Scanner scan = new Scanner(System.in);
		ch = scan.next().charAt(0);
		System.out.println(ch);
		
		if( word.equals("i like banana chacha"))
			System.out.println("같다");
		else {
			System.out.println("같지않다");
		}
		
		byte[] code = word.getBytes();
		System.out.println(Arrays.toString(code));
		
		int k = word.indexOf('k');
		System.out.println(k);
		int banana = word.indexOf("banana");
		System.out.println(banana);
		int a5 = word.indexOf('a',8);
		System.out.println(a5);
		int cha = word.indexOf("ch");
		System.out.println(cha);
		
		int len = word.length();
		System.out.println(len);
		
		String temp = word.replace("banana","apple");
		System.out.println(temp);
		System.out.println(word);
		
		temp = word.replaceAll("a", "c");
		System.out.println(temp);
		
		temp = word.replaceAll("a.","c");
		System.out.println(temp);
		
		temp = "010-1234-5678";
		temp = temp.replaceAll("[^0-9]","");
		System.out.println(temp);
		
		temp = word.substring(5);
		System.out.println(temp);
		
		temp = word.substring(7,15);
		System.out.println(temp);
		
		temp = "skyblue@naver.com";
		// 아이디와 포털사이트주소 알아내기
		String id = temp.substring(0,temp.indexOf("@"));
		System.out.println(id);
		String url = temp.substring(temp.indexOf("@")+1);
		System.out.println(url);
		
		temp = "대전광역시 중구 중앙로 121번길 20";
		// 위 주소에서 도시명과 도로명을 출력하세요
		String a = temp.substring(0,temp.indexOf("시")+1);
		System.out.println(a);
		String b = temp.substring(temp.indexOf("시")+2);
		System.out.println(b);
		
		String[] str =  word.split(" ");
		System.out.println(Arrays.toString(str));
		
		temp = "010-1234-5678";
		String password = temp.split("-")[2];
		System.out.println(password);
		
		temp = "12가 4570";
		String[] car = temp.split(" ");
		System.out.println(Arrays.toString(car));
		if(car[1].equals("4570")) {
			if(car[0].equals("12가")) {
				System.out.println("주차비 정산");
			}
		}
		
		temp = word.toUpperCase();
		System.out.println(temp);
		temp = word.toLowerCase();
		System.out.println(temp);
		
		word = "내가 좋아하는 노래 : ";
		temp = "바나나 알러지 원숭이";
		String song = word.concat(temp);
		System.out.println(song);
		
		System.out.println(word.isEmpty());
		
		System.out.println(temp.contains("원숭이"));
		
		System.out.println(word.startsWith("내"));
		System.out.println(temp.endsWith("어"));
	}
}
// String - 문자를 배열화 시킨것

// 1. 문자열에서 특정 문자 추출 - charAt()
// Scanner scan = new Scanner(System.in);

// 2. 문자열 비교 - equals()

// 3. 문자열을 byte로 반환 - getBytes() - 파일 불러오기

// 4. 문자열에서 특정 문자열의 위치를 리턴 - indexOf()

// 5. 문자열의 길이 - length() 

// 6. 문자열 변경(치환) - replace - String으로 리턴 - 원본 변경 x , 
// void로 리턴 - 원본 변경 o
// replaceAll

// 자바스크립트에서 정규표현식을 이용하여 문자열 변경
// 자바에서도 정규표현식을 사용한다.
// [^0-9]
// 특수문자제거[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9]

// 7. 문자열 추출 - substring

// 8. 문자열분리 - split() , 하나의 문자열을 지정한 문자기준으로 배열로 생성

// 9. 대문자, 소문자 변환 - toLowerCase() , toUpperCase()

// 10. 문자열과 문자열을 결합 - concat()

// 11. String 참조변수가 빈값인지 확인( 문자열이 있냐 없냐 ) - isEmpty()

// 12. 문자열에 특정 문자 또는 문자열 포함 여부 - contains()

// 13. 특정 문자로 시작 , 끝나는지 검사 - startsWith() , endsWith()

// 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 - Github token


