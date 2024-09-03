package Sharathsir;

//OBJECT CREATIONAL CODE 

public class LightFactory {
	
	public static Switch getLight(String type) {
		
		if(type.equalsIgnoreCase("Ledlight")) {
			return new LedLight();
		}
		
		else if (type.equalsIgnoreCase("tubelight")) {
			return new Tubelight();
		}
		else {
			System.out.println("no such lights found get lost");
			return null;
		}
	}

}
