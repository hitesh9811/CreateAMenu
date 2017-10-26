package com.example.hiteshyadav.createamenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.hiteshyadav.createamenu.R.styleable.MenuItem;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    View view;
    private MenuItem item;
    ImageButton img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = (View) findViewById(R.id.RL);
        img  = (ImageButton)findViewById(R.id.imageButton2);
        t1 = (TextView) findViewById(R.id.textView);}

    public boolean onCreateOptionsMenu(Menu Menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.game_menu, Menu);
        return true;
    }

    public boolean onOptionsItemSelected(android.view.MenuItem item) {
        if(item.getItemId() == R.id.hlp)
        {
            Toast.makeText(getApplicationContext() , "clicked on help button" , Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId() == R.id.settings)
        {
            Toast.makeText(getApplicationContext() , "clicked on settings button" , Toast.LENGTH_LONG).show();

        }

        return true;
    }
}



