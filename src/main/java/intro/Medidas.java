// 1 - Pacote
package intro;

// 2 - Referência das bibliotecas

// 3 - Classe
public class Medidas {
    //3.1 - Atributos, características
    //3.2 - Métodos e funções
    //static: o primeiro a ser carregado e void é pq não há retorno, só execução, é um método
    //main é um nome padrão por ser o primeiro método/função da classe
    //entre () é o que ele pode receber e entre [] é a lista que ele pode receber
    //args é o nome da lista, é um nome padrão de mercado (uma abreviação de argumentos que serão recebidas)
    public static void main (String[] args){
        calcularAreaModoExtenso();
        calcularAreaModoCurto();
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
    public static void calcularAreaModoCurto (){
        System.out.println("Cálculo de áreas - Modo Curto");
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m² e o comprimento de "
                + comprimento + "m², a área é de: " + largura * comprimento + "m²");
    }
}