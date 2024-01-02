package study1220;

import java.util.Arrays;

public class homework {

	public static void main(String[] args) {
		//과제
		String song = "크리스마스에는 많은 것을 원하지 않아요 # 내가 원하는건 딱 하나에요 # "
		+ "트리 아래에 선물 같은것도 신경쓰지 않아요 # 당신을 원해요 # "
		+ "당신이 생각하는 것보다 더  # 내 소원을 이뤄줘요 # "
		+ "내가 크리스마스에 원하는건 당신이에요 ";
		 /* 1. # 기준으로 한줄씩 출력 하세요( #은 출력창에 나오면 안되요)
		 * 2. 당신 이라는 단어 대신 "그대"라고 바꾸어서 출력하세요
		 * 3. 크리스마스를 영어로 변경하여 출력하세요(대문자로)
		 * 4. 세번쨰 #뒤의 가사 무엇인지 출력하세요.
		 */
		String[] change = song.split(" # ");
		for(String k : change) {
			System.out.println(k);
		}
		System.out.println();
		
		System.out.println(song.replaceAll("당신", "그대"));
		System.out.println();
		
		System.out.println(song.replaceAll("크리스마스","christmas").toUpperCase());
		System.out.println();
		
		System.out.println(change[3]);
		
		
		
		
	}

}
