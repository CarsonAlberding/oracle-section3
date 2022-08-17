public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
       //byte num1 = 128;

        
        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte
        short num1 = 128;
        num1 = (byte)(num1);
        System.out.println(num1);
        
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again
        byte num2 = 127;
        num2 += 1;
        System.out.println(num2);
        num2 += 1;
        System.out.println(num2);

        
        
        
    }    
}
