import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String welcome = "Lovely to see you.";
        String output = name + " " + welcome;
        return output;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "it is Currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
    String returnStatement = "";
    int alexisIndex = conversation.indexOf("Alexis");
    int alfredIndex = conversation.indexOf("Alfred");

    if (alexisIndex != -1) {
        returnStatement += "Right away, sir. She certainly isn't sophisticated enough for that.";
    } else if (alfredIndex != -1) {
        returnStatement += "At your service. As you wish, naturally.";
    } else {
        returnStatement += "Right. And with that I shall retire.";
    }

    return returnStatement;
}
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

