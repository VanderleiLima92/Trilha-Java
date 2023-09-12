package primeiras_aulas.exerciciosfaculdade;

import javax.swing.JOptionPane;

public class MetodoFormat {
   public static void main(String[] args) {
String nome;
int idade;

nome = JOptionPane.showInputDialog("Qual o seu nome?");
nome = nome.toUpperCase();

idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));


//"montando a string com o método format"
String s = String.format ("Oi, %s. Você tem %d anos.",nome, idade);


}
}


