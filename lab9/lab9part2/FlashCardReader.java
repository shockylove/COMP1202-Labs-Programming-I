package lab9part2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FlashCardReader {

    BufferedReader reader;

    public FlashCardReader(String s) {
        try {
            reader = new BufferedReader(
                    new FileReader(s));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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

    public ArrayList<FlashCard> getFlashCards() {
        ArrayList<FlashCard> flashCards = new ArrayList<FlashCard>();

        while(fileIsReady()){
            // 需求：1。返回一个flashcard的集合，flashcard含有问题和答案，
            //问题和答案是来自于question文档，使用：分割
            //所以falshcard1 有问题一和答案一，
            //实现： 把第一行的文字分开，String【】 get = s。split（"："）
            //如何把string【】 get 分开为 quesion 和 answer
            // ，赋值给flashcard1，储存falshcard1到arraylist，往复至最后一行
            String[] get = getLine().split(":");
            flashCards.add(new FlashCard
                    (get[0], get[1]));
        }
        return  flashCards;
    }
}
