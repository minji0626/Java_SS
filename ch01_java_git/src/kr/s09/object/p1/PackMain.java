package kr.s09.object.p1;

//호출하고자하는 클래스에 패키지를 등록
import kr.s09.object.p2.PackTwo;


public class PackMain {
	public static void main(String[] args) {
		//kr.s09.object.p1.PackOne p1 = new kr.s09.object.p1.PackOne();
		// 같은 패키지의 클래스를 호출해서 객체 생성을 할 때는 패키지를 생략가능하다.
		
		PackOne p1 = new PackOne();
		//다른 패키지의 클래스를 호출할 때 반드시 패키지를 명시해야한다.
		//kr.s09.object.p2.PackTwo p2 = new kr.s09.object.p2.PackTwo();
		//import 문을 이용해서 호출하고자 하는 클래스의 패키지를 등록했기때문에 클래스 명만 기재해도 호출가능해짐
		PackTwo p2 = new PackTwo();
	}

}
