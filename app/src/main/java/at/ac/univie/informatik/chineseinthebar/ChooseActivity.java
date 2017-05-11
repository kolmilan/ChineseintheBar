package at.ac.univie.informatik.chineseinthebar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        Bundle mainData = getIntent().getExtras();
        if (mainData == null)
            return;
        String mainChoice = mainData.getString("sender");

        String[] array = {"Item1", "Item2", "Item3"};

        String[] eatArray = {"Food1", "Food2", "Food3"};
        String[] talkArray = {"Talk1", "Talk2", "Talk3"};
        String[] drinkArray = {"Drink1", "Drink2", "Drink3"};
        String[] danceArray = {"Dance1", "Dance2", "Dance3"};


        /* funktioniert nicht
        if (mainChoice == "eat") {
            ListAdapter chooseAdapter =
                    new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, eatArray);
        }
        else if (mainChoice == "talk") {
            ListAdapter chooseAdapter =
                    new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, talkArray);
        }
        else if (mainChoice == "drink") {
            ListAdapter chooseAdapter =
                    new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, drinkArray);
        }
        else if (mainChoice == "dance") {
            ListAdapter chooseAdapter =
                    new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, danceArray);
        }
        else {
            return;
        } */
        ListAdapter chooseAdapter = new ChooseAdapter(this, array);

        ListView chooseListView = (ListView) findViewById(R.id.chooseListView);
        chooseListView.setAdapter(chooseAdapter);

        chooseListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    }
                }
        );


    }
}
