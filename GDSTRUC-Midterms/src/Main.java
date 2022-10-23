import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        CardStack deck = new CardStack();
        CardStack player = new CardStack();
        CardStack discarded = new CardStack();

        int min = 1;
        int max = 5;
        int deckCount = 30;
        int playerCount = 0;
        int pileCount = 0;
        int i = 1;

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

        int randX4 = (int)Math.floor(Math.random()*(max-min+1)+min);

        System.out.println("------------------------------");
        System.out.println("ROUND 1: Draw " + randX4 + " card/s");
        System.out.println();
        if (randX4 == 1) {
            player.push(deck.pop());
            playerCount++;
            deckCount--;
        }
        if (randX4 == 2) {
            for (int p = 0; p < 2; p++) {
                player.push(deck.pop());
                playerCount++;
                deckCount--;
            }
        }
        if (randX4 == 3) {
            for (int p = 0; p < 3; p++) {
                player.push(deck.pop());
                playerCount++;
                deckCount--;
            }
        }
        if (randX4 == 4) {
            for (int p = 0; p < 4; p++) {
                player.push(deck.pop());
                playerCount++;
                deckCount--;
            }
        }
        if (randX4 == 5) {
            for (int p = 0; p < 5; p++) {
                player.push(deck.pop());
                playerCount++;
                deckCount--;
            }
        }

        System.out.println("Player Hand: " + playerCount);
        player.printStack();
        System.out.println();
        System.out.println("Card Deck: " + deckCount);
        System.out.println("Discarded Pile: " + pileCount);
        System.out.println();

        System.out.print("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}

        while (!deck.isEmpty()) {
            i++;

            System.out.println("------------------------------");
            System.out.print("ROUND " + i + ": ");

            int minC = 1;
            int maxC = 3;

            int randC = (int)Math.floor(Math.random()*(maxC-minC+1)+minC);

            if (randC == 1) {

                int randX1 = (int)Math.floor(Math.random()*(max-min+1)+min);

                if (randX1 > deckCount) {
                    randX1 = deckCount;
                }

                System.out.println("Draw " + randX1 + " card/s");
                System.out.println();

                if (randX1 == 1 && deckCount >= 1) {
                    player.push(deck.pop());
                    playerCount++;
                    deckCount--;
                }
                else if (randX1 == 2 && deckCount >= 2) {
                    for (int p = 0; p < 2; p++) {
                        player.push(deck.pop());
                        playerCount++;
                        deckCount--;
                    }
                }
                else if (randX1 == 3 && deckCount >= 3) {
                    for (int p = 0; p < 3; p++) {
                        player.push(deck.pop());
                        playerCount++;
                        deckCount--;
                    }
                }
                else if (randX1 == 4 && deckCount >= 4) {
                    for (int p = 0; p < 4; p++) {
                        player.push(deck.pop());
                        playerCount++;
                        deckCount--;
                    }
                }
                else if (randX1 == 5 && deckCount >= 5) {
                    for (int p = 0; p < 5; p++) {
                        player.push(deck.pop());
                        playerCount++;
                        deckCount--;
                    }
                }
            }

            if (randC == 2 && !player.isEmpty()) {

                int randX2 = (int)Math.floor(Math.random()*(max-min+1)+min);

                if (randX2 > playerCount) {
                    randX2 = playerCount;
                }

                System.out.println("Discard " + randX2 + " card/s");
                System.out.println();

                if(randX2 == 1 && playerCount >= 1) {
                    discarded.push(player.pop());
                    playerCount--;
                    pileCount++;
                }
                else if(randX2 == 2 && playerCount >= 2) {
                    for (int d = 0; d < 2; d++){
                        discarded.push(player.pop());
                        playerCount--;
                        pileCount++;
                    }
                }
                else if(randX2 == 3 && playerCount >= 3) {
                    for (int d = 0; d < 3; d++){
                        discarded.push(player.pop());
                        playerCount--;
                        pileCount++;
                    }
                }
                else if(randX2 == 4 && playerCount >= 4) {
                    for (int d = 0; d < 4; d++){
                        discarded.push(player.pop());
                        playerCount--;
                        pileCount++;
                    }
                }
                else if(randX2 == 5 && playerCount >= 5) {
                    for (int d = 0; d < 5; d++){
                        discarded.push(player.pop());
                        playerCount--;
                        pileCount++;
                    }
                }
            }
            else if (randC == 2 && player.isEmpty()){
                System.out.println("Not enough cards to discard from player hand. Try Again");
                System.out.println();
            }

            if (randC == 3 && !discarded.isEmpty()) {

                int randX3 = (int)Math.floor(Math.random()*(max-min+1)+min);

                if (randX3 > pileCount) {
                    randX3 = pileCount;
                }

                System.out.println("Get " + randX3 + " card/s from the discarded pile");
                System.out.println();

                if (randX3 == 1 && pileCount >= 1) {
                    player.push(discarded.pop());
                    playerCount++;
                    pileCount--;
                }
                else if (randX3 == 2 && pileCount >= 2) {
                    for (int g = 0; g < 2; g++) {
                        player.push(discarded.pop());
                        playerCount++;
                        pileCount--;
                    }
                }
                else if (randX3 == 3 && pileCount >= 3) {
                    for (int g = 0; g < 3; g++) {
                        player.push(discarded.pop());
                        playerCount++;
                        pileCount--;
                    }
                }
                else if (randX3 == 4 && pileCount >= 4) {
                    for (int g = 0; g < 4; g++) {
                        player.push(discarded.pop());
                        playerCount++;
                        pileCount--;
                    }
                }
                else if (randX3 == 5 && pileCount >= 5) {
                    for (int g = 0; g < 5
                            ; g++) {
                        player.push(discarded.pop());
                        playerCount++;
                        pileCount--;
                    }
                }
            }
            else if (randC == 3 && discarded.isEmpty()){
                System.out.println("Not enough cards to get from discarded pile. Try Again");
                System.out.println();
            }

            System.out.println("Player Hand: " + playerCount);
            player.printStack();
            System.out.println();
            System.out.println("Card Deck: " + deckCount);
            System.out.println("Discarded Pile: " + pileCount);
            System.out.println();

            System.out.print("Press Enter key to continue...");
            try
            {
                System.in.read();
            }
            catch(Exception e)
            {}
        }
        if (deck.isEmpty()) {
            System.out.println("------------------------------");
            System.out.println();
            System.out.println("CARD DECK IS EMPTY!");
            System.out.println();
            System.out.println("------------------------------");
        }
    }
}