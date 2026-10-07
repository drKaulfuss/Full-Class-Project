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

        System.out.println("Are you interested in rescuing Darsh? (y/n)");
        boolean wantToPlay = false;
        if (input.nextLine().charAt(0) == 'y') {
            wantToPlay = true;
        } else {
            System.out.println("Then get outta here fool!");
            System.exit(0);
        }

        // Instantiate the universe
        TownHall townHall = new TownHall();
        // Add more

        while (wantToPlay && townHall.getCompleteMissions() < 5) {
            // Game loop
            System.out.println(townHall.Greeting());

            // Print the list of missions
            System.out.println(townHall.getMissions());

            System.out.println("Which mission would like to accept?");

            // since there reasonably would be a list of missions in the townHall,
            // we get the specific mission that the user wants
            // for this to work, townHall.getMissions would start each line with the index of each mission
            // like "0. Rob a bank" and townHall.getMissionLocation(0) would return that Building.
            MissionLocation place = townHall.getMissionLocation(input.nextInt());

            // Do the mission

            // Do the boss fight

            // Mark the mission as complete

            // if there are 5 complete missions, ask if the user wants to play
            System.out.println("Do you want to continue, or do you want to rescue Darsh? (y/n)");
            wantToPlay = input.nextLine().charAt(0) == 'y';
        }
    }

}