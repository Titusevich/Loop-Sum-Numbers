package app;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 6; i++) {
            count++;
            sum += i;
            System.out.println(count + ") Num is " + i + ", sum is " + sum);
        }
        System.out.println("----------------------" + "\nSum of numbers is " + sum);
    }
}
