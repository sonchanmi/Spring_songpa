package polymorphism;

public class LgTV implements TV{

	
	public LgTV() {
		System.out.println("=======> ��ü���� LgTV ");
	}
	
	
	@Override
	public void powerOn() {
		System.out.println("LgTV --- ���� �Ҵ�");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV --- ���� ����");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTV --- �Ҹ��� �ø���");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTV --- �Ҹ��� ������");
		
	}
	
	/*
	public void turnOn() {
		System.out.println("LgTV --- ���� �Ҵ�");
	}

	public void turnOff() {
		System.out.println("LgTV --- ���� ����");
	}

	public void soundUp() {
		System.out.println("LgTV --- �Ҹ��� �ø���");
	}

	public void SoundDown() {
		System.out.println("LgTV --- �Ҹ��� ������");
	} */
}
