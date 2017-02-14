package com.scriptingsystems.handlerexample;

import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;


/*
@see recordamos  que los Handlers nos permiten comunicarnos desde un subproceso con el hilo
     principal de la aplicación Android que cómo sabéis, es el hilo de interfaz de usuario.

     Handler:
        Para que lo entendamos todos un handler es el puente que hay entre un hilo secundario
        (thread) y el hilo principal (aplicación).
        http://www.tutorialeshtml5.com/2012/05/android-thread-hilo-y-handler-proceso.html
*/
public class MainActivity extends AppCompatActivity {
    static final String TAG= "MainActivity";
    private Button btProgress, btProgressBar;

    //Se abre un popup, de descarga
    ProgressDialog progressDialog;
    private ProgressBar progressBar;
    //Este Handler es llamado por ProgressBar
    Handler mHandlerProgressBar = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            progressBar.incrementProgressBy(10);
        }
    };
    //Este handler es llamado por ProgressDialog
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btProgress = (Button) findViewById(R.id.buttonProgress);
        btProgressBar = (Button) findViewById(R.id.buttonProgressBar);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        handler = new Handler();

        btProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Para iniciar el popup de descarga
                launchProgressDialog();
            }
        });

        btProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchProgressBar();
            }
        });

    }



    private void launchProgressDialog() {
        progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setTitle("Simulando descarga...");
        progressDialog.setMessage("Descarga en progreso...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setProgress(0);
        progressDialog.setMax(100);
        progressDialog.show();


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (progressDialog.getProgress() < progressDialog.getMax()) {
                        Thread.sleep(2000);
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                progressDialog.incrementProgressBy(10);
                            }
                        });
                    }
                    Log.d(TAG, "launchProgressDialog()...");
                    progressDialog.dismiss();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

    }

    private void launchProgressBar() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //El maximo para este progressBar se ha declarado en el Layout q es 100
                    while (progressBar.getProgress() < progressBar.getMax()) {

                        Thread.sleep(2000);
                        mHandlerProgressBar.sendMessage(mHandlerProgressBar.obtainMessage());
                        Log.d(TAG, "launchProgressBar()... bucle");
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }


}
