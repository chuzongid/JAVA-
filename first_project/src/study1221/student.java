package study1221;

public class student {
	String name;
	int kor;
	int mat;
	int eng;
	int total;
	float avg;
	
	@Override
	public String toString() {
		return name+"["+kor+" , "+mat+" , "+eng+"] 총점 : "+total+" 평균 : "+String.format("%.1f",avg);
	}
	
	void calc(){		//총점 , 평균
		this.total = kor+mat+eng;
		this.avg = total/3.0f;
	}
	
	
	student(){
		
	}

	
	student(String name , int k , int m , int e){		//생성자 메서드는 클래스명으로 메서드이름을 사용한다.
		this.name = name;
		this.kor = k;
		this.mat = m;
		this.eng = e;
		this.calc();
	}
}

//클래스를 정의하면 클래스명과 동일한 이름을 가진 생성자 메서드가 자동으로 생긴다. 
//메서드 오버로딩 - 메서드 명은 같지만 소괄호 안에 들어가는 입력매개변수 내용이 다르다.
//	메서드의 이름은 같아야한다.
//	매개변수는 같으면 안된다.( 타입이 다르거나 , 매개변수 갯수가 다르거나 )
//	동일한 클래스에서만 오버로딩 할 수 있다.
// 메서드 구조 - 반환타입 메서드이름 ( 매개변수 ){ }
