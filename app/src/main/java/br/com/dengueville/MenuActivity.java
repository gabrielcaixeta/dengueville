package br.com.dengueville;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void abrirTelefone(View novaView) {
        Intent intencao = new Intent(Intent.ACTION_DIAL);
        intencao.setData(Uri.parse("tel:04734313233"));
        startActivity(intencao);
    }
}