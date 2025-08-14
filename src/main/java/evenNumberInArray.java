public class evenNumberInArray {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 6, 8,7,9};

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {

                System.out.println("Even number in Arrays are: " + a[i]);
            }


        }
        System.out.println("---------------------------------------------");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {

                System.out.println("Odd number in Arrays are: " + a[i]);
            }


        }


    }
}

