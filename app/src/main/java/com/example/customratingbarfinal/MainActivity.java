

package com.example.customratingbarfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtValueRate;
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }
    private void addEvents() {
        txtValueRate.setText(ratingBar.getRating()+"/4");
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                txtValueRate.setText(ratingBar.getRating()+"/5");

            }
        });

    }
    private void addControls() {
        txtValueRate = findViewById(R.id.textViewValueRate);
        ratingBar = findViewById(R.id.ratingBar);

    }
}