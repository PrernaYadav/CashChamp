package com.example.designer.cashchamp.adaptors;

import android.app.Activity;
import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.designer.cashchamp.R;
import com.example.designer.cashchamp.model.Homemodel;

import java.util.List;

/**
 * Created by designer on 11/8/2017.
 */

public class HomeAdaptor extends ArrayAdapter<Homemodel> {
    Context context;
    /*private SparseBooleanArray selectedListItemsIds;
    List multipleSelectionList;*/

    public HomeAdaptor(Context context,int ResourceId,List items){
        super(context,ResourceId,items);
        this.context = context;
    }
    /*private view holder class*/
    private class ViewHolder {
        TextView tvcategory;
        TextView tvtodayvalue;
        TextView tvtoatalvalue;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        Homemodel rowItem = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.home_row, null);
            holder = new ViewHolder();
            holder.tvcategory = (TextView) convertView.findViewById(R.id.tv_category);
            holder.tvtodayvalue = (TextView) convertView.findViewById(R.id.tv_todayvalue);
            holder.tvtoatalvalue = (TextView) convertView.findViewById(R.id.tv_totalvalue);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        holder.tvcategory.setText(rowItem.getTvcategory());
        holder.tvtodayvalue.setText(rowItem.getTvtodayvalue());
        holder.tvtoatalvalue.setText(rowItem.getTvTotalvalue());

        return convertView;
    }

}
