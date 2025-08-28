package _03_Lsp;

class Cat {
	void speak() {
		System.out.println("야옹");
	}
}

class WhiteCat extends Cat{
	String color ="white";
	@Override
	void speak() {
		System.out.println("야~~옹");
	}
}

class BlackCat extends Cat{
	String color ="black";
	@Override
	void speak() {
		System.out.println("야!옹!");
	}
}

public class Lsp_Run {

	public static void main(String[] args) {
		Cat cat = new WhiteCat();
		cat.speak();
		
		cat =new BlackCat();
		cat.speak();
	}

}
