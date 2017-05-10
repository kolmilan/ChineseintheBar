package at.ac.univie.informatik.chineseinthebar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void eatOnClick(View view) {
        Intent i = new Intent(this, ChooseActivity.class);
        String sender = "eat";
        i.putExtra("sender", sender);

        startActivity(i);
    }

    public void talkOnClick(View view) {
        Intent i = new Intent(this, ChooseActivity.class);
        String sender = "talk";
        i.putExtra("sender", sender);
        startActivity(i);
    }

    public void drinkOnClick(View view) {
        Intent i = new Intent(this, ChooseActivity.class);
        String sender = "drink";
        i.putExtra("sender", sender);
        startActivity(i);
    }

    public void danceOnClick(View view) {
        Intent i = new Intent(this, ChooseActivity.class);
        String sender = "dance";
        i.putExtra("sender", sender);
        startActivity(i);
    }


}
