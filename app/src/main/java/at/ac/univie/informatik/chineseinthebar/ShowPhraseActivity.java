package at.ac.univie.informatik.chineseinthebar;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static at.ac.univie.informatik.chineseinthebar.R.id.chooseImage;

public class ShowPhraseActivity extends AppCompatActivity {

    String chinese;
    String pinyin;
    String image;
    Context context;

    TextView txtChinese;
    TextView txtPinyin;
    ImageView imgTranslation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_phrase);
        context = getApplicationContext();

        Intent intent = getIntent();
        chinese = intent.getStringExtra("chinese");
        pinyin = intent.getStringExtra("pinyin");
        image = intent.getStringExtra("image");

        txtChinese = (TextView) findViewById(R.id.txtChinese);
        txtPinyin = (TextView) findViewById(R.id.txtPinyin);
        imgTranslation= (ImageView) findViewById(R.id.imgTranslation);

        txtChinese.setText(chinese);
        txtPinyin.setText(pinyin);

        int resID = context.getResources().getIdentifier(image , "drawable", context.getPackageName());
        imgTranslation.setImageResource(resID);
    }
}
