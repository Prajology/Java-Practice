import java.util.Scanner;

public class reverseStrings {

    public static void main(String[] args){

        String str = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String of your wish");


        ReverseMe(str);
    }

    public static void ReverseMe(String str){


        for(int i = str.length()-1;i<=str.length();i++){

            str = str + str.charAt(i);

        }

    }
}
