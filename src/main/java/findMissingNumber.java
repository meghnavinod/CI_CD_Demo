public class findMissingNumber {
    public static void main(String[] args) {

        int a[] = {1, 2, 4, 5, 6};

        int sum1 = 0;
        int sum2 = 0;
        int misnum=0;
        for (int i = 0; i < a.length; i++) {
            sum1 = sum1 + a[i];
        }

        System.out.println("Sum of the numbers in the array is : " + sum1);

        for (int j = 1; j <= 6; j++) {
            sum2=sum2+j;
        }
        System.out.println("Sum of range is : "+ sum2);
        misnum=sum2-sum1;
        System.out.println("Missing Number is: "+misnum);
    }

}
