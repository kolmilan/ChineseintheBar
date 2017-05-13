package at.ac.univie.informatik.chineseinthebar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class CategoryActivity extends AppCompatActivity {

    String mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        setTitle(R.string.title_category);

        Intent intent = getIntent();
        mode = intent.getStringExtra("mode");
    }

    @Override
    public void onBackPressed() {
            super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void eatOnClick(View view) {
        onClickBtn("eat");
    }

    public void talkOnClick(View view) {
        onClickBtn("talk");
    }

    public void drinkOnClick(View view) {
        onClickBtn("drink");
    }

    public void danceOnClick(View view) {
        onClickBtn("dance");
    }

    private void onClickBtn(String category) {
        Intent i;
        if (mode.equals("phrases")) {
            i = new Intent(this, ChoosePhrasesActivity.class);
        } //else if mode==words
        else {
            i = new Intent(this, WordActivity.class);
        }
        i.putExtra("category", category);
        i.putExtra("mode", mode);

        startActivity(i);

    }
}
