package designpatterns.decorator;

public class ChocolateChipIcecream extends IcecreamDecorator {

	public ChocolateChipIcecream(Icecream specialIcecream) {
		super(specialIcecream);
	}
	
	public String makeIcecream() {
		return specialIcecream.makeIcecream() + addChocolateChips();
	}
	
	public String addChocolateChips() {
		return " + chocolate chip";
	}

}
