package designpatterns.decorator;

public class MintIcecream extends IcecreamDecorator{

	public MintIcecream(Icecream specialIcecream) {
		super(specialIcecream);
	}
	
	public String makeIcecream() {
		return specialIcecream.makeIcecream() + addMint();
	}
	
	public String addMint() {
		return " + mint";
	}

}
