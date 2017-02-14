package com.scriptingsystems.stringlistview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.scriptingsystems.stringlistview.R;
import com.scriptingsystems.stringlistview.model.Personas;

import java.util.List;

/**
 * Created by jeanrojas on 21/1/17.
 */

public class NamesAdapter extends ArrayAdapter<Personas> {


    private Context context;
    private List <Personas> listaPersonas;

    public NamesAdapter(Context context, int resource, List<Personas> objects) {
        super(context, resource, objects);
        this.context = context;
        this.listaPersonas = objects;
    }

    @Override
    public int getCount() {
        return listaPersonas.size();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row_layout = inflater.inflate(R.layout.row_layout, null);

        TextView nameTextView = (TextView) row_layout.findViewById(R.id.nameTextView);
        nameTextView.setText(listaPersonas.get(position).toString() );


        return row_layout;
    }
}
