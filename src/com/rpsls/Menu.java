package com.rpsls;

import java.util.Scanner;

public class Menu {

    private Player playerOne;
    private Player playerTwo;



    public void displayRules(){

        System.out.println("Scissors cuts Paper, \n" +
                "Paper covers Rock, \n" +
                "Rock crushes Lizard\n" +
                "Lizard poisons Spock,\n" +
                "Spock smashes Scissors\n" +
                "Scissors decapitates Lizard, \n" +
                "Lizard eats Paper,\n" +
                "Paper disproves Spock, \n" +
                "Spock vaporizes Rock,\n" +
                "And as it always has, Rock crushes Scissors");

        //possible scanner object, but let's start with a string first and then have the promoter class






    }

    public void gameType(){

    }

    public void selectGameType(){
        Scanner scan = new Scanner(System.in);

        //scanner object (what type of game would you like to play)

        System.out.println("Human vs Human \n OR \n Human vs Computer");
        String gameType = scan.next();  //
    }

    public void determineWinner(Gestures gestureOne /*Gestures gestureTwo*/){

    }

    public void battle(){

        //if player one wis is less than three wins.... then what action would happen?
    }

    public void runGame(){

    }

    public void determineOverallwinner(){

    }

    public void printGesturesWinnerAction(){

    }

}