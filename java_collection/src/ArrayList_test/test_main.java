package ArrayList_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class test_main {

	public static void main(String[] args) {
		
		try(BufferedReader bf = new BufferedReader(new FileReader("c:/test/food.txt"))){
			ArrayList<food> list = new ArrayList<food>();
			while(true) {
				String line =bf.readLine();
				if(line == null) break;
				
				String[] tmp=line.split("-");
				food f = new food(tmp[0],Integer.parseInt(tmp[1]),tmp[2]);
				
				list.add(f);
			}
			System.out.println(list);
			
			
		}catch(Exception e) {
			System.out.println("파일 로드 및 반환 실패");
		}

	}

}
