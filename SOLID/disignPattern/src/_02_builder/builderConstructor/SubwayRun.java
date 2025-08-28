package _02_builder.builderConstructor;

import java.util.Scanner;

public class SubwayRun {

	public static void main(String[] args) {
		Subway menu1 = new Subway_Builder(15, "통밀", "칠리").build();
		System.out.println(menu1);
		
		Subway menu2 = new Subway_Builder(30,"참깨","핫")
						.setCheese("체다")
						.setVegetable(true).build();
		
		Scanner s = new Scanner(System.in);
		Subway_Builder subwayBuilder = new Subway_Builder(15,"하티","올리브오일").setCheese("모짜렐라");
		
		System.out.print("추가 토핑을 선택하세요 >> ");
		String exTopping = s.nextLine();
		
		Subway menu3 = subwayBuilder.setExtraTopping(exTopping).build();
		
	}
}
