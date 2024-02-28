package kr.s15.object.thistest;

public class AnimalMain {
	
	public static void main(String[] args) {
		
		//인자가 있는 생성자를 이용해서 객체 생성
		Animal a1 = new Animal("참새" , 3 , true) ;
		System.out.println("이름 : " + a1.getName());
		System.out.println("나이 : " + a1.getAge());
		//System.out.println("비행 여부 : " + (a1.isFly() ? "가능" : "불가능"));		
		System.out.println("비행 여부 : " + printFly(a1.isFly()));		
		
		System.out.println("============================");
		
		//인자가 없는 생성자를 이용해서 객체 생성
		Animal a2 = new Animal();
		a2.setName("토끼");
		a2.setAge(5);
		a2.setFly(false);
		
		System.out.println("이름 : " + a2.getName());
		System.out.println("나이 : " + a2.getAge());
		//System.out.println("비행 여부 : " + (a2.isFly() ? "가능" : "불가능"));		
		System.out.println("비행 여부 : " + printFly(a2.isFly()));
		
	}

	private static String printFly(boolean fly) {
		return fly ? "가능" : "불가능" ;
	}
	
}
