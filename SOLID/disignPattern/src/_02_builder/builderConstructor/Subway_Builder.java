package _02_builder.builderConstructor;

public class Subway_Builder {
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean vegetable;
	private String source;
	
	// 필수 멤버 빌더의 생성자를 통해 설정
	Subway_Builder(int size, String bread, String source){
		this.size=size;
		this.bread=bread;
		this.source=source;
	}
	
	// setter 메소드 
	public Subway_Builder setSize(int size) {
		this.size = size; return this;	
	}
	public Subway_Builder setBread(String bread) {
		this.bread = bread; return this;
	}
	public Subway_Builder setCheese(String cheese) {
		this.cheese = cheese; return this;
	}
	public Subway_Builder setExtraTopping(String extraTopping) {
		this.extraTopping = extraTopping; return this;
	}
	public Subway_Builder setVegetable(boolean vegetable) {
		this.vegetable = vegetable; return this; 
	}
	public Subway_Builder withSource(String source) { // with 사용해도 됨
		this.source = source; return this;
	}
	
	// Subway의 생성자 호출 
	public Subway build() {
		return new Subway(size, bread, cheese, extraTopping, vegetable, source); // 여기서 값을 안 넣은, 즉 값이 없는것들은 여기서 null로 들어가는거야?
	} 
	 
}


