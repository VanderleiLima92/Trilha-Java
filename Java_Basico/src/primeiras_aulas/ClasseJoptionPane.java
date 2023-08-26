package primeiras_aulas;

import javax.swing.JOptionPane;

public class ClasseJoptionPane {
    public static void main(String[] args) {
        double primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor")); // input de dados
        double segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        JOptionPane.showMessageDialog(null, "A soma é " + (primeiroValor + segundoValor)); // saida de dados
    }
}
