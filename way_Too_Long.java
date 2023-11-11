import java.util.*;
/**
 * way_Too_Long
 */
public class way_Too_Long {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        while(n-->0){
            String s=in.nextLine();
            if(s.length()>10){
                System.out.print(s.charAt(0));
                System.out.print(s.length()-2);
                System.out.print(s.charAt(s.length()-1));
                System.out.println();
            }
            else 
            System.out.println(s);
        }
        in.close();
    }
    }
