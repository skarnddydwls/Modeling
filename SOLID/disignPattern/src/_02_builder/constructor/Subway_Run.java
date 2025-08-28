package _02_builder.constructor;

public class Subway_Run {

	public static void main(String[] args) {
		Subway m1= new Subway(15,"허니오트","핫칠리");
		Subway m2= new Subway(15,"통밀","체다","허니버터");
		
		System.out.println(m1);
		System.out.println(m2);
		
		// 순서도 헷갈림
	}

}
