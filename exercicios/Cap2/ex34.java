/*(Calculadora de crescimento demográfico mundial) Utilize a internet para descobrir a população mundial atual e a taxa de cresci- mento demográfico mundial anual. Escreva um aplicativo que introduza esses valores e, então, que exiba a população mundial estimada depois de um, dois, três, quatro e cinco anos. */

package Exercicios.Cap2;

public class ex34 {
    public static void main(String[] args) {
        long population = 8231613070L;
        double taxaCrescimento = 1.0087;

        long P2026;
        long P2027;
        long P2028;
        long P2029;
        long P2030;

        P2026 = (long) (population * taxaCrescimento);
        P2027 = (long) (P2026 * taxaCrescimento);
        P2028 = (long) (P2027 * taxaCrescimento);
        P2029 = (long) (P2028 * taxaCrescimento);
        P2030 = (long) (P2029 * taxaCrescimento);

        System.out.println("População de 2025: " + population);
        System.out.println("População estimada de 2026: " + P2026 + " Diferença para o ano passado: " + (P2026 - population));
        System.out.println("População estimada de 2027: " + P2027 + " Diferença para o ano passado: " + (P2027 - P2026)) ;
        System.out.println("População estimada de 2028: " + P2028 + " Diferença para o ano passado: " + (P2028 - P2027));
        System.out.println("População estimada de 2029: " + P2029 + " Diferença para o ano passado: " + (P2029 - P2028));
        System.out.println("População estimada de 2030: " + P2030 + " Diferença para o ano passado: " + (P2030 - P2029));
    }
}
