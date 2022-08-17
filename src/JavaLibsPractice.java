import javax.swing.JOptionPane;
import java.util.Scanner;

public class JavaLibsPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String input0 = sc.next();

        // He was selling
        System.out.print("Input item: ");
        String input1 = sc.next();

        //Today he sold __ of them
        System.out.print("Input number: ");
        int input2 = sc.nextInt();

        //For each item1, he makes
        System.out.print("Input number: ");
        double input3 = sc.nextDouble();

        //Today, he has made
        double calc1 = input2 * input3;

        System.out.println("Today "+input0+" was selling "+input1+"s. " +
                "Today, he sold "+input2+" of them. For each "+input1+", he makes $"+input3+". Today, he has made $"+calc1+".");


        sc.close();
     
    }   
}