package at.ac.univie.informatik.chineseinthebar;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by milan on 11.05.17.
 */

class ChooseAdapter extends ArrayAdapter<Translation> {

    Context context;
    ChooseAdapter(@NonNull Context context, Translation[] array) {
        super(context, R.layout.choose_list_row, array);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater chooseInflater = LayoutInflater.from(getContext());
        View customView = chooseInflater.inflate(R.layout.choose_list_row, parent, false);

        Translation translation = getItem(position);
        TextView chooseText = (TextView) customView.findViewById(R.id.chooseText);
        ImageView chooseImage = (ImageView) customView.findViewById(R.id.chooseImage);

        chooseText.setText(translation.getEnglish());

        String mDrawableName = translation.getImage();
        int resID = context.getResources().getIdentifier(mDrawableName , "drawable", context.getPackageName());
        chooseImage.setImageResource(resID);

        return customView;
    }
}
