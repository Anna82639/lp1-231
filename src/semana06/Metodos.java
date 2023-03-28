package semana06;

public class Metodos {

   public static void main(String[] args) {
        System.out.println(Math.sqrt(25.0));
        imprimirPalavra("Olá mundo!");
        imprimirPalavra("testeTeste");

        double soma = somar (10.0, 2.3);
        System.out.println(soma);

        System.out.println(somar(3.3, 4.1)); 
   }
    // método que soma dois números e retorna o resultado 
    public static double somar(double n1, double n2){
        double soma = n1 + n2; 
        return soma; 
    }

    // Assinatura do método 
    // Public - acesso em qualquer parte do projeto 
    // Static - método atrelado a classe (não precisa criar um objeto)
    // Void - tipo de retorno (sem retorno)
    // imprimirPalavra - nome do método 
    // String palavra - parâmetro (pode ter zero ou muitos)
    // Definindo o método      

   public static void imprimirPalavra(String palavra) {
        System.out.println(palavra.toUpperCase());

   }
}
