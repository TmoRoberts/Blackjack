
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    public int value;
    public String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
    public String suit;
    public String[] faces = {"King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2", "Ace"};
    public String face;
    public Card(int fc, int st) {
       suit = suits[st];
       face = faces[fc];
       if (face == "Jack" || face =="Queen" || face=="King") {
           value = 10;
        }
       if (face == "Ace") {
           value = 11;
        }
       else {
           value = Integer.parseInt(face);
       }
    }
    public int getValue() {
        return this.value;
    }
    public String getSuit() {
        return this.suit;
    }
    public String getFace() {
        return this.face;
    }
    public String toString() {
        return ("Suit: " + getSuit() + "\t" + "Value: " + getValue());
    }
    public int setValue(int s) {
        return this.value = s;
    }
}
