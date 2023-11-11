import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count =0;
        while(n-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            int s=a+b+c;
            if(s >=2)
            count++;
        }
        System.out.println(count);
        in.close();
    }
}
