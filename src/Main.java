import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<FormaGeometrica2D> lista2D = List.of(new Circulo(5), new Quadrado(4,3), new Triangulo(6,3), new Retangulo(8,9));
        AcoesFormas<FormaGeometrica2D> acoesFormas2d = new AcoesFormas2dImpl();
        lista2D.stream().forEach(formaGeometrica2D -> {
            System.out.println(formaGeometrica2D);
            acoesFormas2d.escala(formaGeometrica2D);
            acoesFormas2d.rotacao(formaGeometrica2D);
            acoesFormas2d.translacao(formaGeometrica2D);
        });

        List<FormaGeometrica3D> lista3D = List.of(new Cubo(4, 8, 10), new Cone(5,11), new Esfera(7), new Ortoedro(5, 4, 8), new Piramide(2, 3, 12));
        AcoesFormas<FormaGeometrica3D> acoesFormas3d = new AcoesFormas3dImpl();
        lista3D.stream().forEach(formaGeometrica3D -> {
            System.out.println(formaGeometrica3D);
            acoesFormas3d.escala(formaGeometrica3D);
            acoesFormas3d.rotacao(formaGeometrica3D);
            acoesFormas3d.translacao(formaGeometrica3D);
        });

    }
}