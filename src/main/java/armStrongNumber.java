public class armStrongNumber {

    public static void main(String [] args) {
        int num = 153;
        int orginalNum = num;
        int result = 0;
        int n = String.valueOf(num).length();

        while (num != 0) {

            int digits=num%10;   //3
            result+= Math.pow(digits,n);  //3^3  5 ^3 1^3 = 27+125 +1
            num=num/10; //15 1

        }

        if (result ==orginalNum )
            System.out.println(orginalNum + " is an Armstrong number.");
        else
            System.out.println(orginalNum + " is not an Armstrong number.");
    }
}
