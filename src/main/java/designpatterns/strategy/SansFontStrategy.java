package designpatterns.strategy;

public class SansFontStrategy implements FontStrategy{

	public String useFont(String text) {
		return "using a Sans font";
	}

}
