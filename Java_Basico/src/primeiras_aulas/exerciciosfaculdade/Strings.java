package primeiras_aulas.exerciciosfaculdade;

import javax.swing.JOptionPane;

public class Strings {
    public static void main(String[] args) {
// Verificar o comprimento de uma string
String s = JOptionPane.showInputDialog("Digite uma string");
s = s.toUpperCase(); // passar para maiusculo

int comprimento = s.length(); // verificar o tamanho
JOptionPane.showMessageDialog(null, s + " tem " + comprimento + " caracteres.");

}
}

