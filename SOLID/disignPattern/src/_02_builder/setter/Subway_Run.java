package _02_builder.setter;

public class Subway_Run {

	public static void main(String[] args) {
		Subway menu1= new Subway();
		menu1.setSize(15);
		menu1.setBread("허니오트");
		menu1.setCheese("모짜렐라");
		menu1.setExtraTopping("아보카도");
		menu1.setVegetable(true);
		menu1.setSource("핫칠리");
		System.out.println(menu1);
		
		Subway m2 = new Subway();
		m2.setSize(30);
		m2.setCheese("체다");
		m2.setExtraTopping("베이컨");
		m2.setVegetable(false);
		System.out.println(m2);
	}
}
