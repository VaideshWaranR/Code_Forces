import java.util.*;
public class StringTask {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    str=str.toLowerCase();
    String res="";
    for(int i=0;i<str.length();i++){
       if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='y'|| str.charAt(i)=='o' || str.charAt(i)=='i' || str.charAt(i)=='u'){
        // if(i==str.length()-1){
        //     str.charAt(i)
        // }
        continue;
        }
        else{
            res=res.concat(".").concat(String.valueOf(str.charAt(i)));
        }
    }
    System.out.println(res);
}
    
}