package area;
import java.util.*;
public class Area{
    public static void main(String[] args){
        while (true) {
            Scanner kb = new Scanner (System.in);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-\n\n1. Square\n2. Rectangle\n3. Triangle\n4. Circle\nEnter other key to exit\nEnter choice: ");
            String x = kb.nextLine();
            if ("1".equals(x)){
                System.out.println("Side length: ");
                int n=Integer.parseInt(kb.nextLine());
                System.out.println("Area: "+n*n);
            } else if ("2".equals(x)) {
                System.out.println("Side length 1: ");
                int n=Integer.parseInt(kb.nextLine());
                System.out.println("Side length 2: ");
                int n2=Integer.parseInt(kb.nextLine());
                System.out.println("Area: "+n*n2);
            } else if ("3".equals(x)) {
                System.out.println("Side length 1: ");
                int n = Integer.parseInt(kb.nextLine());
                System.out.println("Side length 2: ");
                int n2=Integer.parseInt(kb.nextLine());
                System.out.println("Area: "+0.5*n*n2);
            } else if ("4".equals(x)) {
                System.out.println("Radius: ");
                int n=Integer.parseInt(kb.nextLine());
                System.out.println("Area: "+3.14*n*n);
            }else{
                break;
            }
        }
    }
}
