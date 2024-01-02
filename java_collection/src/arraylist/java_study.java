package arraylist;

import java.util.ArrayList;

public class java_study {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(50);
		arr.add("이순신");
		arr.add(3.14);
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

}
// ArrayList
// 기존의 배열을 동적으로 사용하기 위한 클래스
// 기존 배열과 다른점은 여러 타입으로 지정해서 사용 할 수 있다.(재너릭)
// ArrayList에 기본 데이터 타입은 Object 라는 자바 최상위 클래스 타입이다.
// Object 타입으로 저장 되기 떄문에 사용하고자 하는 타입을 지정 해서 사용 해야한다.
// ArrayList처럼 collection 모든 클래스들은 타입을 지정해서 사용해야 한다.

// ArrayList<클래스> -> ArrayList(동적배열)에 저장할 데이터(객체)타입을
// <>안에 작성 하여 사용 해야 한다.
// <>안에 클래스를 넣어주면 해당 타입으로 동작 되도록 하는 방법은 제네릭이다.
// 제네릭운 사용자가 지정한 타입에 맞추어 사용 할 수 있도록 자바에서 제시하는 방법
// 제네릭을 사용하면 여러 타입을 처리하기 위한 코드의 복잡성이 줄어 들고
// 타입의 안정화를 도모 할 수 있다.

// 자바 컬렉션
// 다수의 데이터 또는 다수의 객체를 저장 , 관리 , 가공 하기 위한 자료구조 및 알고리즘을
// 개발자가 쉽게 사용할 수 있도록 만들어 놓은 인터페이스 및 클래스이다.

// Collection , Map
// Collection - list => ArrayList
//					 => Vector
//					 => LinkedList
//					 => Stack
//
//			  - Set	 => HashSet
//					 => TreeSet
// Map - HashTable
//	   - HashMap
//	   - TreeMap