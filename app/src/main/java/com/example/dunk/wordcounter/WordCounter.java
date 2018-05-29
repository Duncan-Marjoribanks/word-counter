package com.example.dunk.wordcounter;


public class WordCounter {

    String[] answer;

    public WordCounter(String textPara) {
        this.answer = textPara.split(" ");
    }

    public int countWords(){
        return answer.length;
    }

}
