package primeiras_aulas.exerciciosfaculdade;

import javax.swing.JOptionPane;

public class ComparacaoString {
    public static void main(String[] args) {
String s1 = JOptionPane.showInputDialog("Qual a primeira string?");
String s2 = JOptionPane.showInputDialog("Qual a segunda string?");
//comparação considerando maiúsculas e minúsculas: s é diferente de s

if (s1.equals(s2)){
JOptionPane.showMessageDialog(null, "Considerando a caixa, as strings são iguais");

}
else{
JOptionPane.showMessageDialog(null, "Considerando a caixa, as strings são diferentes");

}
//comparação considerando maiúsculas e minúsculas: s é igual a S
if (s1.equalsIgnoreCase(s2)){
JOptionPane.showMessageDialog(null, "Desconsiderando a caixa, as strings são iguais");

}
else{
JOptionPane.showMessageDialog(null, "Desconsiderando a caixa, as strings são diferentes");

}
}
}
