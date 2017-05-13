package at.ac.univie.informatik.chineseinthebar;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static at.ac.univie.informatik.chineseinthebar.R.id.chinese;

/**
 * Created by Lena on 10.05.2017.
 */

public class Settings {

    private static String loadJSONFromAsset(Context context, String fileName) {
        String json = null;
        try {

           // InputStream is = getAssets().open("file_name.json");
            AssetManager assetManager = context.getAssets();
            InputStream is =  assetManager.open(fileName);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");

        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;

    }

    private static JSONArray getJSONArrayFromFile(Context context, String fileName) {
        String phrasesJSON = loadJSONFromAsset(context, fileName);
        JSONArray obj=null;
        try {
            obj = new JSONArray(phrasesJSON);
        } catch (JSONException e) {
            Log.e("MYAPP", "unexpected JSON exception", e);
        }
        return obj;
    }

    public static List <Translation> getTranslation(Context context, String fileName, String category) {
        List <Translation> result = new ArrayList<>();
        JSONArray jsonArray= getJSONArrayFromFile(context, fileName);

        try {
            for (int i = 0, size = jsonArray.length(); i < size; i++) {
                JSONObject phraseJSON = jsonArray.getJSONObject(i);

                if (category.equals(phraseJSON.get("category").toString())) {

                    Translation translation=new Translation(
                            phraseJSON.get("english").toString(),
                            phraseJSON.get("transChinese").toString(),
                            phraseJSON.get("transPinyin").toString(),
                            phraseJSON.get("image").toString(),
                            phraseJSON.get("category").toString()
                            );

                    result.add(translation);
                }

            }
        } catch (JSONException e) {
            Log.e("MYAPP", "unexpected JSON exception", e);
        }
        return result;
    }
}
