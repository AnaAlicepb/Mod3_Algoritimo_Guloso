package conjuntos;
import java.util.ArrayList;
import java.util.List;

public class SubConjuntoRecursivos {
	
	public List<List<Integer>> subConjuntoRecursivos(int[] s, int n) {
		List<List<Integer>> resultado = new ArrayList<>();
		subConjuntoRecursivoHelper(s, 0, n, new ArrayList<>(), resultado);
        return resultado;
	}
	
	private static void subConjuntoRecursivoHelper(int[] s, int indice, int n, List<Integer> subConjuntoAtual, List<List<Integer>> resultado) {
		if (subConjuntoAtual.size() == n) {
			resultado.add(new ArrayList<>(subConjuntoAtual));
			return;
		}
		
		for (int j = indice; j < s.length; j++) {
			subConjuntoAtual.add(s[j]);
			subConjuntoRecursivoHelper(s, j + 1, n, subConjuntoAtual, resultado);
			// Remover o último elemento adicionado para tentar a próxima combinação
			subConjuntoAtual.remove(subConjuntoAtual.size() - 1);
		}
	}
}
