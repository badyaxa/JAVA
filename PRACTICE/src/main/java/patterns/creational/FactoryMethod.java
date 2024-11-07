package patterns.creational;

public class FactoryMethod {
    public static void main(String[] args) {
        CoffeeShop italianCoffeeShop = new ItalianCoffeeShop();
        italianCoffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);
    }
}

enum CoffeeType {
    //    ESPRESSO,
//    AMERICANO,
//    CAFFE_LATTE,
    CAPPUCCINO
}

interface Coffee {
    default void grindCoffee() {
        System.out.println("abstract class Coffee ||| Grinding coffee beans...");
    }

    void makeCoffee();

    default void pourIntoCup() {
        System.out.println("abstract class Coffee ||| Pouring into cup...");
    }
}

interface CoffeeShop {
    default Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = createCoffee(type);
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();
        System.out.println("Here's your coffee! Thank you, come again!");
        return coffee;
    }

    Coffee createCoffee(CoffeeType type);
}

interface CoffeeFactory {
    Coffee createCoffee(CoffeeType type);
}

class ItalianCoffeeShop implements CoffeeShop {
    @Override
    public Coffee createCoffee(CoffeeType type) {
        return new ItalianCoffeeFactory()
                .createCoffee(type);
    }
}

class ItalianStyleCappuccino implements Coffee {
    @Override
    public void makeCoffee() {
        System.out.println("class ItalianStyle Cappuccino ||| makeCoffee()");
    }
}

class ItalianCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee(CoffeeType type) {
        return switch (type) {
            case CAPPUCCINO -> new ItalianStyleCappuccino();
//            case AMERICANO -> new ItalianStyleAmericano();
//            case ESPRESSO -> new ItalianStyleEspresso();
//            case CAFFE_LATTE -> new ItalianStyleCaffeLatte();
        };
    }
}
