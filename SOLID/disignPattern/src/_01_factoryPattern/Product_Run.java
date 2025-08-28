package _01_factoryPattern;

import java.util.Calendar;

public class Product_Run {
	public static void main(String[] args) {
		Product p1 = ProductFactory.getInstance("tv");  // static을 붙이면 클래스이름.메소드이름 으로 호출 가능
		System.out.println(p1);
		
		Product p2 = ProductFactory.getInstance("computer");
		System.out.println(p2);
		
		System.out.println(Calendar.getInstance().getClass());
		System.out.println(Calendar.getInstance().get(Calendar.YEAR));
	}
}
