import java.util.Random;
import java.util.Scanner;

public class guessing_number {

    public static void main(String[] args) {

        Random rand = new Random();
        int secret_number = rand.nextInt(101);


        Scanner sc = new Scanner(System.in);

        System.out.println(secret_number);
        System.out.println("Enter your guess: ");

        int user_input = sc.nextInt();

        while (true) {


            if (user_input < secret_number) {

                System.out.println("The number is lower");
                user_input = sc.nextInt();

            }
            else if(user_input > secret_number) {

                System.out.println("Your number is higher");
                user_input = sc.nextInt();

            }
            else{

                System.out.println(user_input+" = "+secret_number);
                break;

            }
        }
    }
}
