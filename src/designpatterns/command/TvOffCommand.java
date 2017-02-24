package designpatterns.command;

public class TvOffCommand implements Command{
	
	TV tv;
	
	public TvOffCommand(TV tv) {
		this.tv = tv;
	}
	
	public void execute() {
		tv.turnOff();
	}

}
