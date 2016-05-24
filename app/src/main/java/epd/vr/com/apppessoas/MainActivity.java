package epd.vr.com.apppessoas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private PessoaAdapter mPessoaAdapter;
    private ArrayList<Pessoa> pessoas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Casting da Widget
        mListView = (ListView)findViewById(R.id.listPessoas);
        //pega lista do model
        pessoas = Pessoa.getListPessoas();
        //joga o modelo no adaptador
        mPessoaAdapter = new PessoaAdapter(this,pessoas);
        //seta o adaptador na listagem
        mListView.setAdapter(mPessoaAdapter);


        mListView.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Pessoa pessoa = pessoas.get(position);
                Intent i = new Intent(MainActivity.this, AddActitity.class);
                i.putExtra("nome", pessoa.getmNome());
                i.putExtra("idade", pessoa.getmIdade());
                i.putExtra("sexo", pessoa.getmSexo());
                startActivity(i);
            }
        });
    }
}
