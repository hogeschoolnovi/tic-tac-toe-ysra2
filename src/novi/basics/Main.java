/*package novi.basics;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // -- vanaf hier gaan we het spel opnieuw spelen met andere spelers (nadat op het eind  keuze 2 gekozen is)
        Scanner playerInput = new Scanner(System.in);

        // de 1e speler om zijn naam vragen
        Scanner player1 = new Scanner(System.in);
        System.out.println("Player 1, please enter your name: ");
        // de naam van de 1e speler opslaan
        String namePlayer1 = playerInput.nextLine();
        System.out.println(namePlayer1);

        // de 2e speler om zijn naam vragen
        Scanner player2 = new Scanner(System.in);
        System.out.println("Player 2, please enter your name: ");
        // de naam van de 2e speler opslaan
        String namePlayer2 = playerInput.nextLine();
        System.out.println(namePlayer2);

        // token van speler 1 opslaan
        // token van speler 2 opslaan
        char player1Token = 'X';
        char player2Token = 'O';

        // score van speler 1 opslaan
        // score van speler 2 opslaan
        int scorePlayer1 = 0;
        int scorePlayer2 = 0;

        // opslaan hoeveel keer er gelijk spel is geweest
        int drawCount = 0;
        // -- vanaf hier gaan we het spel opnieuw spelen met dezelfde spelers (nadat op het eind keuze 1 gekozen is)

        // speelbord opslaan (1 - 9)
        // uitleg: omdat we altijd met een bord starten met 9 getallen, kunnen we het Tic Tac Toe bord ook direct een waarde geven
        // zie demo project code voor de andere manier met de for loop
        char[] board = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

        // maximale aantal rondes opslaan
        int maxRounds = board.length;

        // speelbord tonen
        printBoard(board);

        // array printboard

        // token van de actieve speler opslaan
        char activePlayerToken = 'X';

        // starten met de beurt (maximaal 9 beurten)
        for (int round = 0; round < maxRounds; round++) {


            // naam van de actieve speler opslaan
            String activePlayerName;
            if (activePlayerToken == player1Token) {
                activePlayerName = namePlayer1;
            } else {
                activePlayerName = namePlayer2;
            }


            // actieve speler vragen om een veld te kiezen (1 - 9)
            System.out.println(activePlayerName + ", Please choose a field: ");

            // gekozen veld van de actieve speler opslaan
            int chosenField = playerInput.nextInt();
            int chosenIndex = chosenField - 1;


            // als het veld bestaat en het veld is leeg:
            if (chosenIndex < 9 && chosenIndex >= 0) {
                //Wanneer de speler een Token op het board gesplaats heeft

                // als het veld leeg is, wanneer er geen Token staat
                if (board[chosenIndex] != player1Token && board[chosenIndex] != player2Token) {
                    // de token van de actieve speler op het gekozen veld plaatsen
                    board[chosenIndex] = activePlayerToken;
                    // het nieuwe speelbord tonen
                    printBoard(board);


                    // de beurt doorgeven aan de volgende speler (van speler wisselen)
                    // als active speler 1 is:
                    if (activePlayerToken == player1Token) {
                        //maak de acieve speler, speler 2
                        activePlayerToken = player2Token;
                    }
                    //anders
                    else {
                        // maak de actieve speler, speler 1
                        activePlayerToken = player1Token;
                    }
                } else {
                    //Als het veld bezet is
                    maxRounds++;
                    System.out.println("This chosen field does not exist,  choose another");
                }
            }
            // als het veld niet bestaat of al bezet is
            else {
                // het mamimale aantal beurten verhogen
                maxRounds++;
                // foutmelding tonen aan de speler
                System.out.println("The chosen field does not exist, try again");
            }

            // als het spel gewonnen is

            // tonen wie er gewonnen heeft (de actieve speler)

            // de actieve speler krijgt een punt
            // de scores van de spelers tonen

            // wanneer we in de laatste beurt zijn en niemand gewonnen heeft
            // aantal keer gelijk spel ophogen
            // aantal keer gelijk spel tonen

            // -- terug naar het begin van de volgende beurt
        }

        // vragen of de spelers nog een keer willen spelen

        //1: nog een keer spelen
        // return
        //2: van spelers wisselen
        //return
        //3: afsluiten
        //break

        // speler keuze opslaan

        // bij keuze 1: terug naar het maken van het bord
        // bij keuze 2: terug naar de start van de applicatie en het vragen van spelernamen
        // bij keuze 3: het spel en de applicatie helemaal afsluiten
    }

    public static void printBoard(char[] board) {
        for (int fieldIndex = 0; fieldIndex < board.length; fieldIndex++) {
            System.out.print(board[fieldIndex] + " ");
            // als we het tweede veld geprint hebben of het vijfde veld geprint hebben
            // dan gaan we alleen naar de volgende regel
            if (fieldIndex == 2 || fieldIndex == 5) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void loadFile(String fileName, ArrayList<String> playerNames, ArrayList<Integer> playerScores) {
        File scoresFile = new File(fileName);
        if (!scoresFile.exists()) {

        }


    }
} */



