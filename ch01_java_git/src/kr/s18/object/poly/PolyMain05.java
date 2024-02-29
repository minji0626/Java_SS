package kr.s18.object.poly;

// 부모 클래스
class Parent3 {
	//Object의 toString을 재정의
	@Override
	public String toString () {
		return "Parent3 클래스";
	}
}

class Child3 extends Parent3{
	
	@Override
	public String toString () {
		return "Child3 클래스";
	}

}


public class PolyMain05 {
	public static void main(String[] args) {
		Parent3 p = new Parent3(); //-> parent, object만 올라감
		
		//컴파일시 오류는 없지만 실행시 오류가 발생한다.
		//Child3 ch = (Child3) p ;
		
		//istance of 연산자는 상속관계일 때 사용한다.
		//좌측에 지정한 객체가 우측에 지정 타입을 사용할 수 있는지
		//검증하는 연산자, 사용 가능 : true , 사용 불가능 : false
		//p: 객체         child3 : 타입
		if(p instanceof Child3) {
			Child3 ch3 = (Child3) p;
			System.out.println(ch3);
			System.out.println("-------------");
		}
		else {
			System.out.println(p);
		System.out.println("+++++++++++++");
		}
	}

}
