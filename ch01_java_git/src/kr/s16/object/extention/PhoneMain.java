package kr.s16.object.extention;

public class PhoneMain {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("010-1234-5678" , "Iphone13pro" , "Sierra Blue", "ios");
		FeaturePhone fp = new FeaturePhone ("010-5678-1234" , "Galaxy S24 Ultra" , "White" , 24000000);
		
		System.out.print("전화번호 : " + sp.getNumber() +"\t");
		System.out.print("모델명 : " + sp.getModel()+"\t");
		System.out.print("색상 : " + sp.getColor()+"\t");
		System.out.print("특징(OS / 화소수) : "  + sp.getOs() +"\n");
		
		System.out.print("전화번호 : " + fp.getNumber() +"\t");
		System.out.print("모델명 : " + fp.getModel() +"\t");
		System.out.print("색상 : " + fp.getColor() +"\t");
		System.out.print("특징(OS / 화소수) : "  + fp.getPixel() +"\n");
	}

}
