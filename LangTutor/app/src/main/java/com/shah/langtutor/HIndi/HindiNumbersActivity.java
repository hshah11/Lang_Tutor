package com.shah.langtutor.HIndi;

import com.shah.langtutor.R;
import com.shah.langtutor.Word;
import com.shah.langtutor.WordAdapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HindiNumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        //Creating an ArrayList of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("One","Ek",R.drawable.number_one));
        words.add(new Word("Two","Do",R.drawable.number_two));
        words.add(new Word("Three","Teen",R.drawable.number_three));
        words.add(new Word("Four","Chaar",R.drawable.number_four));
        words.add(new Word("Five","Panj",R.drawable.number_five));
        words.add(new Word("Six","Chhah",R.drawable.number_six));
        words.add(new Word("Seven","Saat",R.drawable.number_seven));
        words.add(new Word("Eight","Aath",R.drawable.number_eight));
        words.add(new Word("Nine","Nau",R.drawable.number_nine));
        words.add(new Word("Ten","Das",R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_numbers);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}