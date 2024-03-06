package kr.s27.collection;
import java.util.*;

public class ArrayListMain08 {

	public static void main(String[] args) {
		// 2차원 배열 형태를 ArrayList로 구현하기
		
		ArrayList<CartItem> list = new ArrayList <CartItem>();
		list.add(new CartItem("A1001" , 2 , 2000));
		list.add(new CartItem("B1001" , 1 , 7000));
		list.add(new CartItem("C1001" , 3 , 2500));

		System.out.printf("%s   %8s   %8s%n" , "상품코드" , "수량", "가격");
		System.out.println("-------------------------------------");
		
		for(CartItem item : list)	{
			System.out.printf("%s    %,8d        %,8d%n", item.getCode() , item.getNum() , item.getPrice());
		}
		
		System.out.println("-------------------------------------");
		//요소의 삭제
		list.remove(1);
		for(CartItem item : list)	{
			System.out.printf("%s    %,8d        %,8d%n", item.getCode() , item.getNum() , item.getPrice());
		}
	}

}
