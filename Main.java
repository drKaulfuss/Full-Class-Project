import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's yo name, fool?");
        String tempName = input.nextLine();
        System.out.println("With which socially constructed gender do you identify?");
        String tempGender = input.nextLine();
        Player playa = new Player(tempName, tempGender);
        
    }

}