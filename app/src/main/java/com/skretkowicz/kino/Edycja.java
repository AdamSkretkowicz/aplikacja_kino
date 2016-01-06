package com.skretkowicz.kino;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Adam on 2016-01-06.
 */
public class Edycja extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edycja);
    }

    public void onBpowrotedycjiClick(View v)
    {
        if(v.getId() == R.id.Bpowrotedycji)
        {
            Intent i = new Intent(Edycja.this, Filmy_do_obejrzenia.class);
            startActivity(i);
        }
    }
}
