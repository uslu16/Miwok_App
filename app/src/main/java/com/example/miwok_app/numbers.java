package com.example.miwok_app;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import static com.example.miwok_app.R.color.*;

public class numbers extends AppCompatActivity {

    int i;
    String[] words = new String[5];
    ArrayList<String> wordsArrayList = new ArrayList<String>();

    public int getRandomColor() {
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        wordsArrayList.add("bir");
        wordsArrayList.add("iki ");
        wordsArrayList.add("uc ");
        wordsArrayList.add("dort ");
        wordsArrayList.add("bes");


        for (i = 0; i < wordsArrayList.size(); i++) {
            LinearLayout rootView = findViewById(R.id.rootviewID);
            TextView numbersTextId = new TextView(this);
            numbersTextId.setBackgroundColor(getRandomColor());
            numbersTextId.setText(wordsArrayList.get(i));
            rootView.addView(numbersTextId);
            Toast.makeText(this, "__ " + i + "__ " + wordsArrayList.get(i), Toast.LENGTH_SHORT).show();

        }

    }



   /* int i=-1;


    public void numbersClickButton(View view) {


        if (i<5){
            i +=1 ;

        } else {
            i= 0;
        }

        TextView numbersTextId = findViewById(R.id.numbersTextId);
        numbersTextId.setText( wordsArrayList.get(i));*/

}

 /*
    for (int i = 0; i < words.length; i++) {
    Log.v("NumbersActivity", "Word at index " + i + ": " + words[i]);
}


    numbersTextId.setText();

    Button numbersClickButtonID =  findViewById(R.id.numbersClickButtonID);
}
*/


