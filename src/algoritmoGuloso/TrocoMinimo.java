package algoritmoGuloso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TrocoMinimo {
    
    public List<Integer> trocoMinimo(int valor, int[] moedas) {
        List<Integer> troco = new ArrayList<>();

        // Converte o array de moedas em uma lista de Integers
        List<Integer> coinList = new ArrayList<>();
        for (int moeda : moedas) {
            coinList.add(moeda);
        }

        // Ordenar as moedas em ordem decrescente de valor
        Collections.sort(coinList, Collections.reverseOrder());

        int valorRestante = valor;

        // Itera sobre as moedas enquanto o valor restante for maior que zero
        for (int moeda : coinList) {
            while (valorRestante >= moeda) {
                valorRestante -= moeda;
                troco.add(moeda);
            }
        }

        return troco;
    }

}
