package com.skretkowicz.kino;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Adam on 2016-01-06.
 */
public class Filmy_obejrzane extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filmy_obejrzane);
    }

    public void onBedycjaClick(View v)
    {
        if(v.getId() == R.id.Bedycja)
        {
            Intent i = new Intent(Filmy_obejrzane.this, Edycja.class);
            startActivity(i);
        }
    }

    public void onBdodajpozycjeClick(View v)
    {
        if(v.getId() == R.id.Bdodajpozycje)
        {
            Intent i = new Intent(Filmy_obejrzane.this, Dodaj_pozycje.class);
            startActivity(i);
        }
    }

    public void onBfilmydoobejrzeniaClick(View v)
    {
        if(v.getId() == R.id.Bfilmydoobejrzenia)
        {
            Intent i = new Intent(Filmy_obejrzane.this, Filmy_do_obejrzenia.class);
            startActivity(i);
        }
    }
}
