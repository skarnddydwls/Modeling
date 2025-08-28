package _02_bulider.Builder;

public class SubwayRun {
	public static void main(String[] args) {
		// Method Chaining 방법: 자기 자신을 반환하면서 다른 함수를 지속적으로 호출하는 릴레이 방식의 프로그래밍 패턴
		Subway menu1 = new Subway_Bulider()
				.setBread("통밀빵")
				.setSize(15)
				.setCheese("체다치즈")
				.build();
		
		System.out.println(menu1);
		
		Subway menu2 = new Subway_Bulider()
				.setBread("통깨빵")
				.setSize(30)
				.setVegetable(true)
				.setExtraTopping("올리브").build();
		
		System.out.println(menu2);
	}

}
