package lab9part3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

public class Quiz {
    private FlashCardReader fcr;
    private ArrayList<FlashCard> flashCards;

    Toolbox myToolbox = new Toolbox();
    int score;
    ArrayList<String> answers;

    public Quiz(String filename) {
        fcr = new FlashCardReader(filename);
        flashCards = fcr.getFlashCards();
        score = 0;
        answers = new ArrayList<String>();
        play();
    }



    public void play(){
        boolean start = determineSaveSettings();
        String answer;
        for (int i = 0; i < flashCards.size(); i++) {
            System.out.println(flashCards.get(i).getQuestion());

            answer = myToolbox.readStringFromCmd();
            if (answer.equals(flashCards.get(i).getAnswer())) {
                System.out.println("Right");
                answers.add(flashCards.get(i).getQuestion() + "," + answer + "," + "right");

                score++;
            } else {
                System.out.println("Wrong");
                System.out.println("Right answer is " + flashCards.get(i).getAnswer());
                answers.add(flashCards.get(i).getQuestion() + "," + answer + "," + "wrong");
            }
        }
        save(start);
    }

    public void save(boolean start){
        if (start) {
            PrintStream outputFile = null;
            try {
                outputFile = new PrintStream(new FileOutputStream(
                        new File("save.txt")));
            } catch (FileNotFoundException e) {

            }

            for (String s : answers) {
                outputFile.println(s);
            }

            outputFile.println(score + ",10," + (float)(score*10.0));
            outputFile.close();
        } else {}

    }

    boolean determineSaveSettings() {
        System.out.println("Would you like to save your results after completion? [Y/N]");

        String choice = myToolbox.readStringFromCmd();
        if (choice.equals("Y")) {
            return true;
        } else if (choice.equals("N")) {
            return false;
        } else {
            System.out.println("Invalid selection. Enter Y or N. Quiz will not save answers.");
            return false;
        }
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz("Questions.txt");
    }
}
