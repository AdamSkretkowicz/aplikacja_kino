package com.skretkowicz.kino;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Edycja extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edycja);
    }

    public void onBpowrotedycjiClick(View v)
    {
        if(v.getId() == R.id.Bpowrotedycji)
        {
            Intent i4 = new Intent(Edycja.this, Filmy_do_obejrzenia.class);
            startActivity(i4);
        }
    }
}
