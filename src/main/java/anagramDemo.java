import java.util.Arrays;

public class anagramDemo {

    public static void main(String[] args) {


        String str1 = "ABC DE";
        String str2 = "BCDE A";
      if (areAnagrams(str1,str2)){
          System.out.print("The string are anagrams");
        }
      else{
            System.out.print("The string are not anagrams");
        }

    }

    public static boolean areAnagrams(String s1, String s2) {

        s1.replaceAll("\\s +", "").toLowerCase();
        s2.replaceAll("\\s +", "").toLowerCase();




        //Compare the length
        char[] arr1;
        char[] arr2;
        if (s1.length() != s2.length()) {
            System.out.println("The Strings are not anagrams as length do not match");
            return false;

        } else {
            arr1 = s1.toCharArray();
            arr2 = s2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);
        }

        return Arrays.equals(arr1, arr2);
    }
}