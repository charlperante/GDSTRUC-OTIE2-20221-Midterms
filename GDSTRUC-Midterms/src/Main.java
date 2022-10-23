import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        CardStack deck = new CardStack(); // Card deck
        CardStack player = new CardStack(); // Player hand
        CardStack discarded = new CardStack(); // Discarded pile

        int min = 1; // Minimum x value
        int max = 5; // Maximum x value
        int deckCount = 30; // Card deck counter
        int playerCount = 0; // Player hand counter
        int pileCount = 0; // Discarded pile counter
        int i = 1; // Round counter

        deck.push(new Cards("Phil"));       deck.push(new Cards("Claire"));         // 1, 2
        deck.push(new Cards("Luke"));       deck.push(new Cards("Haley"));          // 3, 4
        deck.push(new Cards("Alex"));       deck.push(new Cards("Jay"));            // 5, 6
        deck.push(new Cards("Gloria"));     deck.push(new Cards("Manny"));          // 7, 8
        deck.push(new Cards("Stella"));     deck.push(new Cards("Lily"));           // 9, 10
        deck.push(new Cards("Mitch"));      deck.push(new Cards("Cam"));            // 11, 12
        deck.push(new Cards("Dylan"));      deck.push(new Cards("Jonathan"));       // 13, 14
        deck.push(new Cards("Steve"));      deck.push(new Cards("Robin"));          // 15, 16
        deck.push(new Cards("Nancy"));      deck.push(new Cards("Hopper"));         // 17, 18
        deck.push(new Cards("Joyce"));      deck.push(new Cards("Murray"));         // 19, 20
        deck.push(new Cards("Billy"));      deck.push(new Cards("Erica"));          // 21, 22
        deck.push(new Cards("Brennan"));    deck.push(new Cards("Eddie"));          // 23, 24
        deck.push(new Cards("Eleven"));     deck.push(new Cards("Mike"));           // 25, 26
        deck.push(new Cards("Will"));       deck.push(new Cards("Lucas"));          // 27, 28
        deck.push(new Cards("Dustin"));     deck.push(new Cards("Max"));            // 29, 30

        int randX4 = (int)Math.floor(Math.random()*(max-min+1)+min); // Random x value

        // Round 1
        System.out.println("------------------------------");
        System.out.println("ROUND 1: Draw " + randX4 + " card/s");
        System.out.println();
        if (randX4 == 1) { // if x is equals to 1
            player.push(deck.pop());
            playerCount++;
            deckCount--;
        }
        else if (randX4 == 2) { // if x is equals to 2
            for (int p = 0; p < 2; p++) {
                player.push(deck.pop());
                playerCount++;
                deckCount--;
            }
        }
        else if (randX4 == 3) { // if x is equals to 3
            for (int p = 0; p < 3; p++) {
                player.push(deck.pop());
                playerCount++;
                deckCount--;
            }
        }
        else if (randX4 == 4) { // if x is equals to 4
            for (int p = 0; p < 4; p++) {
                player.push(deck.pop());
                playerCount++;
                deckCount--;
            }
        }
        else if (randX4 == 5) { // if x is equals to 5
            for (int p = 0; p < 5; p++) {
                player.push(deck.pop());
                playerCount++;
                deckCount--;
            }
        }

        // Console display
        System.out.println("Player Hand: " + playerCount);
        player.printStack();
        System.out.println();
        System.out.println("Card Deck: " + deckCount);
        System.out.println("Discarded Pile: " + pileCount);
        System.out.println();

        // User Input
        System.out.print("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}

        while (!deck.isEmpty()) { // Card deck stack is not empty
            i++; // Round counter

            System.out.println("------------------------------");
            System.out.print("ROUND " + i + ": ");

            int minC = 1; // Minimum c value
            int maxC = 3; // Maximum c value

            int randC = (int)Math.floor(Math.random()*(maxC-minC+1)+minC); // Random c value for randomized program

            if (randC == 1) { // Draw x cards program

                int randX1 = (int)Math.floor(Math.random()*(max-min+1)+min); // Random x value

                if (randX1 > deckCount) { // If x value is greater than number of cards in card deck
                    randX1 = deckCount; // then x value is equals to number of cards in card deck
                }

                System.out.println("Draw " + randX1 + " card/s");
                System.out.println();

                if (randX1 == 1 && deckCount >= 1) { // if x is equals to 1
                    player.push(deck.pop());
                    playerCount++;
                    deckCount--;
                }
                else if (randX1 == 2 && deckCount >= 2) { // if x is equals to 2
                    for (int p = 0; p < 2; p++) {
                        player.push(deck.pop());
                        playerCount++;
                        deckCount--;
                    }
                }
                else if (randX1 == 3 && deckCount >= 3) { // if x is equals to 3
                    for (int p = 0; p < 3; p++) {
                        player.push(deck.pop());
                        playerCount++;
                        deckCount--;
                    }
                }
                else if (randX1 == 4 && deckCount >= 4) { // if x is equals to 4
                    for (int p = 0; p < 4; p++) {
                        player.push(deck.pop());
                        playerCount++;
                        deckCount--;
                    }
                }
                else if (randX1 == 5 && deckCount >= 5) { // if x is equals to 5
                    for (int p = 0; p < 5; p++) {
                        player.push(deck.pop());
                        playerCount++;
                        deckCount--;
                    }
                }
            }

            if (randC == 2 && !player.isEmpty()) { // Discard x cards program

                int randX2 = (int)Math.floor(Math.random()*(max-min+1)+min); // Random x value

                if (randX2 > playerCount) { // If x value is greater than number of cards in player hand
                    randX2 = playerCount; // then x value is equals to number of cards in player hand
                }

                System.out.println("Discard " + randX2 + " card/s");
                System.out.println();

                if(randX2 == 1 && playerCount >= 1) { // if x is equals to 1
                    discarded.push(player.pop());
                    playerCount--;
                    pileCount++;
                }
                else if(randX2 == 2 && playerCount >= 2) { // if x is equals to 2
                    for (int d = 0; d < 2; d++){
                        discarded.push(player.pop());
                        playerCount--;
                        pileCount++;
                    }
                }
                else if(randX2 == 3 && playerCount >= 3) { // if x is equals to 3
                    for (int d = 0; d < 3; d++){
                        discarded.push(player.pop());
                        playerCount--;
                        pileCount++;
                    }
                }
                else if(randX2 == 4 && playerCount >= 4) { // if x is equals to 4
                    for (int d = 0; d < 4; d++){
                        discarded.push(player.pop());
                        playerCount--;
                        pileCount++;
                    }
                }
                else if(randX2 == 5 && playerCount >= 5) { // if x is equals to 5
                    for (int d = 0; d < 5; d++){
                        discarded.push(player.pop());
                        playerCount--;
                        pileCount++;
                    }
                }
            }
            else if (randC == 2 && player.isEmpty()){ // if there are no cards in player hand
                System.out.println("Not enough cards to discard from player hand. Try Again");
                System.out.println();
            }

            if (randC == 3 && !discarded.isEmpty()) { // Get x cards from discarded pile program

                int randX3 = (int)Math.floor(Math.random()*(max-min+1)+min); // Random x value

                if (randX3 > pileCount) { // If x value is greater than number of cards in discarded pile
                    randX3 = pileCount; // then x value is equals to number of cards in discarded pile
                }

                System.out.println("Get " + randX3 + " card/s from the discarded pile");
                System.out.println();

                if (randX3 == 1 && pileCount >= 1) { // if x is equals to 1
                    player.push(discarded.pop());
                    playerCount++;
                    pileCount--;
                }
                else if (randX3 == 2 && pileCount >= 2) { // if x is equals to 2
                    for (int g = 0; g < 2; g++) {
                        player.push(discarded.pop());
                        playerCount++;
                        pileCount--;
                    }
                }
                else if (randX3 == 3 && pileCount >= 3) { // if x is equals to 3
                    for (int g = 0; g < 3; g++) {
                        player.push(discarded.pop());
                        playerCount++;
                        pileCount--;
                    }
                }
                else if (randX3 == 4 && pileCount >= 4) { // if x is equals to 4
                    for (int g = 0; g < 4; g++) {
                        player.push(discarded.pop());
                        playerCount++;
                        pileCount--;
                    }
                }
                else if (randX3 == 5 && pileCount >= 5) { // if x is equals to 5
                    for (int g = 0; g < 5; g++) {
                        player.push(discarded.pop());
                        playerCount++;
                        pileCount--;
                    }
                }
            }
            else if (randC == 3 && discarded.isEmpty()){ // if there are no cards in discarded pile
                System.out.println("Not enough cards to get from discarded pile. Try Again");
                System.out.println();
            }

            // Display console
            System.out.println("Player Hand: " + playerCount);
            player.printStack();
            System.out.println();
            System.out.println("Card Deck: " + deckCount);
            System.out.println("Discarded Pile: " + pileCount);
            System.out.println();

            // User input
            System.out.print("Press Enter key to continue...");
            try
            {
                System.in.read();
            }
            catch(Exception e)
            {}
        }

        if (deck.isEmpty()) { // Card deck stack is empty
            System.out.println("------------------------------");
            System.out.println();
            System.out.println("CARD DECK IS EMPTY!");
            System.out.println();
            System.out.println("------------------------------");
        }
    }
}