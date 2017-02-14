package com.scriptingsystems.vehiculoslistview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.scriptingsystems.vehiculoslistview.R;
import com.scriptingsystems.vehiculoslistview.model.Vehiculo;

import java.util.List;

/**
 * Created by jeanrojas on 21/1/17.
 */

public class CarAdapter extends ArrayAdapter<Vehiculo> {
    private Context ctx;
    private List<Vehiculo> listaVehiculos;
    private ImageView carImageView;
    private TextView carTextView;



    public CarAdapter(Context context, int resource, List<Vehiculo> objects) {
        super(context, resource, objects);
        ctx = context;
        listaVehiculos = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(ctx);
        View row_car = inflater.inflate(R.layout.row_car, null);

        carImageView = (ImageView) row_car.findViewById(R.id.carImageView);
        carTextView = (TextView) row_car.findViewById(R.id.carTextView);

        carImageView.setImageResource(listaVehiculos.get(position).getMiniatura());
        carTextView.setText(listaVehiculos.get(position).toString());

        return row_car;
    }

    @Override
    public int getCount() {
        return listaVehiculos.size();
    }
}
