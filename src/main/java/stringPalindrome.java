public class stringPalindrome {

    public static void main (String[] args) {
        String s1 = "malayalam";


        String s2 = s1.toLowerCase();
        String reversed =new StringBuilder(s1).reverse().toString();
        if(s1.equals(reversed)){
            System.out.println( reversed+ "Palindrome");

        }
        else {
            System.out.println("Not Palindrome");
        }


    }
}
