public class specharCharInstringDemo



{
    //Q:Code for counting number of special characters in a string

    public static void main(String[] args){
        String str="Meghna%$#";

        int count=0;
        for(char ch: str.toCharArray()){
            if(!Character.isLetterOrDigit(ch)&&!Character.isWhitespace(ch)){
                count++;
            }

        }
        System.out.println("Number of special Charaters in String is :"+count);

    }





}
