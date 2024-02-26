package kr.s07.object.method;

class Tv{
	// 멤버 변수
	int channel ; // 채널 번호
	boolean power ; // on/off 기능

	//멤버 메서드 ( 동작)
	public void isPower() { // TV 전원을 키거나 끄거나 기능을 수행하는 메서드
		power =  !power;
	}
	public void channelUp() { // TV의 채널을 높이는 기능 수행하는 메서드
		++channel;
	}

	public void channelDown() { //TV의 채널을 낮추는 기능을 수행하는 메서드
		--channel;
	}

}


public class TvMain {

	public static void main(String[] args) {
		//객체 선언 및 초기화
		Tv t = new Tv(); // 현재 TV는 꺼져있는 상태 power가 false 상태이기 때문에
		t.isPower(); // power의 값은 false에서 true로 바뀜
		System.out.println("TV 실행 여부 : " + t.power);
		System.out.println("현재 채널 : " + t.channel);
		System.out.println("--------------------------");

		t.channel = 7;
		System.out.println("첫번째 변경된 채널 : " + t.channel);
		System.out.println("--------------------------");

		t.channelDown(); // 1 차감
		System.out.println("두번째 변경된 채널 : " + t.channel);
		System.out.println("--------------------------");
		
		//TV 전원 끄기
		t.isPower(); // true -> false
		System.out.println("TV 실행 여부 : " + t.power);
	}

}
