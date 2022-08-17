import javax.swing.*;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String input = JOptionPane.showInputDialog("Type something: ");

        
        
        //Parse the input as an int.
        //Print its value +1
        int output = (Integer.parseInt(input)) + 1;
        System.out.println(output);
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        int output2 = Integer.parseInt(JOptionPane.showInputDialog("Type Something")) +1;
        
    }
}
