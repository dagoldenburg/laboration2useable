package com.example.micke.laboration2.Activities.Buttons;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/**
 * Created by Micke on 11/26/2017.
 */

public class NewGameListener implements View.OnClickListener {

    private Context context;

    public NewGameListener(Context c){
        context = c;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        context.startActivity(intent);
    }
}
