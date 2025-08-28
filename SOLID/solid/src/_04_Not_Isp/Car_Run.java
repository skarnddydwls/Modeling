package _04_Not_Isp;

class Sedan implements Car{

	@Override
	public void drive() {
		System.out.println("운전");
	}

	@Override
	public void turnLeft() {
		System.out.println("좌회전");
	}

	@Override
	public void turnRight() {
		System.out.println("우회전");
	}

	@Override
	public void stop() {
		System.out.println("멈춤");
	}

	@Override
	public void water() {
		
	}

	@Override
	public void patientTransport() {
		
	}

	@Override
	public void siren() {
		
	}
}

class FireEngine implements Car{

	@Override
	public void drive() {
		System.out.println("운전");
	}

	@Override
	public void turnLeft() {
		System.out.println("좌회전");
	}

	@Override
	public void turnRight() {
		System.out.println("우회전");
	}

	@Override
	public void stop() {
		System.out.println("멈춤");
	}

	@Override
	public void water() {
		System.out.println("물");
	}

	@Override
	public void patientTransport() {

	}

	@Override
	public void siren() {
		System.out.println("삐뽀삐뽀");
	}
}

class Ambulance implements Car{

	@Override
	public void drive() {
		System.out.println("운전");
	}

	@Override
	public void turnLeft() {
		System.out.println("좌회전");
	}

	@Override
	public void turnRight() {
		System.out.println("우회전");
	}

	@Override
	public void stop() {
		System.out.println("멈춤");
	}

	@Override
	public void water() {

	}

	@Override
	public void patientTransport() {
		System.out.println("응급조치");
	}

	@Override
	public void siren() {
		System.out.println("삐뽀삐뽀");
	}
}

public class Car_Run {

	public static void main(String[] args) {

	}

}
