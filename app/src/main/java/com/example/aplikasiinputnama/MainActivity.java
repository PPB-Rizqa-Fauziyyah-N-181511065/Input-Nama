package com.example.aplikasiinputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Deklarasi Variabel
    EditText TextNama;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Panggil Variabel Berdasarkan Id
        TextNama = (EditText)findViewById(R.id.Txt_Nama);
        Hasil = (TextView)findViewById(R.id.Lbl_Nama);
    }

    //Buat Method Tampil Nama Sesuai Dengan Property Onclick Pada Button
    public void TampilNama(View v){
        Hasil.setText("Nama Anda: "+TextNama.getText());
    }
}
