package inherit_test;

public class aircon extends house {
	int temp = 22;	//온도
	int speed = 1 ;	//풍속
	
	aircon(){}
	aircon(String brand){
		super(brand);
	}
	
	@Override
	public void power() {
		super.onoff = !super.onoff;
		System.out.println("에어컨 전원 : "+super.onoff);
	}
	
	@Override
	public String toString() {
		return super.brand+" , 전원 : "+super.onoff+" 온도 : "+this.temp+"℃ 풍속 : "+this.speed; 
	}
}
