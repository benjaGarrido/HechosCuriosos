package com.benjagarrido.hechoscuriosos2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaramos nuestras variables y les asignamos valor
        final TextView factLabel = (TextView)findViewById(R.id.lblHecho);
        Button showFactButton = (Button)findViewById(R.id.btnOtroHecho);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact ="";
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(10);
                switch (randomNumber){
                    case 0:
                        fact = "¿Los 10 trabajos más demandados en 2010 no existian en 2004?";
                        break;
                    case 1:
                        fact = "Las avestruces pueden correr más rápido que los caballos.";
                        break;
                    case 2:
                        fact = "Las medallas de oro de los juegos olímpicos están hechas de plata.";
                        break;
                    case 3:
                        fact = "Naciste con 300 huesos, pero en la edad adulta tendrás solo 206.";
                        break;
                    case 4:
                        fact = "Toma unos 8 minutos en llegar la luz del sol a la tierra.";
                        break;
                    case 5:
                        fact = "Algunas plantas de bambu pueden crecer hasta un metro al día.";
                        break;
                    case 6:
                        fact = "El estado de Florida es más grande que Inglaterra.";
                        break;
                    case 7:
                        fact ="Algunos pingüinos pueden saltar de 2 a 3 metros por encima del agua";
                        break;
                    case 8:
                        fact = "De media se tarda 66 días en tomar un nuevo hábito.";
                        break;
                    case 9:
                        fact = "Los mamuts seguian caminando sobre la tierra en la época en que se construyeron las grandes pirámides.";
                        break;
                    case 10:
                        fact = "El lago más profundo del mundo se llama Baikal";
                        break;
                    default:
                        break;
                }

                factLabel.setText(fact);
            }
        };

        showFactButton.setOnClickListener(listener);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
