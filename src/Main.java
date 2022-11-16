public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio calculadora");
        calculadora.soma(3, 6);
        calculadora.subtração(9, 1.8);
        calculadora.multiplicação(7, 8);
        calculadora.divisao(5, 2.5);

        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(20);
    }

}