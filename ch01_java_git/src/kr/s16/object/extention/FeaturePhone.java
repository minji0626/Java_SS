package kr.s16.object.extention;

public class FeaturePhone extends Phone {

	private int pixel; //화소수
	
	public FeaturePhone (String number , String model ,  String color , int pixel) {
		this.number = number;
		this.model = model;
		this.color = color;
		this.pixel = pixel;
	}

	public int getPixel() {
		return pixel;
	}

	
	
}
