package classAndObject.marker;

public class Runner {
	public static void main(String[] args) {

		Marker m1 = new Marker();
		m1.color = "Black";

		Marker m2 = new Marker();
		m2.color = "Blue";

		Marker m3 = new Marker();
		m1.color = "Red";

		m1.disp();
		m2.disp();
		m3.disp();
	}
}
