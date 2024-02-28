import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }
    
    public double getOrderTotal(double[] prices) {
        double sum2 = 0;
        for (int i = 0; i < prices.length; i++) {
            sum2 += prices[i];
        }
        return sum2;
    }
    
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + ": " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello, " + username + "!");

        int aheadOfYou = customers.size();
        System.out.println("There are " + aheadOfYou + " people in front of you");
        
        customers.add(username);
        System.out.println(customers);
    }

    public static void main(String[] args) {
    }
}
