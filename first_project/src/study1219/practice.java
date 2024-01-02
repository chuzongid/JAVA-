package study1219;

import java.util.Arrays;

public class practice {

	public static void main(String[] args) {
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println();
		
		System.out.println(str1.charAt(1));
		System.out.println(str2.charAt(1));
		System.out.println();
		
		System.out.println(str1.indexOf("a"));
		System.out.println(str1.lastIndexOf("a"));
		System.out.println(str1.indexOf("a",8));
		System.out.println(str1.lastIndexOf("a",8));
		System.out.println(str1.indexOf("Java"));
		System.out.println(str1.lastIndexOf("Java"));
		System.out.println(str2.indexOf("하세요"));
		System.out.println(str2.lastIndexOf("하세요"));
		System.out.println(str1.indexOf("bye"));
		System.out.println(str2.lastIndexOf("고맙습니다"));
		System.out.println();
		
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(false);
		System.out.println(str3);
		System.out.println(str4);
		
		String str5 = str3.concat(str4);
		System.out.println(str5);
		
		String str6 = "안녕"+3;
		String str7 = "안녕".concat(String.valueOf(3));
		
		String str8 = "Hello Java";
		String str9 = "안녕하세여";
		
		String str10 = "hi";
		
		
		
		
		
	}

}
