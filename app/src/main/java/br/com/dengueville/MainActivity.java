package br.com.dengueville;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btndenuncia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btndenuncia = (Button) findViewById(R.id.denuncia);
        btndenuncia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(Intent.ACTION_VIEW, Uri.parse("https://ouvidoria-form.joinville.sc.gov.br/")));
            }
        });
    }

    public void abrirTelefone(View novaView) {
        String numeroTelefone = getString(R.string.numero_telefone);
        Intent intencao = new Intent(Intent.ACTION_DIAL);
        intencao.setData(Uri.parse(numeroTelefone));
        startActivity(intencao);
    }
    public void abrirTelaSintoma(View novaView) {
        Intent intencao = new Intent(this,SintomasActivity.class);
        startActivity(intencao);
    }

    public void voltarTelaMain(View novaView) {
        Intent intencao = new Intent(this,MainActivity.class);
        startActivity(intencao);
    }
}