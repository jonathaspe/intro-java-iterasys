//Exemplo de uma loja de construção

//1 - pacote
package intro;

//2 - Referência às bibliotecas

import org.w3c.dom.ls.LSOutput;

//3 - Classe
public class Medidas {
    //3.1 - Atributos - características (adjetivos)

    //3.2 - Métodos e funções (o que a coisa sabe fazer)
    public static void main(String[] args){
        System.out.println("Bom dia!");
        System.out.println("Cálculo da área do tapete:");

        //Cálculo de área, exemplo: tamanho do tapete ou do piso
        //Variáveis
        int largura;
        int comprimento;
        int resultado;

        //Valores
        largura = 4; // largura recebe 4
        comprimento = 3;

        resultado = largura * comprimento;
        System.out.println("Para o largura de " + largura + "m e o comprimento de "
                + comprimento + "m, a área do tapete é de " + resultado + "m²");
    }
}
