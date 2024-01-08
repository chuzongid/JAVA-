package cafe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class order {
	static Scanner scan = new Scanner(System.in);
	
	//전체 보여주는 메서드 : 분류(커피,음료,치노)선택 -> 해당 분류에서 제품 이름 입력하여 주문
	//커피 메뉴를 선택하여 보가가 음료 메뉴를 보고싶으면 이동하여 보이게 해줘야한다.
	public static void kiosk(HashMap<Category,Set<menu>> cafeMenu) {
		System.out.println("============주문============");
		
		Category main = Category.커피;
		while(true) {
			System.out.println("1.커피 2.음료 3.뺵스치노");
			Set<menu>list = cafeMenu.get(main);
			Iterator<menu> tmp = list.iterator();
			while(tmp.hasNext()) {
				System.out.println(tmp.next());
			}
			System.out.println("주문 메뉴 선택 및 항목 선택 : ");
			String input = scan.nextLine();
			if(isInteger(input)){	//정수변환 가능 - 분류번호 입력
				main = SelectCategory(file.i(input));
			}else {					//메뉴를 입력
				progress(input);
				break;
			}
			// 메뉴를 입력했는가? , 분류번호를 입력했는가?
			
		}
		
		
	}
	
	//주문 진행하는 메서드 : 주문할 제품을 선택했다면 결제 까지 진행 되는 메서드
	public static void progress(String orderMenu) {
		if(Order_Counter.Menu.containsKey(orderMenu)) {		//내가 선택한 메뉴가 map의 키값인가?
			menu select = Order_Counter.Menu.get(orderMenu);	//내가 선택한 메뉴의 menu클래스객체
			//핫,아이스? 베이직,소프트? 추가 선택 유도
			int price = 0;
			if(select.getCost1() != 0 && select.getCost2() != 0) {
				System.out.print("1.HOT 2.ICE : ");
				int HI = scan.nextInt();
				price = HI==1 ? select.getCost1() : select.getCost2();
			}else {
				price = select.getCost1() != 0 ? select.getCost1() : select.getCost2();
			}
			DecimalFormat df = new DecimalFormat("\u20A9###,###원");
			System.out.println("\n============주문 내역============");
			System.out.println(select);
			System.out.printf("카페인 : %dmg , 칼로리 : %dkcal , 용량 : %dml \n",select.getCaffeine(),select.getCalorie(),select.getMl());
			System.out.println("결제금액 : "+df.format(price));
			
			save_history(select.getMenu_name(),price);
		}
		// 내가 선택한 메뉴가 map의 키값이 아니라면 다시 메뉴를 선택하게 해줘야한다.
		
		
	}
	
	//주문 내역을 Order_history를 통해 저장 메서드
	private static void save_history(String menu , int price) {
		String id = Order_Counter.user.getId();
		
		String url = "jdbc:mysql://localhost:3306/chuzongid";
		String user = "chuzongid";
		String password = "pocket123!";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch( ClassNotFoundException e ) {
			System.out.println("드라이버 로드 실패");
		}
		
		Connection conn = null;	// mysql 접속 상태값 저장
		ResultSet set = null;	// mysql로부터 데이터를 받는다.
		PreparedStatement pt = null;	//mysql에 query문 전송
		
		try {
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("접속 성공");
		}catch(SQLException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		}
		
		
	}
	
	private static Category SelectCategory(int num) {
		switch(num) {
			case 1: return Category.커피;
			case 2: return Category.음료;
			case 3: return Category.뺵스치노;
		}
		return Category.커피;
	}
	
	private static boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
		
	}
}
