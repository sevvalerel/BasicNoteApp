package com.sevval.note; // Senin paket adın kalsın

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editNot;
    Button btnKaydet, btnSil, btnEkle;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editNot = findViewById(R.id.editNot);
        btnKaydet = findViewById(R.id.btnKaydet);
        btnSil = findViewById(R.id.btnSil);
        btnEkle = findViewById(R.id.btnEkle);

        sharedPreferences = this.getSharedPreferences("com.sevval.note", Context.MODE_PRIVATE);


        String kaydedilmisNot = sharedPreferences.getString("kayitliYazi", "");
        editNot.setText(kaydedilmisNot);


        btnKaydet.setOnClickListener(v -> {
            String yazilanNot = editNot.getText().toString();
            sharedPreferences.edit().putString("kayitliYazi", yazilanNot).apply();
            Toast.makeText(MainActivity.this, "Kayıt Başarılı!", Toast.LENGTH_SHORT).show();
        });



        btnEkle.setOnClickListener(v -> {
            editNot.append("\n\n--------------------\nYeni Not\n");
            editNot.setSelection(editNot.getText().length());
        });


        btnSil.setOnClickListener(v -> {
            AlertDialog.Builder uyariKutusu = new AlertDialog.Builder(MainActivity.this);

            uyariKutusu.setTitle("Dikkat!");
            uyariKutusu.setMessage("Tüm notların silinecek. Emin misin?");

            uyariKutusu.setPositiveButton("SİL", (dialog, which) -> {
                editNot.setText(""); // Ekranı temizle
                sharedPreferences.edit().remove("kayitliYazi").apply(); // Hafızayı temizle
                Toast.makeText(MainActivity.this, "Notlar Silindi", Toast.LENGTH_SHORT).show();
            });


            uyariKutusu.setNegativeButton("HAYIR", null);

            uyariKutusu.show();
        });
    }
}