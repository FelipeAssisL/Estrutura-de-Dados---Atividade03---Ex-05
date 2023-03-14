package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.ordenacao.Ordenacao_Vetor;

public class Main {

	public static void main(String[] args) {
		Ordenacao_Vetor ordena = new Ordenacao_Vetor();
		int[] vet = {69,68,32,36,91,19,28,44,88,73,37,99,1};
		int fim = vet.length;
		int op = 0;
		while(op!=9) {
			op = Integer.parseInt(JOptionPane.showInputDialog(("1 -  Ordena Bubble \n 2 - Ordena Merge \n 9 - Fim")));
			switch(op){
            case 1:
                vet = ordena.bublleSort(vet);
                break;
            case 2:
                vet = ordena.mergeSort(vet, 0, fim);
                break;
            case 9:
                JOptionPane.showMessageDialog(null,"Programa Finalizado");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opção Inválida");
			}
		}
	}
}