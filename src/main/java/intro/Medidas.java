// 1 - Pacote
package intro;

// 2 - Referência das bibliotecas

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

// 3 - Classe
public class Medidas {
    //3.1 - Atributos, características
    //3.2 - Métodos e funções
    //static: o primeiro a ser carregado e void é pq não há retorno, só execução, é um método
    //main é um nome padrão por ser o primeiro método/função da classe
    //entre () é o que ele pode receber e entre [] é a lista que ele pode receber
    //args é o nome da lista, é um nome padrão de mercado (uma abreviação de argumentos que serão recebidas)
    public static void main (String[] args){
        //utilizar a classe Scanner para ler a escolha do usuário no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U    D E    O P Ç Õ E S");
        System.out.println("C - calcular área modo Curto");
        System.out.println("D - contar até dez");
        System.out.println("E - calcular área modo Extenso");
        System.out.println("I - executar ifSimple");
        System.out.println("R - contagem regressiva");
        System.out.println("Digite a opção desejada: ");
        String opcao = scanner.next();

        //switch: seleciona o comportamento do programa conforme a escolha da pessoa ou do software
        switch (opcao){
            case "C":
            case "c":
                System.out.println("Você escolheu executar o método curto");
                calcularAreaModoCurto();
                break;
            case "D":
            case "d":
                System.out.println("Você escolheu contar até dez");
                contarAteDez();
                break;
            case "E":
            case "e":
                System.out.println("Você escolheu executar o método extenso");
                calcularAreaModoExtenso();
                break;
            case "I":
            case "i":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "R":
            case "r":
                System.out.println("Você escolheu executar o método de contagem regressiva");
                contagemRegressiva();
                break;
            default:
                System.out.println("Você escolheu um valor que não tem método válido");
        }

    }
        public static void ifSimples (){
        String modo = "extenso";

        if(modo == "curto"){
            calcularAreaModoCurto();
        }
        else {
            calcularAreaModoExtenso();
        }

    }
    public static void calcularAreaModoExtenso() {
        System.out.println("Cálculo de áreas - Modo Extenso");
        //Cálculo de área. Exemplo: o tamanho do tapete ou do piso.
        int largura;
        int comprimento;
        int resultado;

        largura = 5; //recebe 4
        comprimento = 6; //recebe 3
        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m² e o comprimento de "
                + comprimento + "m², a área é de: " + resultado + "m²");

    }
    public static void calcularAreaModoCurto(){
        System.out.println("Cálculo de áreas - Modo Curto");
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m² e o comprimento de "
                + comprimento + "m², a área é de: " + largura * comprimento + "m²");
    }
    public static void contarAteDez(){
        System.out.println("Contagem Crescente");
        for (int numero = 1; numero <= 10; numero++){
            System.out.println(numero);
        }
    }
    public static void contagemRegressiva(){
        System.out.println("Contagem regressiva");
        int numero = 10;
        while (numero >= 1){
            System.out.println(numero);
            numero--;
        }
    }
}