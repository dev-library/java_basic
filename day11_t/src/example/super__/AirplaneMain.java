package example.super__;

import example.super_.SupersonicAirplane;

public class AirplaneMain {

	public static void main(String[] args) {
		SupersonicAirplane sa1 = 
				new SupersonicAirplane("OZ109");
		
		for(int i = 0; i < 8; i++) {
			sa1.fly();
		}
		
		sa1.showStatus();
		System.out.println("----------------------");
		for(int i = 0; i < 3; i++) {
			sa1.fly();
		}
		sa1.showStatus();
	}

}
