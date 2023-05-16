package semana05;

public class Ex01 {
    public class public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor do comprimento de seu aquario:");
        double comprimento = sc.nextDouble();

        System.out.println("Entre com o valor da largura de seu aquário: ");
        double largura = sc.nextDouble();

        System.out.println("Entre com o valor da altura de seu aquário: ");
        double altura = sc.nextDouble();

        double volume = (comprimento*altura*largura)/1000;

        System.out.println("O valor do volume de seu aquário em litros é: " + volume);

        System.out.println("Insira a temperatura ambiente do local onde está seu aquário: ");
        double temperatura_ambiente = sc.nextDouble();

        System.out.println("Insira a temperatura que você deseja para seu aquário: ");
        double temperatura_desejada = sc.nextDouble();
        sc.close();

        double potencia = volume*0.05*(temperatura_desejada-temperatura_ambiente);
        System.out.println("A potência necessária do seu termostato para manter a temperatura adequada de seu aquário é " + potencia);



    }
}