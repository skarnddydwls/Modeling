package _05_Isp;

class Sedan implements Car1 {

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
		System.out.println("정지");
	}
}

class FireEngine implements Car1, FireCar{

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
		System.out.println("물대포");
	}
}

class Ambulance implements AmbulanceCar{

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
	public void patientTransport() {
		System.out.println("응급처치");
	}
}

public class Car_Run {

	public static void main(String[] args) {

	}

}
