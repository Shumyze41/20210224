package org.example.animations1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void animation(View view)
    {
        ImageView imageView= findViewById(R.id.imageView);
       // imageView.animate().alpha(0).setDuration(450);
       // imageView.animate().translationYBy(150).setDuration(3000);
        imageView.animate().rotation(720).setDuration(3000);

    }

}