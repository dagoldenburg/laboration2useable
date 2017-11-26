package com.example.micke.laboration2.Activities.Buttons;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/**
 * Created by Micke on 11/26/2017.
 */

public class LoadGameListener implements View.OnClickListener {

    private Context context;

    public LoadGameListener(Context c){
        context = c;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
    }
}
