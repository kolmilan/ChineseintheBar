package at.ac.univie.informatik.chineseinthebar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    Button phrases;
    Button words;
    Button game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        phrases =(Button)findViewById(R.id.btnPhrases);
        words =(Button)findViewById(R.id.btnWords);
        game =(Button)findViewById(R.id.btnGame);

        phrases.setOnClickListener(this);
        words.setOnClickListener(this);
        game.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case  R.id.btnPhrases: {
                Intent i = new Intent(this, CategoryActivity.class);
                i.putExtra("mode", "phrases");
                startActivity(i);
                break;
            }
            case R.id.btnWords: {
                Intent i = new Intent(this, CategoryActivity.class);
                i.putExtra("mode", "words");
                startActivity(i);
                break;
            }
            case R.id.btnGame: {
                Intent i = new Intent(this, GameActivity.class);
                startActivity(i);
                break;
            }
        }
    }
}
