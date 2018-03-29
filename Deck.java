import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Deck 
{
    ArrayList<Card> deck = new ArrayList<Card>();
    public Deck() {
        for (int a = 0; a<4; a++) {
            for(int b = 0; b <13; b++) {
               deck.add(new Card(a, b)); 
            }
        }
    }
    public void shuffle() {
        Collections.shuffle(deck);
    }
    public Card deal() {
        return deck.remove(0);
    }
}
