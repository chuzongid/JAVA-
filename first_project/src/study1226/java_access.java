package study1226;

import java.util.Arrays;

import study122602.tv;

public class java_access {
	

	public static void main(String[] args) {
		book.cnt = 1;	//클래스 변수이기떄문에 객체생성없이 사용가능
		book bk = new book();
		bk.title = "c언어";	// 인스턴스 변수는 객체 생성후 사용가능
		book.cnt = 2;
		bk.cnt = 3;
		
		book.init();
		
		final int num = 10;
//		num = 20;
		
		final int[] arr = new int[] {10,20,30};
		arr[0] = 100;
		
		System.out.println(Arrays.toString(arr));
		
		book bk1 = new book();
		bk1.title = "html과 css";
		
		tv t1 = new tv();
		t1.maker = "삼성";
	}

}
// 제어자 - 클래스 , 변수 , 메서드 
// 접근제어자 - public , private , protected , defalut
// static , final , abstract , native

// static - '클래스의' 또는 '공통적인'
//		  - static이 붙은 변수나 메서드는 인스턴스(객체)를 생성하지 않고 사용가능
//		  - static 변수는 인스턴스 메서드에서 사용 가능 하다.
//		  - static 메서드에서는 인스턴스 변수 사용불가
//		  - static 메서드에서는 오직 static 변수나 , static 메서드만 사용가능
//		  - static class 내부 클래스에 적용 하여 사용한다.

// final - '마지막의' 또는 '변경될 수 없는'
//		 - final을 변수에 붙여주면 상수에 의마가 된다.(초기값 이후에 값 변경 안됨)
//		 - final이 붙은 배열은 배열내부의 값변경은 되지만 , 다른 배열로 교체는 불가능
//		 - final을 붙여주면 해당 메서드는 오버라이딩이 안된다.
//		 - final을 class에 붙여주면 상속 할 수 없다.(추상화도 안된다.)

// 접근제어자 
// public - 공공의 , 제한없이 사용가능 , 패키지가 같지않아도 사용가능
//		  - class에 public이 붙은 경우 어디에서도 해당 클래스를 사용할 수 있다.
//		  - 인스턴스변수 , 클래스변수 , 인스턴스 메서드 , 클래스 메서드 등 public이 붙지 않으면
//		  - 객체를 생성하여도 사용하는데 제한이 있다.
// default - 같은 패키지에서만 사용 가능
// protected - 같은 패키지에서만 사용 가능 , 
//			 - 다른 패키지에서도 상속 관계라면 사용가능
// private - 패키지가 같아도 달라도 사용 불가
//		   - 어떠한 클래스도 사용 할 수 없다.
//		   - 오직 해당 클래스 내부에서만 사용가능