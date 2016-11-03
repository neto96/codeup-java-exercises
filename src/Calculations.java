import java.util.Objects;
import java.util.Scanner;

public class Calculations
{
    public static void main(String[] bananas)
    {
        Integer length;
        Integer width;
        Integer area;
        Integer perimeter;
        String yesOrNo;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter length of classroom (in feet): ");
            length = sc.nextInt();
            System.out.print("Enter width of classroom (in feet): ");
            width = sc.nextInt();
            area = length * width;
            perimeter = (length * 2) + (width * 2);
            System.out.println("The area for this measurements is: " + area + " sq.ft. and the perimeter is: " + perimeter + " sq.ft.");
            System.out.print("Do you want to measure another room? (y/n) ");
            yesOrNo = sc.next();
        } while ("y".equalsIgnoreCase(yesOrNo));
    }
}
