public class charOccurencce {

    public static void main(String[] args){
         String str="Java is a Programming Language";

         int count=str.length();
         System.out.println(("Count before removing a :"+count));
         String str2=str.replace("a","");
         int newcount=str2.length();
        System.out.println(("Count after removing a :"+newcount));
         int charOcuurence=count-newcount;
         System.out.println("Character Occurance of a is : "+charOcuurence);
    }
}
