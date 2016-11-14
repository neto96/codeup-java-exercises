import java.util.Scanner;

/**
 * Created by Neto on 11/14/16.
 */
public class TableOfPowers {
    public static void main(String[] args) {
        int userNum;
        String yesOrNo;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            userNum = sc.nextInt();
            for (int i = 1; i <= userNum; i++) {
                System.out.println("    Square of " + i + "           Cube of " + i + "          ");
                System.out.println("-------------------------------------------");
                System.out.println("      " + (int)(Math.pow(i, 2)) + "                     " + (int)(Math.pow(i, 3)) + "        ");

            }

            System.out.print("Do you want to enter another number? (y/n) ");
            yesOrNo = sc.next();
        } while ("y".equalsIgnoreCase(yesOrNo));
    }
}
