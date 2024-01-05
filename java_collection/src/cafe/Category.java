package cafe;

public enum Category {
	커피(10) , 음료(11) , 뺵스치노(12);
	
	final private int num;
	private Category(int num) {
		this.num = num;
	}
}

// enum - 열거형
// enum의 생성된 요소들의 값을 변경하려면 클래스의 생성자메서드 사용법과 동일하게 해야한다.
// A라는 클래스 new A(10);

// 상수에 이름을 부여하여 사용할 수 있도록 해주는방법 - enum
// 자바스크립트 - const num = 10;
// 자바 - final int num = 100;
