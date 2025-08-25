/*
 * Exercício de recursividade, contagem de números negativos.
 * versão 1.0
 * data 17/08/2025
 * programador Henrique Foganholi de Oliveira
 */

package controller;

public class ContaNegativosController {
	
	public ContaNegativosController() {
		super();
	}
	
	public int contaNegativos(int[] vet, int tamanhoVet, int cont) {
		// Condição de parada, o tamanho do vetor chega a zero, apresentando
		// o resultado da contagem.
		if (tamanhoVet == 0) {
			return cont;
		}
		// A função deve comparar a última posição do vetor com a anterior
		// sendo um valor negativo, acrescenta ao contador.
		int ultimoElemento = vet[tamanhoVet - 1];
		if (ultimoElemento < 0) {
			cont++;
		}
		return contaNegativos(vet, tamanhoVet - 1, cont);
	}
}
