package design.decorator;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Burger burger = new ZingerBurger();
		System.out.println(burger.getDescription()+" , "+burger.getCost());
		
		burger = new ExtraCheeseBurger(burger);
		System.out.println(burger.getDescription()+" , "+burger.getCost());
		
		burger = new ExtraMayoBurger(burger);
		System.out.println(burger.getDescription()+" , "+burger.getCost());;
		
	}

}
