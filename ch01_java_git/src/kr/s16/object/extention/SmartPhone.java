package kr.s16.object.extention;


public class SmartPhone extends Phone {

	private String os;
	
	public SmartPhone(String number, String model , String color ,  String os) {
		
		this.number = number;
		this.model = model;
		this.color = color;
		this.os = os;
		
	}
		
	public String getOs() {
		return os;
	}


}
