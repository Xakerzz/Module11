package CardSet;

import java.util.HashSet;
import java.util.Set;

public class CardMain {
    public static void main(String[] args) {
        Card six1 = new Card("Six","Clubs");
        Card Seven1 = new Card("Seven","Clubs");
        Card Eight1 = new Card("Eight","Clubs");
        Card Nine1 = new Card("Nine","Clubs");
        Card Ten1 = new Card("Ten","Clubs");
        Card Jack1 = new Card("Jack","Clubs");
        Card Queen1 = new Card("Queen","Clubs");
        Card King1 = new Card("King","Clubs");
        Card Ace1 = new Card("Ace","Clubs");

        Card six2 = new Card("Six","Peaks");
        Card Seven2 = new Card("Seven","Peaks");
        Card Eight2 = new Card("Eight","Peaks");
        Card Nine2 = new Card("Nine","Peaks");
        Card Ten2 = new Card("Ten","Peaks");
        Card Jack2 = new Card("Jack","Peaks");
        Card Queen2 = new Card("Queen","Peaks");
        Card King2 = new Card("King","Peaks");
        Card Ace2 = new Card("Ace","Peaks");

        Card six3 = new Card("Six","Hearts");
        Card Seven3 = new Card("Seven","Hearts");
        Card Eight3 = new Card("Eight","Hearts");
        Card Nine3 = new Card("Nine","Hearts");
        Card Ten3 = new Card("Ten","Hearts");
        Card Jack3 = new Card("Jack","Hearts");
        Card Queen3 = new Card("Queen","Hearts");
        Card King3 = new Card("King","Hearts");
        Card Ace3 = new Card("Ace","Hearts");

        Card six4 = new Card("Six","Diamonds");
        Card Seven4 = new Card("Seven","Diamonds");
        Card Eight4 = new Card("Eight","Diamonds");
        Card Nine4 = new Card("Nine","Diamonds");
        Card Ten4 = new Card("Ten","Diamonds");
        Card Jack4 = new Card("Jack","Diamonds");
        Card Queen4 = new Card("Queen","Diamonds");
        Card King4 = new Card("King","Diamonds");
        Card Ace4 = new Card("Ace","Diamonds");


        Card King5 = new Card("King","Diamonds");
        Card Ace5 = new Card("Ace","Diamonds");
        Card six5 = new Card("Six","Hearts");
        Card Seven5 = new Card("Seven","Hearts");
        Card Eight5 = new Card("Eight","Peaks");
        Card Nine5 = new Card("Nine","Peaks");
        Card Jack5 = new Card("Jack","Clubs");
        Card Queen5 = new Card("Queen","Clubs");


        Set<Card> cardList = new HashSet<>();
        cardList.add(six1);
        cardList.add(Seven1);
        cardList.add(Eight1);
        cardList.add(Nine1);
        cardList.add(Ten1);
        cardList.add(Jack1);
        cardList.add(Queen1);
        cardList.add(King1);
        cardList.add(Ace1);

        cardList.add(six2);
        cardList.add(Seven2);
        cardList.add(Eight2);
        cardList.add(Nine2);
        cardList.add(Ten2);
        cardList.add(Jack2);
        cardList.add(Queen2);
        cardList.add(King2);
        cardList.add(Ace2);

        cardList.add(six3);
        cardList.add(Seven3);
        cardList.add(Eight3);
        cardList.add(Nine3);
        cardList.add(Ten3);
        cardList.add(Jack3);
        cardList.add(Queen3);
        cardList.add(King3);
        cardList.add(Ace3);

        cardList.add(six4);
        cardList.add(Seven4);
        cardList.add(Eight4);
        cardList.add(Nine4);
        cardList.add(Ten4);
        cardList.add(Jack4);
        cardList.add(Queen4);
        cardList.add(King4);
        cardList.add(Ace4);

        cardList.add(six5);
        cardList.add(Seven5);
        cardList.add(Eight5);
        cardList.add(Nine5);
        cardList.add(Jack5);
        cardList.add(Queen5);
        cardList.add(King5);
        cardList.add(Ace5);

        System.out.println(cardList.size());

        for (Card card:cardList) {
            System.out.println(card);
        }
    }
}
