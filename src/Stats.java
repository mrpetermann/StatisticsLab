import java.util.Scanner;

public class Stats {
    public static void main(String[] args) {
        //Init sum to 0, min to max possible val, max to min possible val
        double sum = 0, min = Double.MAX_VALUE, max = Double.MIN_VALUE;
        //Number of entries
        int count = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter values:");
        while(in.hasNextDouble()) {
            double i = in.nextDouble();
            sum += i;
            count++;

            //Update new min and max
            min = Math.min(i, min);
            max = Math.max(i, max);
        }

        in.close();

        System.out.println("Mean: " + sum/count);
        System.out.println("Range: " + (max - min));
    }
}