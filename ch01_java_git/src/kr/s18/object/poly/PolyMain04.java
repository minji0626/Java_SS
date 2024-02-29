package kr.s18.object.poly;
/* ! 상속할 때 주의해야할 부분 !
 * 최상위 :  Object =======> Object 영역 ===========> Object 영역
 * 상위 : Parent ========> Parent 영역 === 객체 생성 ===> Parent 영역 
 * 하위 : Child ----객체 생성 ---->  Child  영역 ----------------- parent 객체 생성을 하면 child 영역이 없기 때문에 child로 형변환이 불가능하다.
 */
// 부모 클래스
class Product {
	int price ; //제품 가격
	int bonusPoint; // 제품 구매시 제공하는 포인트 
	
	public Product (int price)	{
		this.price = price ;
		bonusPoint = price / 10; 
	}
	
	//메소드 생성
	public String getName () {
		return "상품" ; // 제품의 이름을 상품으로 지정을 해줌
	}
	
}

class Audio extends Product {
	// 생성자
	public Audio () {
		super (300);
	}
	
	//메소드 재정의
	@Override
	public String getName() { return "Audio"; }
	//메소드를 재정의하게 되면 getName()을 출력하더라도 '상품'이 아닌 Audio로 출력이 된다.
}

//자식 클래스
class Tv extends Product {
	//생성자
	public Tv () {
		super(100); // 100만원 값 지정
	}
	
	//메소드 재정의
	@Override
	public String getName() { return "TV"; } 
	//메소드를 재정의하게 되면 getName()을 출력하더라도 '상품'이 아닌 TV로 출력이 된다.
}

class Computer extends Product {
	//생성자
	public Computer() {
		super(200); //200만원 값 지정
	}
	
	//메소드 재정의
	@Override
	public String getName() { return "Computer"; }
	//메소드를 재정의하게 되면 getName()을 출력하더라도 '상품'이 아닌 Computer로 출력이 된다.
}

//소비자
class Buyer {
	private int money = 1000;  //소비자가 보유하고 있는 금액
	private int bonusPoint = 0;  //소비자가 구매시에 누적되는 포인트 점수
		
	//구매하기			//product가 상속되어져있다면 다 불러올 수 있음
	public void buy(Product p) {
		// TV , Computer가 product p에 전달된다.
		// 가격과 소비자가 보유하고 있는 금액을 비교한다
		
		if (money < p.price) {
			System.out.println("!! 잔액이 부족합니다. 제품 구매에 실패했습니다.");
			return;
		}
		money -= p.price ; //소비자가 보유하고 있는 금액에서 상품 가격 차감
		bonusPoint += p.bonusPoint; // 소비자가 보유하고 있는 포인트에다가 구매후 적립되는 포인트 적립
		System.out.println(p.getName() + " 구입에 성공했습니다.");
		System.out.printf("현재 남은 돈은 %d만원입니다.%n" , money);
		System.out.printf("보유하고있는 포인트는 %d점입니다.%n" , bonusPoint);
	}
}

public class PolyMain04 {
	public static void main(String[] args) {
		//구매자 생성
		Buyer b = new Buyer ();
		
		//제품 생성
		Tv tv = new Tv ();
		Computer com = new Computer ();
		Audio audio = new Audio();
		
		//제품 구매
		b.buy(tv); // Tv -> Product 업캐스팅 | 자동적으로 형변환
		System.out.println();
		b.buy(com); // Computer -> Product 업캐스팅 | 자동적으로 형변환
		System.out.println();
		b.buy(audio); // Audio -> Product 업캐스팅 | 자동적으로 형변환
		
	}
}
