package exam.com;


// Ŭ���� TV
//  �ʵ� ������ channel
//  �޼ҵ� void channelUp() -> channel 1 ����
//  �޼ҵ� void channelDown() -> channel 1 ����
class TV {
	int channel;
	
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
// Ŭ���� CaptionTV(�ڸ����TV) ��� TV
//  �ʵ� boolean caption �ڸ�����
//  �޼ҵ� void displayCaption() -> "�ڸ�����: true/false"
class CaptionTV extends TV {
	boolean caption;
	
	void displayCaption() {
		System.out.println("�ڸ�����: " + caption);
	}
}

public class Ex1 {
	public static void main(String[] args) {
		// CaptionTV ��ü����
		CaptionTV captionTV = new CaptionTV();
		// �޼ҵ�ȣ�� channelUp()
		captionTV.channelUp();
		// channel �ʵ� �� ���
		System.out.println(captionTV.channel);
		// �޼ҵ�ȣ�� displayCaption()
		captionTV.displayCaption();
	} // main method

}
