package com.example.vitanon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Intent i=new Intent(HomeActivity.this, YourFeed.class);
                startActivity(i);
                return true;
            case R.id.item2:
                Intent a=new Intent(HomeActivity.this, AskVitBhopal.class);
                startActivity(a);
                return true;
            case R.id.item3:
                Intent ib=new Intent(HomeActivity.this, AskAllVit.class);
                startActivity(ib);
                return true;
            case R.id.item4:
                Intent ia=new Intent(HomeActivity.this, VitMeme.class);
                startActivity(ia);
                return true;
            case R.id.item5:
                Intent ig=new Intent(HomeActivity.this, Misc.class);
                startActivity(ig);
                return true;
            default:return super.onOptionsItemSelected(item);
        }
    }

}