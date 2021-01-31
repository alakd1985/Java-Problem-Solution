package call;

class ClassComposition {
	public static void main(String arg[]) {
		Room hall = new Room("Hall"); // LINE A
		hall.area = 200.0;
		hall.paintColor = "Voilet";
		hall.flooring = "Marble";

		hall.ceilingFan = new Fan("Bajaj"); // LINE B
		hall.ceilingFan.speed = 500; // LINE B1
		hall.ceilingFan.numberOfSpeeds = 5;

		hall.tube = new Light("Hall tube light"); // LINE C
		hall.tube.color = "White";
		hall.tube.watts = 40;
		hall.tube.tube = true; // LINE C1

		Light bl = new Light("green bed light"); // LINE D
		hall.bedLight = bl;
		hall.bedLight.color = "green";
		hall.bedLight.watts = 50;
		hall.bedLight.tube = false;

		System.out.println("Hall fan speed : " + hall.ceilingFan.speed);
		System.out.println("Bed Light color : " + hall.bedLight.color);
	}
}
