package swingy.view;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class ConsoleView {

    private Scanner sc = new Scanner(System.in);

    private File file = new File("hero_name.txt");
    private BufferedWriter out = new BufferedWriter(new FileWriter(file));

    public ConsoleView() throws IOException {

    }

    public void firstMenu() throws IOException{
        System.out.println("__________________________________________________________________");
        System.out.println(".' ____ \\|_  _|    |_  _||_   _||_   \\|_   _|.' ___  ||_  _||_  _| ");
        System.out.println("| (___ \\_| \\ \\  /\\  / /    | |    |   \\ | | / .'   \\_|  \\ \\  / /   ");
        System.out.println(" _.____`.   \\ \\/  \\/ /     | |    | |\\ \\| | | |   ____   \\ \\/ /    ");
        System.out.println("| \\____) |   \\  /\\  /     _| |_  _| |_\\   |_\\ `.___]  |  _|  |_    ");
        System.out.println(" \\______.'    \\/  \\/     |_____||_____|\\____|`._____.'  |______|   ");
        System.out.println("__________________________________________________________________");
        System.out.println("\nSelect using the allocated number for:");
        System.out.println("1. Start Game");
        System.out.println("2. Quit Game");

        String selection = sc.nextLine();

        switch (selection) {
            case "1":
                createHero();
            case "2":
                System.out.println("\nEnd of game Goodbye.");
                break;
            default:
                System.out.println("INVALID SELECTION - ONLY '1' OR '2'");
                firstMenu();
        }
    }


    public void createHero() {

        System.out.println("Enter Hero Name: ");
        String hero_name = null;

            while ((hero_name == null) || (hero_name.trim().isEmpty())) {
                hero_name = sc.nextLine();
            }
//            System.out.println("You entered " + hero_name);

            System.out.println("What class is your hero?");
            String heroClass = sc.nextLine();
        System.out.println("<---------------------------------------->");
        Random stats = new Random();
        System.out.println("STATS CREATED FOR:");
        System.out.println("HERO NAME: '" + hero_name + "'\nCLASS NAME: '" + heroClass + "' ");
        System.out.println("--------------------------");
        int Attack = stats.nextInt(1500) + 300;
        System.out.println(" starting attack is: " + Attack);
        int Block = stats.nextInt(900) + 100;
        System.out.println(" starting block is: " + Block);
        int Health = stats.nextInt(1000) + 500;
        System.out.println(" starting health is: " + Health);
        int HitPoints = stats.nextInt(172) + 500;
        System.out.println(" starting hit-points is: " + HitPoints);
        int level = stats.nextInt(1) + 1;
        System.out.println(" starting level is: " + level);
        System.out.println("<---------------------------------------->");

    }


}