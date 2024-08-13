package conjuntos;

import java.util.List;
import algoritmoGuloso.TrocoMinimo;

public class App {
	
	public static void main(String[] args) {
		int[] s = {1, 2, 3, 4, 5};
		int n = 2;

		SubConjuntoRecursivos sub = new SubConjuntoRecursivos();
		List<List<Integer>> subconjuntos = sub.subConjuntoRecursivos(s, n);
		System.out.println("Subconjuntos de tamanho " + n + ": " + subconjuntos);
		System.out.println("Número total de subconjuntos: " + subconjuntos.size());
		
		TrocoMinimo t = new TrocoMinimo();
		int valor = 18; // Quantia a ser trocada
		int[] moedas = {5, 2, 1}; // Moedas disponíveis

		List<Integer> troco = t.trocoMinimo(valor, moedas);
		System.out.println("Troco mínimo usando algoritmo guloso: " + troco);
	}
}
