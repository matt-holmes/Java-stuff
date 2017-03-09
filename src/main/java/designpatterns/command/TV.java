package designpatterns.command;

public class TV {
	
	private boolean on;

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;		
	}
	
	public boolean getOn() {
		return on;
	}

}
