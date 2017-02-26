package designpatterns.strategy;

public class MonoFontStrategy implements FontStrategy {

	public String useFont(String text) {
		return "using a Mono font";
	}

}
