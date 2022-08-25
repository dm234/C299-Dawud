import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("What is your dog's name?");
        String dogName = sc.nextLine();

        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.\n\n"+dogName+" is: \n\n");

        
        int a = random.nextInt(30) +1;
        int b = random.nextInt(20) +1;
        int c = random.nextInt(24) +1;
        int d = random.nextInt(25) +1;
        int e = 100 - a - b - c - d;
        

        System.out.println(a+"% St. Bernard");
        System.out.println(b+"% Chihuahua");
        System.out.println(c+"% Dramatic RedNosed Asian Pug");
        System.out.println(d+"% Common Cur");
        System.out.println(e+"% A Dog\n\n");
        System.out.println("Wow, thats QUITE the dog!");
        
    }
}
