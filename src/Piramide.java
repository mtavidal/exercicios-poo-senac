public class Piramide extends FormaGeometrica3D {
    private final Quadrado quadrado;
    public Piramide (int x, int y, int z){
        super.x = x;
        super.y = y;
        super.z = z;
        this.quadrado = new Quadrado(x,y);
    }
    @Override
    public double calcularVolume() {
        return ((quadrado.calcularArea()) * z)/3;
    }

    @Override
    public String toString() {
        return "Pirâmide " + super.toString();
    }
}
