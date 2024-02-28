package kr.s17.object.overriding;

//부모 클래스
class Point {
	int x;
	int y;
	
	//생성자 
	public Point (int x , int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

//자식 클래스
class Point3D extends Point{
	int z;
	
	//생성자
	public Point3D (int x , int y , int z){
		super(x, y);
		this.z = z;
	}
	
	@Override
	//메소드
	public String getLocation() {
		return "x : " + x + ", y : " + y + ", z : " + z ;
	}
}


public class SuperMain04 {
	public static void main(String[] args) {
			Point3D p3 = new Point3D(10,20,30);
			System.out.println(p3.getLocation());


	}

}
