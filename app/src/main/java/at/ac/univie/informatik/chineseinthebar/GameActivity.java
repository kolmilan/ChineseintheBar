package at.ac.univie.informatik.chineseinthebar;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import java.util.concurrent.TimeUnit;

public class GameActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        AlertDialog.Builder instBuilder = new AlertDialog.Builder(GameActivity.this);
        instBuilder.setMessage("Try pronouncing the phrase on the screen.\n" +
                "You have three tries.\n" +
                "If you fail three times, you have to drink.");
        instBuilder.setCancelable(false);
        instBuilder.setPositiveButton("Got it", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog instructions = instBuilder.create();
        instructions.setTitle("Instructions");
        instructions.show();

        
    }



    // creates instruction dialog on startup
    /* public void checkFirstRun() {
        boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE).getBoolean("isFirstRun", true);
        if (isFirstRun){ */


            // set to always true for testing purposes
            /* getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit().putBoolean("isFirstRun", true)
                    .apply();
        }
    }*/
}
