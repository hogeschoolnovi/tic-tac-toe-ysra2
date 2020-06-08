package novi.basics;

import static novi.basics.Main2.PLAYERINPUT;

public class Game {
    public void play(Player player1, Player player2){
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
        // token van de actieve speler opslaan
        //char activePlayerToken = player1.getToken();
        Player activePlayer = player1;
        // starten met de beurt (maximaal 9 beurten)
        for (int round = 0; round < maxRounds; round++) {
            // naam van de actieve speler opslaan
            /*String activePlayerName;
            if(activePlayerToken == player1.getToken()) {
                activePlayerName = player1Name;
            } else {
                activePlayerName = player2Name;
            }*/
            String activePlayerName = activePlayer.getName();
            // actieve speler vragen om een veld te kiezen (1 - 9)
            System.out.println(activePlayerName + ", please choose a field");
            // gekozen veld van de actieve speler opslaan
            int chosenField = PLAYERINPUT.nextInt();
            int chosenIndex = chosenField - 1;
            // als het veld bestaat
            if(chosenIndex < 9 && chosenIndex >= 0) {
                //als het veld leeg is, wanneer er geen token staat
                if(board[chosenIndex] != player1.getToken() && board[chosenIndex] != player2.getToken()) {
                    // wanneer de speler een token op het bord kan plaatsen
                    // de token van de actieve speler op het gekozen veld plaatsen
                    board[chosenIndex] = activePlayer.getToken();
                    //player.score += 10;
                    // het nieuwe speelbord tonen
                    printBoard(board);
                    // als het spel gewonnen is
                    // tonen wie er gewonnen heeft (de actieve speler)
                    // de actieve speler krijgt een punt
                    // de scores van de spelers tonen
                    // wanneer we in de laatste beurt zijn en niemand gewonnen heeft
                    // aantal keer gelijk spel ophogen
                    // aantal keer gelijk spel tonen
                    // de beurt doorgeven aan de volgende speler (van speler wisselen)
                    // als de actieve speler, speler 1 is:
                    if(activePlayer == player1) {
                        // maak de actieve speler, speler 2
                        activePlayer = player2;
                    }
                    // anders
                    else {
                        // maak de actieve speler weer speler 1
                        activePlayer = player1;
                    }
                } //of al bezet is
                else {
                    maxRounds++;
                    System.out.println("this field is not available, choose another");
                }
                //versie 2: als het veld leeg is, wanneer de waarde gelijk is aan chosenField
                /*if(board[chosenIndex] != '1' + chosenIndex) {
                    board[chosenIndex] = activePlayerToken;
                }*/
            }
            // als het veld niet bestaat
            else {
                // het mamimale aantal beurten verhogen
                maxRounds++;
                // foutmelding tonen aan de speler
                System.out.println("the chosen field does not exist, try again");
            }

            // -- terug naar het begin van de volgende beurt
        }
    }
    public void printBoard(char[] board) {
        for (int fieldIndex = 0; fieldIndex < board.length; fieldIndex++) {
            System.out.print(board[fieldIndex] + " ");
            // als we het tweede veld geprint hebben of het vijfde veld geprint hebben
            // dan gaan we naar de volgende regel
            if(fieldIndex == 2 || fieldIndex == 5) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
