package fr.wcs.monsterwiki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by wilder on 06/03/18.
 */

public class MonsterAdapter extends ArrayAdapter<MonsterModel> {

    public MonsterAdapter(Context context, ArrayList<MonsterModel> trips) {
        super(context, 0, trips);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        MonsterModel monster = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_monster, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.textView_name);
        tvName.setText(monster.getName());

        String profil = String.valueOf(monster.getProfil());
        /**TextView imgprofil = convertView.findViewById(R.id.iv_profile);
        imgprofil.setText(profil);

        String element1 = String.valueOf(monster.getElement1());
        TextView type1 = convertView.findViewById(R.id.iv_element1);
        type1.setText(element1);

        String element2 = String.valueOf(monster.getElement2());
        TextView type2 = convertView.findViewById(R.id.iv_element2);
        type2.setText(element2);*/


        // Return the completed view to render on screen
        return convertView;
    }

}