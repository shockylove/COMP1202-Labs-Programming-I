package lab9part1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FlashCardReader {

    BufferedReader reader;

    public FlashCardReader(String s) {
        try {
            reader = new BufferedReader(
                    new FileReader(s));
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        //    e.printStackTrace();
        }
    }

    public String getLine(){
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public boolean fileIsReady() {
        if (reader != null) {
            try {
                return reader.ready();
            } catch (IOException e) {
             //   e.printStackTrace();
            }
        }
        return false;
    }
}
