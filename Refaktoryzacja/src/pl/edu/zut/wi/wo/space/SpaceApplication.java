package pl.edu.zut.wi.wo.space;

public class SpaceApplication {

	public static void main(String[] args) {
		Space space = new Space();
		space.defaultOwner = new Person("Martin", "Fowler");
		Ship spaceShip = new Ship(space.defaultOwner);
		space.defaultOwner = new Person("Rebecca", "Parsons");
	}

}
