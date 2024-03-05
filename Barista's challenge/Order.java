import java.util.ArrayList;
    
public class Order {
    public static void main(String[] args){
        Order order = new Order("John");
        order.addItem(new Item("Coffee", 2.50));
        order.addItem(new Item("Donut", 1.50));
        order.display();}
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order() {
        name = "Guest";
        items = new ArrayList<Item>();
    }
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    public Order(String name) {
        this.name = name;
        items = new ArrayList<Item>();
    }
    // Initializes items as an empty list.
    public Order(String name, ArrayList<Item> items) {
        this.name = name;
        this.items = items;
    }
    
    // ORDER METHODS
    
    	// Most of your code will go here, 
        public void addItem(Item item) {
            items.add(item);
        }
        public String getStatusMessage() {
            if (ready) {
                return "Your order is ready!";
            } else {
                return "Thank you for waiting. Your order will be ready soon.";
            }
        }
        public int getTotal() {
            int total = 0;
            for (Item item : items) {
                total += item.getPrice();
            }
            return total;
        }
        public void display() {
            System.out.println("Order for " + name);
            for (Item item : items) {
                System.out.println(item.getName() + " - " + item.getPrice());
            }
            System.out.println("Total: " + getTotal());
            System.out.println(getStatusMessage());
        }
    
}

