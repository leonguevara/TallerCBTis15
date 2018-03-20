package com.leonguevara.tallercbtis15;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.myToolbar);
        if (myToolbar != null) {
            setSupportActionBar(myToolbar);
            myToolbar.setLogo(R.drawable.ic_favorite_black_24dp);
            myToolbar.setSubtitle(R.string.subtitle);
        }
        getSupportActionBar().setTitle(R.string.welcome);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch(id) {
            case R.id.call:
                Toast.makeText(MainActivity.this, "Call item selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.location:
                Toast.makeText(MainActivity.this, "Location item selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.camera:
                Toast.makeText(MainActivity.this, "Camera item selected", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MediaStore.ACTION_IMAGE_CAPTURE));
                break;
            case R.id.video:
                Toast.makeText(MainActivity.this, "Video item selected", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MediaStore.ACTION_VIDEO_CAPTURE));
                break;
            case R.id.color_red:
                Toast.makeText(MainActivity.this, "Red item selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.color_blue:
                Toast.makeText(MainActivity.this, "Blue item selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.color_green:
                Toast.makeText(MainActivity.this, "Camera item selected", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
