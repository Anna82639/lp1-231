package semana11;

public class Aquario {
    public double comprimento;
    public double altura;
    public double largura; 
   
 
public double calcularVolume () {

    return (comprimento*altura*largura)/1000;
}

public double calcularPotenciaDoTermostato(double temperaturaDesejada, double temperaturaAmbiente){
    return (calcularVolume() 0.05 (temperaturaAmbiente - temperaturaDesejada));

}

public double calcularQuantidadeLitrosFiltros() {
    double filtragem = calcularVolume() * 2;
    return filtragem; 
}






}