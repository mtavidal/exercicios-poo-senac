public class Retangulo extends FormaGeometrica2D{

    public Retangulo(int x, int y){
        super.x = x;
        super.y = y;
    }
    @Override
    public double calcularArea() {
        return x * y;
    }

    @Override
    public String toString() {
        return "Retangulo " + super.toString();
    }
}
