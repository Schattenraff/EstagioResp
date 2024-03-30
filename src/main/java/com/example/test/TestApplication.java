package main.java.com.example.test;

import static main.java.com.example.test.FibonacciSequence.*;
import static main.java.com.example.test.InverterString.*;
public class TestApplication {




    public static void main(String[] args) {
        // 1) Observe o trecho de código abaixo:
        //
        // int INDICE = 13, SOMA = 0, K = 0;
        // enquanto K < INDICE faça  {
        // K = K + 1;
        // SOMA = SOMA + K;}
        // imprimir(SOMA);
        // Ao final do processamento, qual será o valor da variável SOMA?

        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k++;
            soma += k;
            System.out.print(soma + "  ");
        }
        System.out.println("\nAo final do processamento, o valor da variável SOMA é " + soma);


        // 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
        // escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
        // IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

        // para evitar o excesso de poluição de codigo, eu criei uma classe "FibonacciSequence" que esta na mesma pasta que este arquivo "TestApplication" o codigo inteiro está la de uma olhada
        // para ver a implementação do metodo.
        pertenceSequencia(3);

        //        3) Descubra a lógica e complete o próximo elemento:
        //
        //        a) 1, 3, 5, 7, 9   (x+2)
        //
        //        b) 2, 4, 8, 16, 32, 64, 128 (x*2)
        //
        //        c) 0, 1, 4, 9, 16, 25, 36, 49 (x^2)
        //
        //        d) 4, 16, 36, 64, 1000 são os quadrados dos números pares consecutivos começando de 2. 4 = 2^2 16 = 4^2 36 = 6^2 64 = 8^2
        //
        //        e) 1, 1, 2, 3, 5, 8, 13 Fibonacci
        //
        //        f) 2,10, 12, 16, 17, 18, 19, ____ não consegui identificar uma ordem. =/

        //        4) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.
        //        Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada? Resposta honesta : não sei.
        //        Resposta do chatGPT
        //        Primeira visita:
        //
        //        Ligue o primeiro interruptor e aguarde alguns minutos.
        //        Desligue o primeiro interruptor e ligue o segundo interruptor.
        //                Deixe o terceiro interruptor desligado.
        //        Agora, há três possibilidades:
        //
        //        Se a lâmpada conectada ao primeiro interruptor estiver acesa e as outras duas estiverem apagadas, então o primeiro interruptor controla a primeira lâmpada.
        //                Se a lâmpada conectada ao segundo interruptor estiver acesa e as outras duas estiverem apagadas, então o segundo interruptor controla a segunda lâmpada.
        //                Se a lâmpada conectada ao terceiro interruptor estiver acesa e as outras duas estiverem apagadas, então o terceiro interruptor controla a terceira lâmpada.
        //                Segunda visita:
        //
        //        Retorne à sala das lâmpadas.
        //                Verifique qual lâmpada está acesa.
        //        Com base na primeira visita e na lâmpada que está acesa na segunda visita, você pode determinar qual interruptor controla cada lâmpada.
        //
        //                Se a lâmpada conectada ao primeiro interruptor estava acesa na segunda visita, então o primeiro interruptor controla a primeira lâmpada.
        //                Se a lâmpada conectada ao segundo interruptor estava acesa na segunda visita, então o segundo interruptor controla a segunda lâmpada.
        //                Se a lâmpada conectada ao terceiro interruptor estava acesa na segunda visita, então o terceiro interruptor controla a terceira lâmpada.
        //                Dessa forma, usando apenas duas visitas à sala das lâmpadas, é possível determinar qual interruptor controla cada lâmpada.


        //        5) Escreva um programa que inverta os caracteres de um string.
        //
        //
        //        IMPORTANTE:
        //
        //        a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
        //
        //        b) Evite usar funções prontas, como, por exemplo, reverse;
        //        Assim como o numero 2  o metodo esta em outra classe "InverterString"  para evitar poluição de codigo.

        String original = "abcdefg";
        String invertida = inverterString(original);
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);

    }

}
