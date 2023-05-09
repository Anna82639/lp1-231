packpage semana05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
     System.out.println("Digite o seu peso em kg:");
     double peso = sc.nextDouble();
     System.out.println("Digite a sua altura em metros:");
    double altura = sc.nextDouble();

    double IMC = peso/(altura*altura);

     System.out.println("O seu IMC é:" + IMC);

         if (IMC<18.5) {
             System.out.println("Voce está abaixo do peso ideal");
         }

         if (IMC>= 1805 && IMC<=24.9) {
            System.out.println("Voce está no peso ideal");
         }

         if (IMC>=25.0 && IMC<=29.9) {
             System.out.println("Voce está com excesso de peso");
        }
         if (IMC>=30.0 && IMC<=34.9) {
            System.out.println("Voce está classificado como Obesidade de Classe 1");
         }

         if (IMC>=35.0 && IMC<=39.9) {
             System.out.println("Voce está classificado como Obesidade de Classe 2");
         }

         if (IMC>=40.0) {
             System.out.println("Voce está classificado como Obesidade de Classe 3");
         }


     double pesoIdeal = 24.9 * (altura*altura);
     double pesoPerder = peso - pesoIdeal;

     System.out.println("Voce precisa perder, em kg:" + pesoPerder);

     }
 }
	

    
