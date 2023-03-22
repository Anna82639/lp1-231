package semana04;

import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro numero inteiro: ");
        double primeiro = sc.nextDouble(); 

        System.out.println("Insira o segundo numero inteiro: ");
        double segundo = sc.nextDouble(); 


        System.out.println("Insira o terceiro numero inteiro: ");
        double terceiro = sc.nextDouble(); 
        

        double mediaAritmetica = (primeiro+segundo+terceiro)/3;

        System.out.println("A media aritmetica dos numeros é: " + mediaAritmetica);

       

        
    }

}

