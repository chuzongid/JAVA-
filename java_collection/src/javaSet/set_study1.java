package javaSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class set_study1 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(15);
		set.add(60);
		set.add(11);
		set.add(14);
		set.add(43);
		set.add(10);
		
		System.out.println(set);
		
		HashSet<String> 안경쓴사람 = new HashSet<>();
		HashSet<String> 팥붕어빵 = new HashSet<>();
		HashSet<String> 슈붕어빵 = new HashSet<>();
		
		안경쓴사람.add("남기현");안경쓴사람.add("이가림");안경쓴사람.add("김민수");안경쓴사람.add("노재홍");
		안경쓴사람.add("송재영");안경쓴사람.add("김정환");안경쓴사람.add("강동욱");안경쓴사람.add("김의찬");
		안경쓴사람.add("서종우");
		
		팥붕어빵.add("노재홍");팥붕어빵.add("서영배");팥붕어빵.add("김의찬");팥붕어빵.add("강동욱");
		팥붕어빵.add("김정환");팥붕어빵.add("박종권");
		
		슈붕어빵.add("남기현");슈붕어빵.add("이가림");슈붕어빵.add("이다희");슈붕어빵.add("김민수");
		슈붕어빵.add("여영근");슈붕어빵.add("송재영");슈붕어빵.add("안호성");슈붕어빵.add("서종우");
		
		HashSet<String> 팥X안경 = new HashSet<String>();
		Iterator<String> it = 안경쓴사람.iterator();
		while(it.hasNext()) {
			String name = it.next();
			if(슈붕어빵.contains(name)) {
				팥X안경.add(name);
			}
			System.out.println(name);
		}
		System.out.println(팥X안경);
		
		// 팥을 좋아하는 사람들 중에서 안경쓰지 않은 사람
		HashSet<String> 안경노팥좋아 = new HashSet<>();
		
		it = 팥붕어빵.iterator();
		while(it.hasNext()) {
			String name = it.next();
			if( !안경쓴사람.contains(name)) {
				안경노팥좋아.add(name);
			}
		}
		System.out.println(안경노팥좋아);
		
		HashSet<String> 안경슈좋아 = new HashSet<>();
		
		it = 슈붕어빵.iterator();
		while(it.hasNext()) {
			안경슈좋아.add(it.next());
		}
		
		it = 안경쓴사람.iterator();
		while(it.hasNext()) {
			안경슈좋아.add(it.next());
		}
		System.out.println(안경슈좋아);
		
		팥X안경.clear();
		팥X안경.addAll(안경쓴사람);
		팥X안경.retainAll(슈붕어빵);
		System.out.println(팥X안경);
		
		안경노팥좋아.clear();
		안경노팥좋아.addAll(팥붕어빵);
		안경노팥좋아.removeAll(안경쓴사람);
		System.out.println(안경노팥좋아);
		
		안경슈좋아.clear();
		안경슈좋아.addAll(안경쓴사람);
		안경슈좋아.addAll(슈붕어빵);
		System.out.println(안경슈좋아);
		
		//부분 집합 - A집합의 값 일부가 B집합으로 만들어진 경우 B집합은 A의 부분집합이라고 한다
		System.out.println(안경쓴사람.containsAll(팥붕어빵));
		System.out.println(안경슈좋아.containsAll(슈붕어빵));
		
		List<String> names = new ArrayList<String>(안경슈좋아);
		System.out.println(names);
		
	}

}
// Set - 입력한 데이터 순서 유지 안됨 ( 힙이라는 메모리 공간을 사용하기 때문에 
//										메모리 주소 , 크기 등에 의해 순서가 변경이 된다. )
//	   - 중복을 허용하지 않는다 . 
//	   - 데이터들의 그룹화 목적으로 사용( 수학 집합 )
//	   - HashSet : 수학에서의 집합을 표현하기 위한 클래스
//	   - TreeSet : 검색 , 정렬의 목적으로 사용되는 클래스