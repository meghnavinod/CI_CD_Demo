public class findMinMax  {

    public static void main(String[]args) {
        int a[] = {50, 90, 80, 100, 40};

        int max=a[0];
        int min=a[0];

        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Maximum value in the array is :"+max);
        System.out.println("Minimum value in the array is :"+min);


    }



}
