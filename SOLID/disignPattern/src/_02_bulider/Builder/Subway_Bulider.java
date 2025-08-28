package _02_bulider.Builder;

public class Subway_Bulider {
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean vegetable;
	private String source;
	
	/*
	 * 1. 멤버에 대한 setter 메소드
	 * 
	 *  메서드 저장하는 방법
	 *   - 일반 속성명과 동일하게 사용 가능
	 *   - with 키워드: 일반 setter 메소드와 차별화를 위해 with라는 키워드 사용
	 *   - 반환형은 클래스를 반환
	 */
	
	public Subway_Bulider setSize(int size) {
		this.size = size; return this;	
	}
	public Subway_Bulider setBread(String bread) {
		this.bread = bread; return this;
	}
	public Subway_Bulider setCheese(String cheese) {
		this.cheese = cheese; return this;
	}
	public Subway_Bulider setExtraTopping(String extraTopping) {
		this.extraTopping = extraTopping; return this;
	}
	public Subway_Bulider setVegetable(boolean vegetable) {
		this.vegetable = vegetable; return this; 
	}
	public Subway_Bulider withSource(String source) { // with 사용해도 됨
		this.source = source; return this;
	}
	
	// 2. Subway의 생성자 호출 
	public Subway build() {
		return new Subway(size,bread,cheese,extraTopping,vegetable,source);
	}
	 
}


