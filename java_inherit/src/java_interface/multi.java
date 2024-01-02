package java_interface;

public class multi {

	public static void main(String[] args) {
		UsbCable k1 = new keyboard();
		k1.plugNplay();
		k1.keyValue();
		
		
		Bluetooth k2 = new keyboard();
		k2.SetBluetooth();
		k2.keyValue();
		
		

	}

}

interface Passing{
	public void keyValue();	//키보드값 받아오기
}

interface UsbCable extends Passing{
	public void plugNplay();
}

interface Bluetooth extends Passing{
	public void SetBluetooth();
}
interface Wifi extends Passing{
	public void DirectWifi();
}

class keyboard implements UsbCable , Bluetooth , Wifi{
	@Override
	public void keyValue() {
		System.out.println("키보드 값 받음");
	}
	@Override
	public void plugNplay() {
		System.out.println("꽂으면 바로 사용가능");
	}
	@Override
	public void SetBluetooth() {
		System.out.println("블루투스 연결하여 등록하면 사용가능");
	}
	@Override
	public void DirectWifi() {
		System.out.println("다이렉트 와이파이 활성화 해서 연결 후 사용");
	}
	
}


// 자바의 다중 상속
// 자바에서 클래스들의 상속은 단일 상속만 가능하다.
// 자바에서 다중상속은 인터페이스들을 사용한다.
// 다중 상속을 통해서 다양한 다형성을 구현할 수 있다.

// 키보드 구매 했다.
// 컴퓨터와 연결 방식 - USB , 블루투스 , 리시버 , wifi
// 
