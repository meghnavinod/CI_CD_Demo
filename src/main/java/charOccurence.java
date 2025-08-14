import java.util.Scanner;
// Count of word occurence in a string
public class charOccurence {

    public static void main(String[] args) {
        System.out.println("Enter String");

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine(); //Welcome to java

        int count = 1;
        for (int i = 0; i <s1.length()-1; i++) {
            if ((s1.charAt(i) == ' ') && (s1.charAt(i + 1) != ' ')) {
                count++;
            }

        }
        System.out.println("Count of word Occurance in String is : " + count);
    }




    }

