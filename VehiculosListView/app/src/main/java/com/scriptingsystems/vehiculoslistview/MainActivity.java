package com.scriptingsystems.vehiculoslistview;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.scriptingsystems.vehiculoslistview.adapter.CarAdapter;
import com.scriptingsystems.vehiculoslistview.model.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    static final String TAG = "MainActivity";
    ListView carListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carListView = (ListView) findViewById(R.id.carListView);
        carListView.setAdapter( new CarAdapter(this, R.layout.row_car, setVehiculos()));

        carListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d(TAG, "Click en item "+position+"...");
                Snackbar.make(view, "Click en item "+position+"... ",Snackbar.LENGTH_LONG).show();
            }
        });

    }


    private List<Vehiculo> setVehiculos () {

        List<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(new Vehiculo("bla bla bla","Peugeot",R.drawable.vehiculo1,R.drawable.vehiculo1, "307"));
        listaVehiculos.add(new Vehiculo("bla bla bla","Renault",R.drawable.vehiculo2,R.drawable.vehiculo2, "Megane"));
        listaVehiculos.add(new Vehiculo("bla bla bla","Peugeot",R.drawable.vehiculo3,R.drawable.vehiculo3, "3008"));
        listaVehiculos.add(new Vehiculo("bla bla bla","BMW",R.drawable.vehiculo4,R.drawable.vehiculo4, "401"));
        listaVehiculos.add(new Vehiculo("bla bla bla","Hyundai",R.drawable.vehiculo5,R.drawable.vehiculo5, "407"));

        return listaVehiculos;

    }
}
