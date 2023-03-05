public abstract class FormaGeometrica2D extends FormaGeometrica {

    public abstract double calcularArea ();

    @Override
    public String toString() {
        return "Área = " +calcularArea();
    }
}

