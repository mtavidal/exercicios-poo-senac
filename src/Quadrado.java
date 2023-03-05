public class Quadrado extends FormaGeometrica2D{

    public Quadrado(int x, int y){
        super.x = x;
        super.y = y;
    }
    @Override
    public double calcularArea() {
        return x * y;
    }

    @Override
    public String toString() {
        return "Quadrado " + super.toString();
    }
}
