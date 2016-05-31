package epd.vr.com.apppessoas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Carlos Alexandre on 24/05/2016.
 */
public class PessoaAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Pessoa> mArrPessoas;
    private static LayoutInflater inflater=null;

    public PessoaAdapter(Context c, ArrayList<Pessoa> arrPessoas) {
        context = c;
        this.mArrPessoas = arrPessoas;
        inflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return mArrPessoas.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        if(convertView==null)
            vi = inflater.inflate(R.layout.item_row, null);

        Pessoa p = mArrPessoas.get(position);

        TextView nome = (TextView)vi.findViewById(R.id.tvNome); // nome
        TextView idade = (TextView)vi.findViewById(R.id.tvIdade); // idade
        TextView sexo = (TextView)vi.findViewById(R.id.tvSexo); // sexo


        // Setting all values in listview
        nome.setText(context.getResources().getString(R.string.nome)+" "+p.getmNome());
        idade.setText(context.getResources().getString(R.string.idade)+" "+String.valueOf(p.getmIdade()));
        sexo.setText(context.getResources().getString(R.string.sexo)+" "+String.valueOf(p.getmSexo()=='M'?"Masculino":"Feminino"));
        return vi;
    }
}
