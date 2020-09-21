import java.util.Scanner;

public class do_while {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int number1;

        do{
            System.out.println("enter the number: ");
            number1 = sc.nextInt();

        }while (!(number1 % 4 == 0));



    }
}
