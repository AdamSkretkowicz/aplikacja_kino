package com.skretkowicz.kino;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Filmy_do_obejrzenia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filmy_do_obejrzenia);
    }

    public void onBedycjaClick(View v)
    {
        if(v.getId() == R.id.Bedycja)
        {
            Intent i1 = new Intent(Filmy_do_obejrzenia.this, Edycja.class);
            startActivity(i1);
        }
    }

    public void onBdodajpozycjeClick(View v)
    {
        if(v.getId() == R.id.Bdodajpozycje)
        {
            Intent i2 = new Intent(Filmy_do_obejrzenia.this, Dodaj_pozycje.class);
            startActivity(i2);
        }
    }

    public void onBfilmyobejrzaneClick(View v)
    {
        if(v.getId() == R.id.Bfilmyobejrzane)
        {
            Intent i3 = new Intent(Filmy_do_obejrzenia.this, Filmy_obejrzane.class);
            startActivity(i3);
        }
    }
}
