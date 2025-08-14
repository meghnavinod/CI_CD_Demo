public class ReverseEachWordInAString {

    public static void main(String [] args){
        String s="Welcome To Java";

        String reverseString="";
        String words[]=s.split(" ");
        String reverseWord="";
//         for(String w:words){
//
//             String reverseWord="";
//             for(int i=w.length()-1;i>=0;i--){
//                 reverseWord=reverseWord+w.charAt(i);
//             }
//            reverseString=reverseString+reverseWord+" ";
//         }
//         System.out.println(reverseString);
        for(String w:words) {
            StringBuilder sb =new StringBuilder(w);
            sb.reverse();
            reverseWord=reverseWord+sb.toString();


        }
        reverseString=reverseString+ reverseWord+ "";
        System.out.println(reverseString);


    }
}
