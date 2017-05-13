package at.ac.univie.informatik.chineseinthebar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.List;


public class ChoosePhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        final Bundle intent = getIntent().getExtras();
        if (intent == null)
            return;

        String category = intent.getString("category");
        String mode =intent.getString("mode");
        String fileName="";

        List<Translation> translations = Settings.getTranslation(this, "PhrasesJSON", category);
        Translation[] translationsArr = new Translation[translations.size()];
        translationsArr = translations.toArray(translationsArr);

        ListAdapter chooseAdapter = new ChooseAdapter(this, translationsArr);

        ListView chooseListView = (ListView) findViewById(R.id.chooseListView);
        chooseListView.setAdapter(chooseAdapter);

        final Translation[] finalTranslationsArr = translationsArr;

        chooseListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                   Translation translation = finalTranslationsArr[i];

                    Intent showPhraseIntent = new Intent(ChoosePhrasesActivity.this, ShowPhraseActivity.class);
                    showPhraseIntent.putExtra("image", translation.getImage());
                    showPhraseIntent.putExtra("chinese", translation.getChinese());
                    showPhraseIntent.putExtra("pinyin", translation.getPinyin());

                    startActivity(showPhraseIntent);

                    }
                }
        );


    }
}
