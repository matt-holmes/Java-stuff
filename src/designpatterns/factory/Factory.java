package designpatterns.factory;

public class Factory {
		
	public class FlipFlops implements Footwear{
		public String action() {
			return "walking";
		}
	}
	
	public class Sneakers implements Footwear {
		public String action() {
			return "running";
		}
	}
	
	public class Boots implements Footwear {
		public String action() {
			return "hiking";
		}
	}
	
	public Footwear getFootWear(String mood) {
		switch(mood) {
			case "lazy":
				return new FlipFlops();
			case "energenic":
				return new Sneakers();
			case "motivated":
				return new Boots();
			default:
				return null;
		}
	}
}
