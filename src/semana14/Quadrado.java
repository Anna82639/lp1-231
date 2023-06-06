package semana14;

public class Quadrado {
    public double lado;

    public Quadrado(double lado) {
        this.setLado (lado);
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
    
    //public TIPO ATRIBUTO getNOME_DO_ATRIBUTO () {
    //return ATRIBUTO; 
    // }

    public double getLado() {
        return lado;
    }

    //public void setNOME_DO_ATRIBUTO (TIPO_ATRIBUTO NOME_DO_ATRIBUTO) {
    //  this.NOME_DO_ATRIBUTO = NOME_DO_ATRIBUTO; 
    // } 

    public void setLado(double lado) {
        if (lado <= 0.0) {
            throw new RuntimeException("Lado inválido");

        }
        this.lado = lado;
    
}
}




  




// Não preciso validar nada. Posso alterar os valores dos atributos do objeto após ele criado.
// atributo = public 
// sem set 
// sem get

// Não preciso validar nada. Não posso alterar os valores dos atributos dos objetos após ele criado.
// atributo = private 
// com get 
// sem set 

// Preciso validar os valores. Não posso alterar os valores dos atributos do objeto após ele criado.
// atributo = private 
// com get 
// com set e validação 