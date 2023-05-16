package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AquarioTest {

@Test
    public void testCalcularVolume() {

        Aquario aquario = new Aquario ();
        aquario.comprimento = 100.0;
        aquario.altura = 50.0;
        aquario.largura = 50.0;;

        double volume = aquario.calcularVolume();

        assertEquals(250.00, volume);
    }

    public void testCacularPotenciaDoTermostato() {

        Aquario potencia  = new Aquario ();
        potencia.temperatura_ambiente = 50.0;
        potencia.temperatura_desejada = 80.0;

        double potencia = potencia.

    }
}
 

