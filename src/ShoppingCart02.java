public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 12.56;
        double tax = 0.063;
        int quantity = 4;
        
        
        // Declare and assign a calculated totalPrice
        double totalPrice = (price * tax + price) * quantity;
        
        // Modify message to include quantity 
        
        System.out.println(message);
        System.out.println("Total Price with tax is: "+totalPrice);
        
        // Print another message with the total cost
        
    }    
}
