public class numberPalindrome {

    public static void main (String[] args){
         int number= 121;
         int original= number;
         int rev=0;

         while (number!=0){

             int mod= number%10; //21
             rev=rev*10+mod;
             number=number/10;
         }
         if(original==rev){
             System.out.println(rev+"  is Palindrome");
         }
        else{
            System.out.println(rev + "  Not a Palindrome");
         }


    }
}
