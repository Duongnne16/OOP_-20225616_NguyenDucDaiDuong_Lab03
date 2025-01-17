public class Aims{

    public static void main(String[] args) {
        // Create a new cart
		Cart anOrder = new Cart();
		
		// Create new DVD objects and add them to cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		// remove DVD
		anOrder.removeDigitalVideoDisc(dvd2);
		// remove failed
		anOrder.removeDigitalVideoDisc(dvd2);
		
		// print total cost of the items in the cart
		System.out.printf("Total cost is: %.2f\n", anOrder.totalCost());
		System.out.println(anOrder.cartInfo());
    }
}