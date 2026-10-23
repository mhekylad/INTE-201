public class classifier {

    public static void main(String[] args) {
        // Test 1
        int score = 69;
        System.out.println("Score: " + score);
        if (score >= 60) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
 
        // Test 2 (changed value)
        score = 36;
        System.out.println("Score: " + score);
        if (score >= 60) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
    }
}
____________________________________________________________________________________________

public class discount {
    public static void main(String[] args) {
        double amount = 666.0;
 
        int discount;
        String tier;
 
        // Biggest amount first so every tier can be reached
        if (amount >= 900) {
            discount = 15;
            tier = "Platinum";
        } else if (amount >= 600) {
            discount = 10;
            tier = "Gold";
        } else if (amount >= 300) {
            discount = 5;
            tier = "Silver";
        } else {
            discount = 0;
            tier = "Basic";
        }
 
        double price = amount - (amount * discount / 100);
 
        System.out.printf("Purchase amount : %.2f%n", amount);
        System.out.println("Discount tier   : " + tier + " (" + discount + "%)");
        System.out.printf("Final price     : %.2f%n", price);
    }
}
____________________________________________________________________________________________

public class validator {
    static final String USERNAME = "user36";
    static final String PASSWORD = "pass69";
 
    // Each stage is only checked if the one before it passed
    static void login(String user, String pass, boolean locked) {
        if (user.equals(USERNAME)) {
            if (pass.equals(PASSWORD)) {
                if (!locked) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Failed: account is locked.");
                }
            } else {
                System.out.println("Failed: wrong password.");
            }
        } else {
            System.out.println("Failed: username not found.");
        }
    }
 
    public static void main(String[] args) {
        // All correct
        login("user36", "pass69", false);
 
        // Wrong username
        login("user99", "pass69", false);
 
        // Wrong password
        login("user36", "pass33", false);
 
        // Locked account
        login("user36", "pass69", true);
    }
}
____________________________________________________________________________________________

public class authorizer {
    public static void main(String[] args) {
        // Saved account info
        String name = "user36";
        int pin = 3639;
        double balance = 6900.0;
 
        // What the customer typed in
        String user = "user36";
        int code = 3639;
        double amount = 666.0;
 
        boolean approved = false;
        String reason = "";
        String tier = "";
        double percent = 0;
        double limit = 0;
        double fee = 0;
        double total = 0;
 
        // Check username, then PIN, before anything else
        if (user.equals(name)) {
            if (code == pin) {
 
                // Tier from balance
                if (balance >= 9000) {
                    tier = "Platinum";
                } else if (balance >= 6000) {
                    tier = "Gold";
                } else if (balance >= 3000) {
                    tier = "Silver";
                } else {
                    tier = "Bronze";
                }
 
                // Fee and daily limit by tier
                switch (tier) {
                    case "Platinum":
                        percent = 0;
                        limit = 3000;
                        break;
                    case "Gold":
                        percent = 3;
                        limit = 900;
                        break;
                    case "Silver":
                        percent = 6;
                        limit = 600;
                        break;
                    case "Bronze":
                        percent = 9;
                        limit = 300;
                        break;
                }
 
                fee = amount * percent / 100;
                total = amount + fee;
 
                // Check daily limit, then balance
                if (amount <= limit) {
                    if (total <= balance) {
                        approved = true;
                    } else {
                        reason = "Not enough balance to cover the withdrawal and fee.";
                    }
                } else {
                    reason = "Amount is over the daily limit for " + tier + " accounts.";
                }
 
            } else {
                reason = "Incorrect PIN.";
            }
        } else {
            reason = "Username not found.";
        }
 
        // Final decision
        if (approved) {
            System.out.println("APPROVED");
            System.out.println("Tier         : " + tier);
            System.out.println("Withdrawal   : " + amount);
            System.out.printf("Fee (%.0f%%)     : %.2f%n", percent, fee);
            System.out.printf("Total charge : %.2f%n", total);
        } else {
            System.out.println("DENIED");
            System.out.println("Reason: " + reason);
        }
    }
}
