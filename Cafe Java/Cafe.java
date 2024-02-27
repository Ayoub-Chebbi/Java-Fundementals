public class Cafe {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 5.2;
        double lattePrice = 6.5;
        double cappuccinoPrice = 8.9;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        
        // Your customer interaction print statements will go here
        if (!isReadyOrder1) {
            System.out.println(customer1 + pendingMessage);
        } else {
            System.out.println(customer1 + readyMessage);
        }
        
        if (!isReadyOrder2) {
            System.out.println(customer2 + pendingMessage);
        } else {
            System.out.println(customer2 + readyMessage);
        }
        
        if (!isReadyOrder3) {
            System.out.println(customer3 + pendingMessage);
        } else {
            System.out.println(customer3 + readyMessage);
        }
        
        if (!isReadyOrder4) {
            System.out.println(customer4 + pendingMessage);
        } else {
            System.out.println(customer4 + readyMessage);
        }

        // Calculating and displaying totals
        double total = 0;
        total = total + lattePrice * 2;
        System.out.println(displayTotalMessage + total);
        
        double total2 = lattePrice - dripCoffeePrice;
        System.out.println(displayTotalMessage + total2);
    }
}
