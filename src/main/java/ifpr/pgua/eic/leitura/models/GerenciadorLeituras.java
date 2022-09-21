package ifpr.pgua.eic.leitura.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorLeituras {
    private ArrayList<Leitura> leituras;
    
    public GerenciadorLeituras() {
        
        leituras = new ArrayList<>();
    }

    public ArrayList<Leitura> getLeituras(){
        return leituras;
    }

    public boolean cadastraLeitura(String titulo, String autor, String opiniao, LocalDate dataLeitura, double nota){
        
        Leitura leitura = new Leitura(titulo, autor, dataLeitura, opiniao, nota);
        leituras.add(leitura);

        return true;
    }



}
