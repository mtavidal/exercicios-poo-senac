public abstract class FormaGeometrica3D extends FormaGeometrica {
    protected int z;

    public abstract double calcularVolume();

    @Override
    public String toString() {
        return "Volume = " + calcularVolume();
    }
}
