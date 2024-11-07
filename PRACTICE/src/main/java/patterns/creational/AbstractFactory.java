package patterns.creational;

public class AbstractFactory {
	public static void main(String[] args) {
		HotDrinkFactory factory = new ChocolateFactoryImp();
		factory.prepare(10).consume();
		factory = new TeaFactoryImp();
		factory.prepare(5).consume();
	}
}

interface HotDrink{
	void consume();
}
class Tea implements HotDrink{
	@Override
	public void consume() {
		System.out.println("preparing tea");
	}
}
class Chocolate implements HotDrink{
	@Override
	public void consume() {
		System.out.println("preparing coffee");
	}
}


interface HotDrinkFactory{
	HotDrink prepare(int amount);
}
class ChocolateFactoryImp implements HotDrinkFactory {
	@Override
	public HotDrink prepare(int amount) {
		return new Chocolate();
	}
}
class TeaFactoryImp implements HotDrinkFactory {
	@Override
	public HotDrink prepare(int amount) {
		return new Tea();
	}
}
