package com.rendi.uts_20190915;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    EditText etBelakang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.et_nama);
        etBelakang = (EditText) findViewById(R.id.et_belakang);
        final EditText etAlamat = (EditText) findViewById(R.id.et_alamat);
        final EditText etTelepon = (EditText) findViewById(R.id.et_telepon);
        final RadioButton rbSmp = (RadioButton) findViewById(R.id.rb_smp);
        final RadioButton rbSmp1 = (RadioButton) findViewById(R.id.rb_smp1);
        final RadioButton rbMts = (RadioButton) findViewById(R.id.rb_mts);
        final Spinner spLaki = (Spinner) findViewById(R.id.sp_jenis_kelamin);
        final CheckBox cbxSmkDwidaya = (CheckBox) findViewById(R.id.cbx_smkdwidaya);
        final CheckBox cbxSmuDonBosco = (CheckBox) findViewById(R.id.cbx_smudonbosco);
        final CheckBox cbxSmkMerahPutih = (CheckBox) findViewById(R.id.cbx_smkmerahputih);
        final CheckBox cbxSmuSutarMadja = (CheckBox) findViewById(R.id.cbx_smusutarmadja);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.optionmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.mn_biodata:
                View view = findViewById(R.id.ly_main);
                String message = "Rendi";
                int duration = Snackbar.LENGTH_SHORT;
                Snackbar.make(view,message,duration).show();
                return true;
            case R.id.mn_simpan:
                Intent intent = new Intent (MainActivity.this, SimpanActivity.class);
                intent.putExtra("namadepan", etNama.getText().toString());
                intent.putExtra("namabelakang", etBelakang.getText().toString());
                startActivity(intent);
                return true;
            case R.id.mn_kosong:
                etNama.setText("");
                etBelakang.setText("");
                return true;
                default:
                    return super.onOptionsItemSelected(item);
        }

    }
}
