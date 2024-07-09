package polymorphism;

import org.springframework.stereotype.Component;

@Component("samsungtv")
public class SamsungTV implements TV {
private Speaker speaker;
private int price;

	
	
	/*
	public void initMethod() {
		System.out.println("객체 초기화 작업처리");
	}
	
	public void destoryMethod() {
		System.out.println("객체 삭제 전에 처리할 로직 ========");
	}*/
	
	
	public SamsungTV() {
		System.out.println("=======> 객체생성 SamsungTV(1)");
	} /* 생성자 먼저 실행된다 */
	

	public void setSpeaker(Speaker speaker) {
		System.out.println("====> setSpeaker() 호출");
		this.speaker = speaker;
	}


	public void setPrice(int price) {
		System.out.println("====> setPrice() 호출");
		this.price = price;
	}



   /*
	public SamsungTV(Speaker speaker) {
		System.out.println("=======> 객체생성 SamsungTV(2)");
		this.speaker = speaker;
	}




	public SamsungTV(Speaker speaker, int price) {
		System.out.println("=======> 객체생성 SamsungTV(3)");
		this.speaker = speaker;
		this.price = price;
	}

*/


	@Override
	public void powerOn() {
		System.out.println("SamsungTV --- 전원 켠다. (가격: "+price +")");
		
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV --- 전원 끈다");
		
	}

	@Override
	public void volumeUp() {
		// speaker= new SonySpeaker();
		speaker.volumeUp();
		
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
		
	}
	
	
	/* public void powerOn() {
		System.out.println("SamsungTV --- 전원 켠다");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV --- 전원 끈다");
	}
	
	public void volumeUp() {
		System.out.println("SamsungTV --- 소리를 올린다");
	}
	
	public void volumeDown() {
		System.out.println("SamsungTV --- 소리를 내린다");
	}
	  */


} 
