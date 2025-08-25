/*
 * Exercício de recursividade, contagem de números negativos.
 * versão 1.0
 * data 17/08/2025
 * programador Henrique Foganholi de Oliveira
 */

package view;
import controller.ContaNegativosController;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		ContaNegativosController controle = new ContaNegativosController();
		int tamanhoVetor = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));
		int n;
		int[] meuVetor = new int[tamanhoVetor];
		for (n = 0; n < tamanhoVetor; n++) {
			meuVetor[n] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor desejado para a"
					+ " posição " + n + " do vetor: "));
		}
		int resultado;
		resultado = controle.contaNegativos(meuVetor, tamanhoVetor, 0);
		JOptionPane.showMessageDialog(null,"A quantidade de valores negativos é " + resultado + " .");
	}

}
