import java.util.Locale;

public class ReverseString {

    public static void main (String[] args){

        String s1="netsil";


        String s2=s1.toLowerCase();  //listen
        char[] str= s2.toCharArray(); //[l],[i],[s],[t],[e],[n]
         for (int i=str.length-1;i>=0;i--){
             System.out.println(str[i]);
         }
    }
}
