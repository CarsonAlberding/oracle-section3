public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here

        //Scenario 1
       int eggsPerChicken = 5;
       int chickenCount = 3;
       int totalEggs = eggsPerChicken * chickenCount;

       chickenCount += 1;
       totalEggs += eggsPerChicken * chickenCount;

       chickenCount = chickenCount / 2;
       totalEggs += eggsPerChicken * chickenCount;

       System.out.println(totalEggs);

       //Scenario 2
        eggsPerChicken = 4;
        chickenCount = 8;
        totalEggs = eggsPerChicken * chickenCount;

        chickenCount += 1;
        totalEggs += eggsPerChicken * chickenCount;

        chickenCount = chickenCount / 2;
        totalEggs += eggsPerChicken * chickenCount;

        System.out.println(totalEggs);

    }   
}
