//Exercicio de IMC

package Exercicios.Cap2;


import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {

        double peso;
        double altura;
        double imc;
   
        Scanner input = new Scanner(System.in);
        System.out.print("Peso: ");
        peso = input.nextDouble();
        System.out.print("Altura: ");
        altura = input.nextDouble();

        altura = altura / 100;

        imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc > 18.5 & imc < 24.9) {
            System.out.println("Normal");
        } else if (imc > 25 & imc < 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
        System.out.printf("Seu IMC é: %.2f\n", imc);


    }
   
   
   
}
