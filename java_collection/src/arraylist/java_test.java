package arraylist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class java_test {

	public static void main(String[] args) {
		ArrayList<book> list = load();	// load 메서드로부터 텍스트 파일을 불러와 ArrayList에 저장
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 도서 검색 - 검색어와 일치하는 값 찾기 , 검색어가 포함되어있는 값 찾기
		// 책 제목으로 검색 - 검색어와 일치하는 값 찾기
		// 검색 -> 비교(일치하는값찾기 - 같다 , 같지않다)		포함 값 찾기 - 범위 검색(같다,같지않다)
		// 일치 하는값 -> indexOf	,	포함 -> contains
		book temp = new book("난 항상 물음표","노재홍", 2023);
		System.out.println(list.indexOf("난 항상 물음표"));
		
		
		// 정렬 - 두개의 데이터를 비교하여 크고 작다 를 따져서 위치를 변경하는 방법
		// 기본 데이터 타입에 대한 자바 내장 클래스들은 비교,정렬,검색을 위한 메서드들을 가지고 있다.
		// 사용자(개발자)정의 클래스는 비교,정렬,검색을 위한 메서드 들이 없기떄문에
		// indexOf , contains , sort 와 같은 메서드 사용시 필요한 메서드 들을 구현해야한다.
		
		Collections.sort( (List<book>)list);
		Iterator<book> it = list.iterator();
		while(it.hasNext()) {
			book data = it.next();
			System.out.println(data);
		}
//		list.sort(Comparator.naturalOrder());
		
	}
	public static ArrayList<book> load() {	//book.txt 파일 불러오기
		ArrayList<book> list = new ArrayList<book>();
		try(BufferedReader bf = new BufferedReader(new FileReader("c:/test/book.txt"))){
			while(true) {
				String line = bf.readLine();
				if(line == null) break;
				String[] tmp = line.split(",");
				book data = new book(tmp[0].trim(),tmp[1].trim(),Integer.parseInt(tmp[2].trim()));
				list.add(data);
			}
		}catch(Exception e) {
			System.out.println("파일 로드 및 반환 실패");
			e.printStackTrace();
		}
		return list;
	}

}
