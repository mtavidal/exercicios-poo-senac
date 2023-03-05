public class Cone extends FormaGeometrica3D {
    private final Circulo circulo;
    public Cone(int raio, int altura){
        super.x = raio;
        super.y = altura;
        this.circulo = new Circulo(raio);
    }
    @Override
    public double calcularVolume() {
        return (circulo.calcularArea())*y/3;
    }

    @Override
    public String toString() {
        return "Cone " + super.toString();
    }
}

