public class Parsing01 {
    public static void main(String[] args) {
        //Declare and initialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "887ds8327821jdi";

        double tax = (Double.parseDouble(taxRate) * Integer.parseInt(shirtPrice));
        System.out.println(tax);
        
        
        
        //Parse shirtPrice and taxRate, and print the total tax
        
        
        
        //Try to parse taxRate as an int
        
        //Try to parse gibberish as an int
        
    }
    
}
