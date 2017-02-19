import java.util.Scanner;
public class NameTest {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        Name one = new Name();
        Name two = new Name();
        
        System.out.print("Please enter the name of person #1 (first middle last): ");
        String f = scan.next();
        String m = scan.next();
        String l = scan.next();
        
        System.out.print("Please enter the name of person #2 (first middle last): ");
        String f2 = scan.next();
        String m2 = scan.next();
        String l2 = scan.next();
        
        one.Name(f, m, l);
        two.Name (f2, m2, l2);
        
        System.out.println(one.firstMiddleLast());
        System.out.println(one.lastFirstMiddle());
        System.out.println(one.initials());
        System.out.println("Length is " + one.length());
        System.out.println();
        
        System.out.println(two.firstMiddleLast());
        System.out.println(two.lastFirstMiddle());
        System.out.println(two.initials());
        System.out.println("Length is " + two.length());
        
        if (one.equals(one.firstMiddleLast(), two.firstMiddleLast()))
            System.out.println("The names are the same!!!!");
        else
            System.out.println("The names are different :(");
        
    }
}
