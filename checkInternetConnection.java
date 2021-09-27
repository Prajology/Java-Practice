// import libraries here at the top

import java.util.*;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

//create the class here
public class checkInternetConnection {

    //main method --- this is where the code starts
    public static void main (String args[]){
        try{
            URL url = new URL("https://www.geeksforgeeks.org/");
            URLConnection connection = url.openConnection();
            connection.connect();
            System.out.println("Connection Successful");
        }
        catch(Exception e ){
            System.out.println("Internet not connected");
        }
    }

}
