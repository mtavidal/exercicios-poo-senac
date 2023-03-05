public class Ortoedro extends FormaGeometrica3D {
    private final Retangulo retangulo;
    public Ortoedro (int x, int y, int z){
        super.x = x;
        super.y = y;
        super.z = z;
        this.retangulo = new Retangulo(x,y);
    }
    @Override
    public double calcularVolume() {
        return ((retangulo.calcularArea()) * z);
    }

    @Override
    public String toString() {
        return "Ortoedro " + super.toString();
    }
}
