public class Esfera extends FormaGeometrica3D {
    public Esfera(int raio){
        super.x = raio;
    }
    @Override
    public double calcularVolume() {
        return (4*Math.PI*(x*x*x));
    }

    @Override
    public String toString() {
        return "Esfera " + super.toString();
    }
}
