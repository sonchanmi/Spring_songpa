package polymorphism;

public class SamsungTV implements TV {

	public void initMethod() {
		System.out.println("��ü �ʱ�ȭ �۾�ó��");
	}
	
	public void destoryMethod() {
		System.out.println("��ü ���� ���� ó���� ���� ========");
	}
	
	
	public SamsungTV() {
		System.out.println("=======> ��ü���� SamsungTV ");
	} /* ������ ���� ����ȴ� */
	
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV --- ���� �Ҵ�");
		
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV --- ���� ����");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("SamsungTV --- �Ҹ��� �ø���");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("SamsungTV --- �Ҹ��� ������");
		
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