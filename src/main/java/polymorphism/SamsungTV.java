package polymorphism;

import org.springframework.stereotype.Component;

@Component("samsungtv")
public class SamsungTV implements TV {
private Speaker speaker;
private int price;

	
	
	/*
	public void initMethod() {
		System.out.println("��ü �ʱ�ȭ �۾�ó��");
	}
	
	public void destoryMethod() {
		System.out.println("��ü ���� ���� ó���� ���� ========");
	}*/
	
	
	public SamsungTV() {
		System.out.println("=======> ��ü���� SamsungTV(1)");
	} /* ������ ���� ����ȴ� */
	

	public void setSpeaker(Speaker speaker) {
		System.out.println("====> setSpeaker() ȣ��");
		this.speaker = speaker;
	}


	public void setPrice(int price) {
		System.out.println("====> setPrice() ȣ��");
		this.price = price;
	}



   /*
	public SamsungTV(Speaker speaker) {
		System.out.println("=======> ��ü���� SamsungTV(2)");
		this.speaker = speaker;
	}




	public SamsungTV(Speaker speaker, int price) {
		System.out.println("=======> ��ü���� SamsungTV(3)");
		this.speaker = speaker;
		this.price = price;
	}

*/


	@Override
	public void powerOn() {
		System.out.println("SamsungTV --- ���� �Ҵ�. (����: "+price +")");
		
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV --- ���� ����");
		
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
		System.out.println("SamsungTV --- ���� �Ҵ�");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV --- ���� ����");
	}
	
	public void volumeUp() {
		System.out.println("SamsungTV --- �Ҹ��� �ø���");
	}
	
	public void volumeDown() {
		System.out.println("SamsungTV --- �Ҹ��� ������");
	}
	  */


} 
