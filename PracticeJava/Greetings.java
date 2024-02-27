public class Greetings {
    
    public static void main(String[] args) {
        
    	// To use the greetings methods
    	// create a variable of type Greetings
    
    	Practice practiceApp = new Practice();
 
    	// Use the variable to access Greetings methods
    	// using dot notation.
    
        String dateMessage = practiceApp.getCurrentDate();
        System.out.println(dateMessage);
    }
}

