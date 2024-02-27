package kr.s13.object.array;

class Book{
	String category;
	String name;
	private int price;
	private double discount;

	public Book (String c , String n , int p , double d) { //생성자
		category = c; 	name = n; 
		price = p; 		discount = d;
		
	}

	public String getCategory() {
		return category;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public double getDiscount() {
		return discount;
	}
}

public class BookMain {
	public static void main(String[] args) {
		
		Book [] bookArray = new Book[3];
		//Book 객체를 3개 생성하여 배열에 저장
		bookArray[0] = new Book ("IT" , "Java" , 50000, 0.05); //객체의 주소가 대입이 된다
		bookArray[1] = new Book ("IT", "Oracle", 40000, 0.03);
		bookArray[2] = new Book ("Art", "Gogh", 60000, 0.06);

		//반복문을 이용하여 객체의 요소 출력
		for(int i = 0 ;  i <bookArray.length; i++) {
			System.out.printf("%s \t" , bookArray[i].getCategory());
			System.out.printf("%s \t" , bookArray[i].getName());
			System.out.printf("%d \t" , bookArray[i].getPrice());
			System.out.printf("%.2f%n" , bookArray[i].getDiscount());
		}
		
		
	}

}
