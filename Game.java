import java.util.Scanner;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    String winner;
    String name;
    Scanner scan = new Scanner(System.in);
    Deck gameDeck = new Deck();
    Player dealer = new Player(5000, "Dealer");
    Player playerone = new Player(5000, name);
    String response;
    public Game() {
        System.out.println("What is your name");
        name = scan.next();
        play();
        
    }
    public void play() {
        dealCards(playerone);
        dealCards(dealer);
        playerone.calculateHand();
        System.out.println(name + " would you like to hit or stay?");
        response = scan.next();
        while (response == "hit") {
            playerone.hit(gameDeck);
            playerone.calculateHand();
            System.out.println("hit or stay");
        }
        dealerTurn();
    }
    public void dealCards(Player p) {
        p.addCard(gameDeck.deal());
        p.addCard(gameDeck.deal());
    }
    public void dealerTurn() {
        while (dealer.calculateHand() < 17) {
            dealer.hit(gameDeck);
        }
        winner();
    }
    public void winner() {
        if(playerone.calculateHand() > dealer.calculateHand() && playerone.calculateHand() <= 21) {
            winner = name;
        }
        if(dealer.calculateHand() > playerone.calculateHand() && dealer.calculateHand() <= 21) {
            winner = "dealer";
        }
    }
    public String endgame() {
        return winner;
    }
    
}
