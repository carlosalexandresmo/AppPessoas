package epd.vr.com.apppessoas;

import java.util.ArrayList;

/**
 * Created by Carlos Alexandre on 24/05/2016.
 */
public class Pessoa {

    private String mNome;
    private int mIdade;
    private char mSexo;

    public static ArrayList<Pessoa>  pessoas;

    public Pessoa(String nome, int idade, char sexo){
        this.mNome = nome;
        this.mIdade = idade;
        this.mSexo = sexo;
    }

    public String getmNome() {
        return mNome;
    }

    public void setmNome(String mNome) {
        this.mNome = mNome;
    }

    public int getmIdade() {
        return mIdade;
    }

    public void setmIdade(int mIdade) {
        this.mIdade = mIdade;
    }

    public char getmSexo() {
        return mSexo;
    }

    public void setmSexo(char mSexo) {
        this.mSexo = mSexo;
    }

    public static ArrayList<Pessoa> getListPessoas(){

        Pessoa pessoa;
        pessoas = new ArrayList<>();

        pessoa = new Pessoa("Bianca",19,'F');
        pessoas.add(pessoa);

        pessoa = new Pessoa("Carlos",26,'M');
        pessoas.add(pessoa);

        pessoa = new Pessoa("José",54,'M');
        pessoas.add(pessoa);

        pessoa = new Pessoa("Paulo André",42,'M');
        pessoas.add(pessoa);

        pessoa = new Pessoa("Ana Luiza",25,'F');
        pessoas.add(pessoa);

        pessoa = new Pessoa("Ana Luiza",25,'F');
        pessoas.add(pessoa);

        pessoa = new Pessoa("Ana Luiza",25,'F');
        pessoas.add(pessoa);

        pessoa = new Pessoa("Ana Luiza",25,'F');
        pessoas.add(pessoa);

        return pessoas;
    }
}
