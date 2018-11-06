import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Please answer the following questions. When asked a yes/no question answer with only 'yes' or 'no'.");
        System.out.println("What is your age?");
        int age = Integer.parseInt(src.nextLine());

        if (age < 16) {
            System.out.println("You're not old enough to drive.");
        } else if (age <= 18) {
            System.out.println("You're not old enough to drive a car, but you could drive a scooter or learn to drive.");
            System.out.println("Please answer 'scooter' if you want to drive a scooter, or 'learn' if you want to learn to drive a car.");
            String answer = src.nextLine();
            if (answer.equals("scooter")) {
                System.out.println("Do you have a scooter license?");
                answer = src.nextLine();
                if (answer.equals("yes")) {
                    System.out.println("Congratulations. This program can no longer help you.");
                } else if (answer.equals("no")) {
                    System.out.println("This is the part where I tell you how to acquire a scooter license");
                }
            } else if (answer.equals("learn")) {
                System.out.println("This is the part where I send you to a fictional website for learning to drive cars.");
            }
        } else {
            System.out.println("you're old enough to drive a car");
            System.out.println("Do you have your driver's license?");
            String answer = src.nextLine();
            if (answer.equals("yes")) {
                System.out.println("Congratulations. This program can no longer help you.");
            } else if (answer.equals("no")) {
                System.out.println("This is the part where I send you to a fictional website for earning your license");
            }
        }

        System.out.println("Was this program helpful to you?");
        String answer = src.nextLine();
        System.out.println("Just kidding, we don't care.");
    }
}
