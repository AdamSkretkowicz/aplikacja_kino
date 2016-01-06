package com.skretkowicz.kino;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Adam on 2016-01-06.
 */
public class Dodaj_pozycje extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dodaj_pozycje);
    }

    public void onBzapiszpozycjeClick(View v)
    {
        if(v.getId() == R.id.Bzapiszpozycje)
        {
            Intent i = new Intent(Dodaj_pozycje.this, Filmy_do_obejrzenia.class);
            startActivity(i);
        }
    }

    public void onBpowrotpozycjiClick(View v)
    {
        if(v.getId() == R.id.Bpowrotpozycji)
        {
            Intent i = new Intent(Dodaj_pozycje.this, Filmy_do_obejrzenia.class);
            startActivity(i);
        }
    }
}
