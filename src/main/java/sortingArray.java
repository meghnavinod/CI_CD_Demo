import java.util.HashSet;

public class sortingArray {

    public static void main(String[] args){

        String arr[]= {"Java","C","C++","Python","Java"};
        /*boolean flag=false;
        for (int i=0;i<arr.length;i++){

            for (int j=i+1;j<arr.length;j++){

                if (arr[i]==arr[j])
                {
                    System.out.println("Duplicate Element Found "+arr[i]);
                    flag=true;
                }
            }
        }
        if(flag==false){
        System.out.println("No Duplicate Value Found");
    }*/
        boolean flag=false;
        HashSet<String> langs= new HashSet<>();
        for(String l : arr){
            if(langs.add(l)==false){
                System.out.println("Found Duplicate");
                flag=true;
            }
        }
        if (flag==false){
            System.out.println("Couldnt Find Duplicate");
        }
    }


}
