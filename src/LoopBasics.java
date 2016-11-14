/**
 * Created by Neto on 11/14/16.
 */
public class LoopBasics {

    public static void main(String[] args) {
        // While
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }
        System.out.println("---------------------");

        // Do While
        double j = 2;
        do {
            System.out.println((int) j);
            j = Math.pow(j, 2);
        } while (j < 1000000);
        System.out.println("---------------------");

        //For
        for (i = 5; i <= 15; i++) {
            System.out.println(i);
        }

        System.out.println("---------------------");
        for (j = 3; j < 1000000; j++) {
            j--;
            System.out.println((int)j);
            j = Math.pow(j, 2);
        }
    }
}
