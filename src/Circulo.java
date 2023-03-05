public class Circulo extends FormaGeometrica2D {
    public Circulo(int raio){
        super.x = raio;
    }
    @Override
    public double calcularArea() {
        return Math.PI*(x*x);
    }

    @Override
    public String toString() {
        return "Circulo " + super.toString();
    }
}
