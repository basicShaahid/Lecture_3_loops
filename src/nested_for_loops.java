import java.util.Scanner;

public class nested_for_loops {

    public static void main(String[] args) {

        for(int j=1;j<=5;j++){
            for(int i=0;i<=5;i++){
                System.out.print("--------"+i+" * "+j+" = "+i*j+"--------");
            }
            System.out.print("\n");
        }



//        for(int i=0;i>=5;i++){
//            System.out.print(i+" * "+j+" = "+i*j);
//        }

    }
}
//0 5 10 15 20.....60

//        0*1=0 1*1=1
//        0*2=0 1*2=2