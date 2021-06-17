//Exemplo de uma loja de construção

//1 - Pacote
package intro;

//2 - Referência às bibliotecas

import java.util.Scanner;

//3 - Classe
public class Medidas {
    //3.1 - Atributos - características (adjetivos)

    //3.2 - Métodos e funções (o que a coisa sabe fazer)
    public static void main(String[] args){
        // Condicional - verifica uma condição - uma pergunta para uma pessoa, hardware ou software

        // Utilizar a classe Scanner do Java para ler a escolha do usuário no Console
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU DE OPÇÕES");
        System.out.println("C - Calcular a área Modo Curto");
        System.out.println("D - Calcular até 10");
        System.out.println("E - Calcular a área Modo Extenso");
        System.out.println("I - Calcular ifSimples");
        System.out.println("R - Contagem regressiva, a partir de 10");
        System.out.println("Digite a opção desejada: ");
        String opcao = scanner.next();

        // Switch = selecionar o comportamento  do programa, conforme a escolha da pessoa ou do software

        switch (opcao){
            case "i":
            case "I":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;

            case "c":
            case "C":
                System.out.println("Você escolheu executar o método calcularAreaCurto");
                calcularAreaCurto();
                break;

            case "d":
            case "D":
                System.out.println("Você escolheu executar o método contarAteDez");
                contarAteDez();
                break;

            case "e":
            case "E":
                System.out.println("Você escolheu executar o método calcularAreaExtenso");
                calcularAreaExtenso();
                break;

            case "r":
            case "R":
                System.out.println("Você escolheu executar o método contagemRegressiva");
                contagemRegressiva();
                break;

            default:
                System.out.println("Você escolheu executar um método inválido");
                break;
        }
    }
    public static void ifSimples(){

        // If = se
        // Else = senão

        String modo = "curto";

        if (modo == "curto"){
            calcularAreaCurto();
        }
        else {
            calcularAreaExtenso();
        }
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
    public static void contarAteDez(){

        // Loops ou repetições
        // For - repetição incondicional

        System.out.println("Contagem crescente");
        for(int numero = 1; numero <= 10; numero++){
            System.out.println(numero);
        }
    }
    public static void contagemRegressiva(){

        // Loops ou repetições
        // For - repetição incondicional

        System.out.println("Contagem regrassiva");
        // pode-se escrever > -1 para melhorar a performance do sistema em "numero >=0"
        for(int numero = 10; numero >= 0; numero--){
            System.out.println(numero);
        }
    }
}
