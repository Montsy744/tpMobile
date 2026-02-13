package fr.iutlille.tp3;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import fr.iutlille.tp3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding ui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());
    }


}
