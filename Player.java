import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    int MoneyAmnt;
    ArrayList<Card> hand = new ArrayList<Card>();
    public int hitNum;
    public String playerName;
    public int handValue;
    public int bet;
    Scanner scan = new Scanner(System.in);
    public Player(int amt, String nm) {
        this.MoneyAmnt = amt;
        this.playerName = nm;
    }
    public int bet() {
        System.out.println("How much would you like to  bet?");
        bet = scan.nextInt();
        MoneyAmnt = MoneyAmnt - bet;
        System.out.println("You have " + this.MoneyAmnt + " left, your bet is " + this.bet);
        return MoneyAmnt;
    }    
    public ArrayList hit(Deck deck) {
        hand.add(deck.deal());
        return hand;
    }
    public void addCard(Card c) {
        hand.add(c);
    }
    public int calculateHand() {
        for(Card object : hand) {
            if (object.getFace() == "Ace") {
                if((handValue += 11) < 21) {
                    object.setValue(1);
                }
                else {
                    object.setValue(11);
                }
            }
            handValue += object.getValue();
        }
        return handValue;
    }
}
