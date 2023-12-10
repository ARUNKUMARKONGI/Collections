abstract class CoffeeTemplate {
    final void makeCoffee() {
        brewCoffeeGrounds();
        boilWater();
        pourInCup();
        addCondiments();
        System.out.println("Coffee is ready!");
    }
    abstract void addCondiments();
    abstract void brewCoffeeGrounds();

    final void pourInCup() {
        System.out.println("Pouring into cup");
    }
    final void boilWater() {
        System.out.println("Boiling water");
    }
}
class Coffee extends CoffeeTemplate {
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
    void brewCoffeeGrounds() {
        System.out.println("Brewing coffee grounds");
    }
}

public class FinalMethodCoffeeExample {
    public static void main(String[] args) {
        CoffeeTemplate coffee = new Coffee();
        coffee.makeCoffee();
    }
}




//the order of method calling is fixed and wont change