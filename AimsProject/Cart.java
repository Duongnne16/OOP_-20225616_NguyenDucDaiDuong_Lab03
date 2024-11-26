public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20; 
    // init cart
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    // current number of DVDs
    private int qtyOrdered;
    // add disc to cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
    	// while cart is not full ...
        if (qtyOrdered < MAX_NUMBERS_ORDERED){
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println(disc.getTitle()+" has been added!");
        } else System.out.println("Cannot add more DVDs! The cart is almost full.");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered] = dvd;
                qtyOrdered++;
                System.out.println(dvd.getTitle() + " has been added!");
            } else {
                System.out.println("Cannot add more DVDs! The cart is almost full.");
                break;
            }
        }
    }
    
   // Nạp chồng: Thêm nhiều DVD bằng danh sách tham số tùy ý (varargs)
    public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
        for (DigitalVideoDisc dvd : dvds) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered] = dvd;
                qtyOrdered++;
                System.out.println(dvd.getTitle() + " has been added!");
            } else {
                System.out.println("Cannot add more DVDs! The cart is almost full.");
                break;
            }
        }
    }

    // Nạp chồng: Thêm hai DVD
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 2 <= MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println(dvd1.getTitle() + " and " + dvd2.getTitle() + " have been added!");
        } else {
            System.out.println("Cannot add both DVDs! The cart does not have enough space.");
        }
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
		if(itemsOrdered[0] ==  null) {
            System.out.println("[ERROR] Your cart is empty!");
            return;
        }
        for (int i = 0; i < qtyOrdered; i++){
            if (itemsOrdered[i].equals(disc)){
				// remove and rearrange
                for (int j = i; j < qtyOrdered - 1; j++) itemsOrdered[j] = itemsOrdered[j + 1];
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println(disc.getTitle()+" has been removed!");
                return;
            }
        }
        // disc not found
        System.out.println("[ERROR] No such DVD exists!");
    }
    
    // return total cost
    public float totalCost(){
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) total += itemsOrdered[i].getCost();
        return total;
    }
    
    // return cart's info
    public String cartInfo(){
    	String result = "";
        for (int i = 0; i < qtyOrdered; i++) {
            result += itemsOrdered[i].display();
            result += "\n";
        }
        return result;
    }

    public void print(){
        System.out.println("**********************CART**********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(i+1 + "." + itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + TotalCost());
        System.out.println("*************************************************");
    }

    public void searchCart(int id){
        int check = 0;
        for(int i = 0; i < qtyOrdered; i++){
            if(itemsOrdered[i].isMatch(id)){
                check = 1;
                System.out.println("Item found: " + itemsOrdered[i].toString());
                break;
            }
            if(check == 0){
                System.out.println("Item not found");
            }
        }
    }

    public void searchCart(String title){
        int check = 0;
        for(int i = 0; i < qtyOrdered; i++){
            if(itemsOrdered[i].isMatch(title)){
                check = 1;
                System.out.println("Item found: " + itemsOrdered[i].toString());
                break;
            }
            if(check == 0){
                System.out.println("Item not found");
            }
        }
    }

}
