package semana06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTeste {

    @Test
    public void somaDoisNumerosPositivos() {
        // AAA
        // Arrange 
        double n1 = 10.0;
        double n2 = 2.0;
        
        // Act 
        double soma = Calculadora.somar(n1, n2);

        // Assert 
        assertEquals(12.0, soma);
    }

    
    @Test
    public void somaUmNumeroPositivoEUmNegativo() {

        double n1 = 10.0;
        double n2 = -2.0;
    
        double soma = Calculadora.somar(n1, n2);

        
        assertEquals(8.0, soma);
    }
    @Test
    public void somaDoisNumerosNegativos() {

        double n1 = -10.0;
        double n2 = -2.0;
    
        double soma = Calculadora.somar(n1, n2);

        
        assertEquals(-12.0, soma);
    }
    @Test
    public void multiplicarDoisNumerosPositivos() {

        double n1 = 10.0;
        double n2 = 2.0;
    
        double soma = Calculadora.multiplicar(n1, n2);

        
        assertEquals(20.0, soma);
    }
    @Test
    public void multiplicarDoisNumerosNegativos() {

        double n1 = -10.0;
        double n2 = -2.0;
    
        double soma = Calculadora.multiplicar(n1, n2);

        
        assertEquals(20.0, soma);
    }
    @Test
    public void dividrDoisNumerosPositivos() {

        double n1 = 10.0;
        double n2 = 2.0;
    
        double soma = Calculadora.dividir(n1, n2);

        
        assertEquals(5.0, soma);
    }
}
