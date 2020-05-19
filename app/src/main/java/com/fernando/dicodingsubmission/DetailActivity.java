package com.fernando.dicodingsubmission;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static final String DETAIL_SATELLITE = "detail_satellite";
    TextView name, description;
    ImageView picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initView();
        showSatelliteData();
    }

    private void initView() {
        name = findViewById(R.id.satelite_detail_name);
        description = findViewById(R.id.satelite_detail_description);
        picture = findViewById(R.id.satelite_detail_picture);
    }


    private void showSatelliteData() {
        Satellite satellite = getIntent().getParcelableExtra(DETAIL_SATELLITE);

        if(satellite == null) return;

        Glide.with(this)
                .load(satellite.getPicture_satellite())
                .into(picture);
        name.setText(satellite.getNama_satellite());
        description.setText(satellite.getDetail_satellite());
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
