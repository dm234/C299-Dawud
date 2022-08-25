import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age: ");
        int age = sc.nextInt();
        int max = 220 - age;
        int lowerTarget = Math.round(0.5f * max);
        int higherTarget = Math.round(0.85f * max);

        System.out.println("Your maximum heart rate should be "+max+" beats per minute");
        System.out.println("Your target HR Zone is "+lowerTarget+" - "+higherTarget+" beats per minute");
    }
}
