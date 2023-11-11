import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(String.valueOf(s.charAt(0)).toUpperCase()+s.substring(1,s.length()));
        in.close();
    }
}
