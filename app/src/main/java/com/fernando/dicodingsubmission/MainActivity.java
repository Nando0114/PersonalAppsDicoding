package com.fernando.dicodingsubmission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvSatellite;
    private ArrayList<Satellite> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSatellite= findViewById(R.id.rv_satellite);
        rvSatellite.setHasFixedSize(true);

        list.addAll(SatelliteData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvSatellite.setLayoutManager(new LinearLayoutManager(this));
        ListSatelliteAdapter listHeroAdapter = new ListSatelliteAdapter(list);
        rvSatellite.setAdapter(listHeroAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent j = new Intent(this, AboutActivity.class);
        startActivity(j);
        return super.onOptionsItemSelected(item);
    }
}
