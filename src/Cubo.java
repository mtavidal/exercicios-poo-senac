public class Cubo extends FormaGeometrica3D {
    private final Quadrado quadrado;
    public Cubo (int x, int y, int z){
        super.x = x;
        super.y = y;
        super.z = z;
        this.quadrado = new Quadrado(x,y);
    }
    @Override
    public double calcularVolume() {
        return ((quadrado.calcularArea()) * z);
    }
    @Override
    public String toString() {
        return "Cubo " + super.toString();
    }
}
