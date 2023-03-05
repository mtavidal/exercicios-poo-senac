public class Triangulo extends FormaGeometrica2D{

    public Triangulo(int x, int y){
        super.x = x;
        super.y = y;
    }
    @Override
    public double calcularArea() {
        return (x * y)/2;
    }

    @Override
    public String toString() {
        return "Triângulo " + super.toString();
    }
}
