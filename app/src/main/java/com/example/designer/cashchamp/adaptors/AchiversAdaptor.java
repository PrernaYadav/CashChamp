package com.example.designer.cashchamp.adaptors;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.designer.cashchamp.R;
import com.example.designer.cashchamp.model.AchiversModel;
import com.example.designer.cashchamp.model.Homemodel;

import java.util.List;

/**
 * Created by designer on 11/8/2017.
 */

public class AchiversAdaptor  extends ArrayAdapter<AchiversModel> {
    Context context;

    public AchiversAdaptor(Context context, int ResourceID, List item){
        super(context,ResourceID,item);
        this.context=context;
    }

    public class ViewHolder{
        private TextView tvheading;
        private TextView tvearning;
        private TextView tvvalue;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        AchiversModel rowItem = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.achiver_row, null);
            holder = new ViewHolder();
            holder.tvheading = (TextView) convertView.findViewById(R.id.tv_achivers_heading);
            holder.tvearning = (TextView) convertView.findViewById(R.id.tv_achivers_earning);
            holder.tvvalue = (TextView) convertView.findViewById(R.id.tv_achivers_value);
            convertView.setTag(holder);
        } else
            holder = (AchiversAdaptor.ViewHolder) convertView.getTag();

        holder.tvheading.setText(rowItem.getTvheading());
        holder.tvearning.setText(rowItem.getTvvalues());
        holder.tvvalue.setText(rowItem.getTvvalues());

        return convertView;
    }

}
