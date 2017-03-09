package designpatterns.strategy;

public class FontContext {
	
	private FontStrategy strategy;
	
	public void setFontStrategy(FontStrategy strategy) {
		this.strategy = strategy;
	}
	
	public String useAFont(String text) {
		return strategy.useFont(text);
	}

}
