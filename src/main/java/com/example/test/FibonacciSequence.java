package main.java.com.example.test;

public class FibonacciSequence {
    public static boolean pertenceSequencia(int numero) {
        // Inicializa os dois primeiros números da sequência de Fibonacci
        int a = 0;
        int b = 1;

        // Verifica se o número informado é 0 ou 1, que são os dois primeiros números da sequência
        if (numero == 0 || numero == 1) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
            return true;
        }

        // Calcula os números da sequência de Fibonacci até ultrapassar o número informado
        while (a + b <= numero) {
            int proximo = a + b;
            a = b;
            b = proximo;
            // Verifica se o próximo número calculado é igual ao número informado
            if (proximo == numero) {
                System.out.println(numero + " pertence à sequência de Fibonacci.");
                return true;
            }
        }

        // Se o número não for encontrado na sequência, exibe uma mensagem informando
        System.out.println(numero + " não pertence à sequência de Fibonacci.");
        return false;
    }

}