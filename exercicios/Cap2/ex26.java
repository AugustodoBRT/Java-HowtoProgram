package Exercicios.Cap2;

/* Escreva declarações, instruções ou comentários que realizem cada uma das tarefas a seguir: 
a) Declare que um programa calculará o produto de três inteiros. 
b) Crie um Scanner chamado input que leia valores a partir da entrada padrão. 
c) Declare as variáveis x, y, z e result como tipo int. 
d) Solicite que o usuário insira o primeiro inteiro. 
e) Leia o primeiro inteiro digitado pelo usuário e armazene-o na variável x. 
f) Solicite que o usuário insira o segundo inteiro. 
g) Leia o segundo inteiro digitado pelo usuário e armazene-o na variável y. 
h) Solicite que o usuário insira o terceiro inteiro. 
i) Leia o terceiro inteiro digitado pelo usuário e armazene-o na variável z. 
j) Compute o produto dos três inteiros contidos nas variáveis x, y e z e atribua o resultado à variável result. 
k) Use System.out.printf para exibir a mensagem “Product is” seguida pelo valor da variável result... */

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        int result;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
       
        x = input.nextInt();
        System.out.println("Insira o segundo número: ");
        y = input.nextInt();
        System.out.println("Insira o terceiro número: ");
        z = input.nextInt();
        result = x * y * z;
        System.out.println("Product is " + result );

    }
}