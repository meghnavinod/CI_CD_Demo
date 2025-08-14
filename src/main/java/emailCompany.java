public class emailCompany {

    //Code to fine email company name from a string
    public static void main(String[] args) {
        String str = "meghnaanil98.vinod@yahoo.com";

        String[] parts = str.split("@");
        if(parts.length==2){
            String domain=parts[1];                       //@gmail.com
            String company=parts[1].split("\\.")[0]; //gmail

        System.out.println("Comapany is :"+company);

        }
        else{
            System.out.println("Invalid Email");
        }
    }
}