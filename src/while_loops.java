public class while_loops {

    public static void main(String[] args) {
        //print hello world ten times

        int number_count = 0;

        while (number_count < 10){
            System.out.println("Hello World");
            number_count += 1;
        }


        //write a program to show the sum of the first 10 mutiples of 4

        int number_count1 = 1;
        int outcome = 0;

        while (number_count1 < 10){

            outcome += 4 * number_count1;
            number_count1 += 1;



        }
        System.out.println( outcome );
    }
}
