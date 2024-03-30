package main.java.com.example.test;
public class InverterString {
public static String inverterString(String str) {
    char[] caracteres = str.toCharArray();
    int inicio = 0;
    int fim = caracteres.length - 1;

    while (inicio < fim) {
        // Troca os caracteres de posição
        char temp = caracteres[inicio];
        caracteres[inicio] = caracteres[fim];
        caracteres[fim] = temp;

        // Move os índices de início e fim para o próximo par de caracteres
        inicio++;
        fim--;
    }

    // Constrói uma nova string com os caracteres invertidos
    return new String(caracteres);
}
}
