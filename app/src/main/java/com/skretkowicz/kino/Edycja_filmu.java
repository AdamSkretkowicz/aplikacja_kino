package com.skretkowicz.kino;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Adam on 2016-01-06.
 */
public class Edycja_filmu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edycja_filmu);
    }

    public void onBzapiszedycjeClick(View v)
    {
        if(v.getId() == R.id.Bzapiszedycje)
        {
            Intent i = new Intent(Edycja_filmu.this, Filmy_do_obejrzenia.class);
            startActivity(i);
        }
    }

    public void onBpowrotedycjifilmuClick(View v)
    {
        if(v.getId() == R.id.Bpowrotedycjifilmu)
        {
            Intent i = new Intent(Edycja_filmu.this, Edycja.class);
            startActivity(i);
        }
    }
}
