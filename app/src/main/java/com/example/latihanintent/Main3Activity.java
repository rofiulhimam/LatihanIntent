package com.example.latihanintent;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    private RecyclerView rvHeroes;
    private ArrayList<Pahlawan> list = new ArrayList<>();
    private String title = "Pahlawan";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setActionBarTitle(title);

        rvHeroes = findViewById(R.id.rv_heroes);
        rvHeroes.setHasFixedSize(true);

        list.addAll(DataPahlawan.getListData());
        showRecyclerList();
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showRecyclerList() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListHeroAdapter listHeroAdapter = new ListHeroAdapter(list);
        rvHeroes.setAdapter(listHeroAdapter);

        listHeroAdapter.setOnItemClickCallback(new ListHeroAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Pahlawan data) {
                showSelectedHero(data);
            }
        });
    }

    private void showSelectedHero(Pahlawan hero) {
        Toast.makeText(this, "Kamu memilih " +
                hero.getName(), Toast.LENGTH_SHORT).show();
    }
}
