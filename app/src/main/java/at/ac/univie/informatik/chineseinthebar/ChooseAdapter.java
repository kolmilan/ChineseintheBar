package at.ac.univie.informatik.chineseinthebar;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by milan on 11.05.17.
 */

class ChooseAdapter extends ArrayAdapter<String> {

    ChooseAdapter(@NonNull Context context, String[] array) {
        super(context, R.layout.choose_list_row, array);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater chooseInflater = LayoutInflater.from(getContext());
        View customView = chooseInflater.inflate(R.layout.choose_list_row, parent, false);

        String singleChooseItem = getItem(position);
        TextView chooseText = (TextView) customView.findViewById(R.id.chooseText);
        ImageView chooseImage = (ImageView) customView.findViewById(R.id.chooseImage);

        chooseText.setText(singleChooseItem);
        chooseImage.setImageResource(R.mipmap.choose_image);
        return customView;
    }
}
