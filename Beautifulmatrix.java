import java.util.Scanner;

public class Beautifulmatrix {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count=0;
        int a[][]=new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                a[i][j]=in.nextInt();
               if(a[i][j]==1){
                count=(int)Math.abs(i-2)+(int)Math.abs(j-2);
               }
               }
        }
    in.close();
    System.out.println(count);
}
}

