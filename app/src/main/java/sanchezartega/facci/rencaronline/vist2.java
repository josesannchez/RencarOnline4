package sanchezartega.facci.rencaronline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;

public class vist2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vist2);
        ImageView img = (ImageView) findViewById(R.id.ivImagenCompleta2); //seleccionamos la img  de layout vista2
        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if(b!=null) {
            img.setImageResource(b.getInt("IMG"));
        }
    }
    //permitimos seleccionar el item




    }


