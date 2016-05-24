package epd.vr.com.apppessoas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Carlos Alexandre on 24/05/2016.
 */
public class DetailActivity extends AppCompatActivity {

    private TextView tvNome, tvIdade, tvSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaill);

        tvNome = (TextView)findViewById(R.id.tvNome);
        tvIdade = (TextView)findViewById(R.id.tvIdade);
        tvSexo = (TextView)findViewById(R.id.tvSexo);

        Bundle extras = getIntent().getExtras();

        String nome = extras.getString("nome");
        String idade = extras.getString("idade");
        String sexo = extras.getString("sexo");

        tvNome.setText(nome);
        tvIdade.setText(idade);
        tvSexo.setText(sexo);
    }
}
