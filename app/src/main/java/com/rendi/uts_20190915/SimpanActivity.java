package com.rendi.uts_20190915;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SimpanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpan);

        final TextView tvDepan = (TextView) findViewById(R.id.tv_namadepan);
        final TextView tvBelakang = (TextView) findViewById(R.id.tv_namabelakang);

        Intent intent = getIntent();
        tvDepan.setText(intent.getStringExtra("namadepan"));
        tvBelakang.setText(intent.getStringExtra("namabelakang"));
    }


}
