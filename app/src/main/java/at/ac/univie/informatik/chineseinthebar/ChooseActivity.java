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
        String mainChoice = mainData.getString("mainMessage");

        String[] array = {"Item1", "Item2", "Item3"};
        ListAdapter chooseAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array);
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
