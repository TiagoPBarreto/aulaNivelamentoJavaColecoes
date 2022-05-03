package estudo.com.aulanivelamentojavacolecoes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Float> precos;
    List<Cliente> clientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precos = new ArrayList<>();
        clientes = new ArrayList<>();

        precos.add(10.00f);//0
        precos.add(20.00f);//1
        precos.add(30.00f);//2


        Cliente objA = new Cliente();
        objA.setId(1);
        objA.setNome("Tiago");
        objA.setEmail("testa@testa");
        objA.setPreco(29.90f);
        clientes.add(objA);


       /* for (int i = 0; i < inteiros.size(); i++) {
            Log.i("inteiros","For I Elemento:"+i+" - "+inteiros.get(1));
        }


        for (Float preco:precos) {
            Log.i("inteiros","For Eat Elemento: "+preco);
            
        }

        */

        for (Cliente obj:clientes) {
            Log.i("Clientes","id "+obj.getId());
            Log.i("Clientes","nome "+obj.getNome());
            Log.i("Clientes","email "+obj.getEmail());
            Log.i("Clientes","preco "+obj.getPreco());
        }
    }
}