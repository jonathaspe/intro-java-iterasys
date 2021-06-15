//Exemplo de uma loja de construção

//1 - Pacote
package intro;

//2 - Referência às bibliotecas

import org.w3c.dom.ls.LSOutput;

//3 - Classe
public class Medidas {
    //3.1 - Atributos - características (adjetivos)

    //3.2 - Métodos e funções (o que a coisa sabe fazer)
    public static void main(String[] args){
        calcularAreaCurto();
        calcularAreaExtenso();

    }

    public static void calcularAreaCurto(){
        System.out.println("Cálculo da área Modo Curto:");

        //Cálculo de área, exemplo: tamanho do tapete ou do piso
        //Variáveis
        int largura = 4; // largura recebe 4
        int comprimento = 3;

        System.out.println("Para o largura de " + largura + "m e o comprimento de "
                + comprimento + "m, a área do tapete é de " + largura * comprimento + "m²");
    }

    public static void calcularAreaExtenso(){
        System.out.println("Cálculo da área Modo Extenso:");

        //Cálculo de área, exemplo: tamanho do tapete ou do piso
        //Variáveis
        int largura; // largura recebe 4
        int comprimento;
        int resultado;

        //Valores
        largura = 5;
        comprimento = 6;
        resultado = largura * comprimento;

        System.out.println("Para o largura de " + largura + "m e o comprimento de "
                + comprimento + "m, a área do tapete é de " + resultado + "m²");
    }

}
