
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *Student #:991608983
 * @author Domenic Zaffino
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card c = new Card();
       Card c2 = new Card();
       String c2;
       int c3;
       c.setSuit("Spades");
       c2=(c.getSuit());
       System.out.println("Suit: "+c2);
       c.setValue(6);
       c3=(c.getValue());
       System.out.println("value: "+c3);
    }
    
}
