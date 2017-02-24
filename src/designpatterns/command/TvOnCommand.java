package designpatterns.command;

public class TvOnCommand implements Command{
	
	TV tv;
	
	public TvOnCommand(TV tv) {
		this.tv = tv;
	}
	
	public void execute() {
		tv.turnOn();
	}

}
