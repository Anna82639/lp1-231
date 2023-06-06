package semana14;

public class Programa {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(10.0);   // (antes do = nome de variável)
        //quadrado.lado = 10.0;

        // quadrado.lado = 5.6;
        quadrado.setLado (5.6);

        System.out.println(quadrado.calcularArea());
        System.out.println(quadrado.calcularPerimetro());

        Retangulo r1 = new Retangulo (10.0, 5.0);
        Retangulo r2 = new Retangulo (15.0, 3.5);
        
        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro());
        System.out.println(r2.calcularArea());
        System.out.println(r2.calcularPerimetro());
        

    }
    
}
