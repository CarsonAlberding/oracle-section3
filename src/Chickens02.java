public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here

        double dailyAverage = (100+121+117) / 3.0;
        double monthlyAverage = dailyAverage * 30.0;
        double monthlyProfit = monthlyAverage * 0.18;

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
