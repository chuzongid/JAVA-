package study1221_2;

import java.util.Arrays;
import java.util.Scanner;

public class java_methode {
	
	static void list_print( music[]mylist ) {
		for(music obj : mylist) {
			System.out.println( obj );
		}
	}
	
	static void song_search(String keyword , music[]mylist) {	//가수 또는 노래제목으로 검색
		boolean issong = false;
		for(music obj : mylist ) {
			if(obj.singer.equals(keyword) || obj.title.equals(keyword)) {
				System.out.println(obj);
				issong = true;
			}
		}
		if(!issong) {
			System.out.println("검색 결과 없음");
		}
	}
	
	static Scanner scan = new Scanner(System.in);
	
	
	
	
	

	public static void main(String[] args) {
		music[] mylist = new music[10];
		mylist[0] = new music( "엑소","첫눈",327 );
		mylist[1] = new music( "르세라핌","Perfect Night",239);
		mylist[2] = new music( "에스파","Drama",334 );
		mylist[3] = new music( "태연","To.X",251 );
		mylist[4] = new music( "임영웅","사랑은 늘 도망가",403 );
		mylist[5] = new music( "임영웅","Do or Die",326 );
		mylist[6] = new music( "정국","Seven", 305 );
		mylist[7] = new music( "아이브","Baddie", 235 );
		mylist[8] = new music( "박재정","헤어지자 말해요",404 );
		mylist[9] = new music( "임영웅","모래 알갱이", 341 );
		
		list_print(mylist);
				
		System.out.println("가수 또는 노래제목 : ");
		String keyword = scan.nextLine();
		song_search(keyword,mylist);
	}
	
	

}
