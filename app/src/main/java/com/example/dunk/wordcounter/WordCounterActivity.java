package com.example.dunk.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class WordCounterActivity extends AppCompatActivity {

    EditText enterSomeText;
    TextView answerText;
    Button countWords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wordcounter_main);

        enterSomeText = findViewById(R.id.enter_text);
        answerText = findViewById(R.id.answer_text);
        countWords = findViewById(R.id.count_words);
    }


    public void onCountWordsButtonClicked(View button) {
        String textPara = enterSomeText.getText().toString();

        WordCounter wordCounter = new WordCounter(textPara);
        int count = wordCounter.countWords();
        String countAsString = Integer.toString(count);

        answerText.setText(countAsString);
    }

}
