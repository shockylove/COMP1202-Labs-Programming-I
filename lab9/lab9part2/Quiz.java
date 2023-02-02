package lab9part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz {
    /*功能：
    * */
    private FlashCardReader fcr;
    private ArrayList<FlashCard> flashCards;
    Toolbox myToolbox = new Toolbox();

    public Quiz(String filename) {
        fcr = new FlashCardReader(filename);
        flashCards = fcr.getFlashCards();
        play();
    }

    public void play(){
        String answer;
        for (int i = 0; i < flashCards.size(); i++) {
            System.out.println(flashCards.get(i).getQuestion());

            answer = myToolbox.readStringFromCmd();
            if (answer.equals(flashCards.get(i).getAnswer())) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
                System.out.println("Right answer is " + flashCards.get(i).getAnswer());
            }
        }

    }
}
